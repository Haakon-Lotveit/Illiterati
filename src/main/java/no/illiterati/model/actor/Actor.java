package no.illiterati.model.actor;

/**
 * An actor is any entity in a scene that can be interacted with in any way.
 * A carton of milk, a dude with a beard, a woman with a nose... they're all actors.
 */
public interface Actor {
	public String name();
	
	public String lookAt();
	public String pickUp();
	public String talkTo();
	public String use();
}
