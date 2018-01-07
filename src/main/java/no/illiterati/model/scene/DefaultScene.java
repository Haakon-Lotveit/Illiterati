package no.illiterati.model.scene;

import java.util.Collection;
import java.util.LinkedList;

import no.illiterati.model.actor.Actor;

public class DefaultScene implements Scene{
	
	private Collection<Actor> actors = new LinkedList<Actor>();

	@Override
	public String describeSelf() {
		String description = "The room is quite unremarkable.";
		return description;
	}

	@Override
	public Collection<Actor> actors() {
		return actors;
	}

}
