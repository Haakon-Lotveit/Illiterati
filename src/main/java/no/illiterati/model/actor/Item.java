package no.illiterati.model.actor;

public class Item implements Actor{
	String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public String lookAt() {
		String look = "You look at " + this.name + ".";
		return look;
	}

	@Override
	public String pickUp() {
		String take = "You pick up " + this.name + ".";
		return take;
	}

	@Override
	public String talkTo() {
		String talk = "You talk to " + this.name	+ ". It doesn't reply.";
		return talk;
	}

	@Override
	public String use() {
		String use = "You use " + this.name + ". It's not very useful.";
		return use;
	}

}
