package no.stubs.model;

import java.util.Collection;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.player.Player;
import no.illiterati.model.scene.Scene;

public class TestPlayer implements Player {

	@Override
	public String go() {
		return "";
	}

	@Override
	public Scene where() {
		return null;
	}

	@Override
	public Collection<Actor> inventory() {
		return null;
	}

	@Override
	public String lookInventory() {
		return null;
	}

}
