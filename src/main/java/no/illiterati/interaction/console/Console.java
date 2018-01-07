package no.illiterati.interaction.console;

import java.util.Scanner;

import no.illiterati.interaction.parser.IlliterateParser;
import no.illiterati.model.world.World;

public class Console {
	
	public void run(World world) {
		Scanner in = new Scanner(System.in);
		IlliterateParser parser = new IlliterateParser(world);
		while(true) {
			String input = in.nextLine();
			String output = parser.parseLine(input);
			System.out.println(output);
		}
	}
	
}
