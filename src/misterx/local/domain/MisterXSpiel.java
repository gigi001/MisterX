package misterx.local.domain;

import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel {

	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
	
	public Station test(int i) {
		return sv.getStationByIndex(i);
	}
	
<<<<<<< HEAD

	public Spieler spielerHinzufuegen(String name) {
		return spielerVW.spielerHinzufuegen(name);
		
		}

	public void spielerHinzufuegen(Spieler neuerspieler) throws SpielerExistiertBereitsException { 
		 spielerVW.spielerHinzufuegen(neuerspieler);

=======
	public void spielerHinzufuegen(Spieler neuerspieler) throws SpielerExistiertBereitsException { 
		 spielerVW.spielerHinzufuegen(neuerspieler);
>>>>>>> refs/remotes/origin/Chris-workspace
	}
}
