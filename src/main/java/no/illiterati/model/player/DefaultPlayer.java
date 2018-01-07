package no.illiterati.model.player;

import java.util.Collection;
import java.util.LinkedList;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.scene.Scene;

public class DefaultPlayer implements Player {
	private Scene location = null;
	private Collection<Actor> inventory = new LinkedList<Actor>();

	/**
	 * Tar imot en scene, flytter spilleren til scenen og returnerer en beskrivelse av scenen.
	 */
	@Override
	public String go(Scene location) {
		this.location = location;
		return location.describeAll();
	}

	/**
	 * Returnerer scenen spilleren er i.
	 */
	@Override
	public Scene where() {
		return location;
	}

	/**
	 * Returnerer alle aktørene i spillerens inventory.
	 */
	@Override
	public Collection<Actor> inventory() {
		return inventory;
	}

}
