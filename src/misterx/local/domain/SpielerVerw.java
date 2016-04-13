package misterx.local.domain;

import java.util.List;
import java.util.Vector;

import misterx.local.valueobjekts.Spieler;

public class SpielerVerw {

	List<Spieler> mitspieler;

	public SpielerVerw() {
		this.mitspieler = new Vector<Spieler>();
	}
	
	public Spieler spielerHinzufügen(String name) {
		// prüfen, ob Spieler mit Name schon vorhanden
		// --> SpielerExistiertBereitsException werfen
		
		Spieler neuerSpieler = new Spieler(name);
		mitspieler.add(neuerSpieler);
		return neuerSpieler;
	}
}
