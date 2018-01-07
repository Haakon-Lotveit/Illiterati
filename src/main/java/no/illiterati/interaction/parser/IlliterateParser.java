package no.illiterati.interaction.parser;

import java.util.function.Function;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.world.World;

public class IlliterateParser {
	
	private final World gameWorld;
	
	public IlliterateParser(World gameWorld) { 
		this.gameWorld = gameWorld;
	}
	
	/**
	 * This parses a line of input from the player, and if it all makes sense, it tries to enact the players will onto the game world.
	 * @param line The line the player entered.
	 * @return a string containing the world's response from attempting such actions.
	 */
	public String parseLine(String line) {
		String[] tokens = line.split("\\ws+");
		
		if(tokens.length < 2) {
			return "Do what with the what now? You need at least two words!";
		}
		
		String verbToken = tokens[0];
		Verb verb = Verb.fromWord(verbToken);
		if(verb == Verb.ERROR) {
			return String.format("I don't know what %s means. Sorry%n", verbToken);
		}
		
		String nounToken = tokens[1];
		Actor noun = getNoun(nounToken);
		
		if(noun == NO_OBJECT) {
			return "There's no such thing as a " + nounToken;
		}
		
		return verb.apply(noun);
		
	}
	
	private Actor getNoun(String token) {
		for(Actor a : gameWorld.player().inventory()) {
			if(a.name().equalsIgnoreCase(token)) {
				return a;
			}
		}
		
		for(Actor a : gameWorld.allActors()) {
			if(a.name().equalsIgnoreCase(token)) {
				return a;
			}
		}
		
		return NO_OBJECT;
	}
	
	enum Verb {
		USE("USE", Actor::use), TALK("TALK", Actor::talkTo), LOOK("LOOK", Actor::lookAt), TAKE("TAKE", Actor::pickUp), ERROR("", a -> "" );
		
		private final String word;
		private final Function<Actor, String> action;
		
		Verb(String word, Function<Actor, String> action) {
			this.word = word;
			this.action = action;
		}
		
		public String getWord() { return word; }
		public String apply(Actor actor) {
			return action.apply(actor);
		}
		
		public static Verb fromWord(String word) {
			for(Verb v : Verb.values()) {
				if(word.equalsIgnoreCase(v.getWord())) {
					return v;
				}
			}
			
			return ERROR;
		}
	}
	
	private final static Actor NO_OBJECT = new Actor() {
		
		public String use() {
			return "";
		}
		
		public String talkTo() {
			return use();
		}
		
		public String pickUp() {
			return talkTo();
		}
		
		public String name() {
			return "NO OBJECT";
		}
		
		public String lookAt() {
			return pickUp();
		}
	};
}
