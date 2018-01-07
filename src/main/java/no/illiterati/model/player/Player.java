package no.illiterati.model.player;

import java.util.Collection;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.scene.Scene;

public interface Player {
	public String go(Scene location);
	public Scene where();
	public Collection<Actor> inventory();
}
