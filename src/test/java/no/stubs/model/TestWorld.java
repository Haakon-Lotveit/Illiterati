package no.stubs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import no.illiterati.model.actor.Actor;
import no.illiterati.model.player.Player;
import no.illiterati.model.scene.Scene;
import no.illiterati.model.world.World;

public class TestWorld implements World {

	List<Scene> scenes;
	List<Actor> actors;
	Player player;
	
	public TestWorld() {
		scenes = new ArrayList<>();
		actors = new ArrayList<>();
		this.player = new TestPlayer();
	}
	
	public void addScene(Scene scene) { 
		this.scenes.add(scene);
	}
	
	public void addActor(Actor actor) {
		this.actors.add(actor);
	}
	
	@Override
	public Collection<Scene> allScenes() {
		return scenes;
	}

	@Override
	public Collection<Actor> allActors() {
		return actors;
	}

	@Override
	public Player player() {
		return player;
	}
	
}
