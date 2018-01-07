package no.stubs.model;

import no.illiterati.model.actor.Actor;

public class ActorStub implements Actor {

	String name;
	String description;
	String pickUp;
	String talkTo;
	String use;
	
	
	public ActorStub(String name, String description, String pickup, String talkTo, String use) {
		this.name = name;
		this.description = description;
		this.pickUp = pickup;
		this.talkTo = talkTo;
		this.use = use;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String lookAt() {
		return description;
	}

	@Override
	public String pickUp() {
		return pickUp;
	}

	@Override
	public String talkTo() {
		return talkTo;
	}

	@Override
	public String use() {
		return use;
	}

}
