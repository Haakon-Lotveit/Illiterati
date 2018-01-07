package no.illiterati.model.scene;

import java.util.Collection;

public interface Scene {
	/**
	 * Beskriver scenen i eventyret, med alle tingene i scenen
	 */
	public String describeAll();
	
	/** Beskriver scenen, uten å beskrive alle tingene i den. */
	public String describeSelf();
	
	/** Gir en liste av alle aktører i scenen */
	public Collection<Actor> actors();
}
