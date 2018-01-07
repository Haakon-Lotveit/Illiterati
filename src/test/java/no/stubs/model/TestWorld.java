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
		Player player = new TestPlayer();
	}
	
	@Override
	public Collection<Scene> allScenes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Actor> allActors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player player() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
