package misterx.local.domain;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel {

	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
	
	public Station test(int i) {
		return sv.getStationByIndex(i);
	}
	
	public void spielerHinzuf�gen(Spieler neuerspieler) throws SpielerExistiertBereitsException { 
		 spielerVW.spielerHinzuf�gen(neuerspieler);
	}

	public Station getStationByIndex(int index){
		return sv.getStationByIndex(index);
	}
}

