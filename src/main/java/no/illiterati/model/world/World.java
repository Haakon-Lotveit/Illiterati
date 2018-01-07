package no.illiterati.model.world;

import java.util.Collection;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.player.Player;
import no.illiterati.model.scene.Scene;

/**
 * This represents the entire global game-state.
 * All of it. And your little dog, too!
 */
public interface World {
	public Collection<Scene> allScenes();
	public Collection<Actor> allActors();
	public Player player();
}
