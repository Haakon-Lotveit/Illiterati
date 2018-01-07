package no.illiterati.model.player;

import java.util.Collection;

import no.illiterati.model.actor.Actor;

public interface Player {
	public String go();
	public String where();
	public Collection<Actor> inventory();
	public String lookInventory();
}
