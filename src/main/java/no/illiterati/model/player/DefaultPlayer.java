package no.illiterati.model.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.scene.Scene;

public class DefaultPlayer implements Player {
	private Scene location = null;
	private Collection<Actor> inventory = new LinkedList<Actor>();

	public DefaultPlayer(Scene scene) {
		Objects.requireNonNull(scene, "Scene cannot be null.");
		this.location = scene;
	}
	
	/**
	 * Tar imot en scene, flytter spilleren til scenen og returnerer en beskrivelse av scenen.
	 */
	@Override
	public String go(Scene location) {
		Objects.requireNonNull(location, "Location cannot be null.");
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
		return new ArrayList<>(inventory);
	}

}
