package no.illiterati.interaction.parser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import no.illiterati.model.world.World;

public class TestIlliterateParser {

	private World world;
	private IlliterateParser parser;
	
	@Before
	public void setUp() throws Exception {
		this.world = new TestWorld();
		
	}

	@Test
	public void testParseLine() {
		fail("Not yet implemented");
	}

}
