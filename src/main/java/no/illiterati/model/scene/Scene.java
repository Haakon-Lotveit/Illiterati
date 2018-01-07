package no.illiterati.model.scene;

import java.util.Collection;

import no.illiterati.model.actor.Actor;

public interface Scene {
		
	/** Beskriver scenen */
	public String describeSelf();
	
	/** Gir en liste av alle aktører i scenen */
	public Collection<Actor> actors();
}
