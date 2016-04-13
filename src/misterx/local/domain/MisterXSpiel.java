package misterx.local.domain;

import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel {

	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
	
	public Station test(int i) {
		return sv.getStationByIndex(i);
	}
	
	public Spieler spielerHinzufügen(String name) {
		return spielerVW.spielerHinzufügen(name);
	}
}
