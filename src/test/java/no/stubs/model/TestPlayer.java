package no.stubs.model;

import java.util.Collection;
import java.util.Collections;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.player.Player;
import no.illiterati.model.scene.Scene;

public class TestPlayer implements Player {

	@Override
	public String go(Scene location) {
		return null;
	}

	@Override
	public Scene where() {
		return null;
	}

	@Override
	public Collection<Actor> inventory() {
		return Collections.emptyList();
	}


}
