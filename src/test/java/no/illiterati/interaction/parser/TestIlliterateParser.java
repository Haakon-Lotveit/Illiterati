package no.illiterati.interaction.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import no.stubs.model.ActorStub;
import no.stubs.model.TestWorld;

public class TestIlliterateParser {

	private static final String OBJECT_NAME = "TestObject";
	
	private static final String LOOK = "look";
	private static final String TAKE = "take";
	private static final String TALK = "talk";
	private static final String USE = "use";
	
	private static final String SPACE = " ";
	
	private TestWorld world;
	private IlliterateParser parser;
	
	@Before
	public void setUp() throws Exception {
		this.world = new TestWorld();
		world.addActor(new ActorStub(OBJECT_NAME, LOOK, TAKE, TALK, USE));
		this.parser = new IlliterateParser(world);
	}

	private void testExisting(String verb) {
		testHelper(verb, verb);
	}
	
	private void testHelper(String verb, String expected) {
		String line = verb + SPACE + OBJECT_NAME;
		String actual = parser.parseLine(line);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLook() {
		testExisting(LOOK);
	}
	
	@Test
	public void testTake() {
		testExisting(TAKE);
	}
	
	@Test
	public void testTalk() {
		testExisting(TALK);
	}
	
	@Test
	public void testUse() {
		testExisting(USE);
	}
	
	@Test
	public void testNonExistingVerb() {
		testHelper("INVALID_VERB", "I don't know what INVALID_VERB means. Sorry."); 
	}
	
	@Test
	public void testMissingInput() {
		testHelper("", "Do what with the what now? You need at least two words!");
	}
	
	@Test
	public void testNoSuchObject() {
		String line = LOOK + SPACE + "free-lunch";
		String actual = parser.parseLine(line);
		String expected = "There's no thing called \"free-lunch\".";
		
		assertEquals(expected, actual);
	}
	
	

}
