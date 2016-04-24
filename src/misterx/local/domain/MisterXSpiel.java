package misterx.local.domain;

import java.util.List;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel {

	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
		
	public void spielerHinzufügen(Spieler neuerspieler) throws SpielerExistiertBereitsException { 
		 spielerVW.spielerHinzufügen(neuerspieler);
	}
	
	public List<Spieler> getSpieler(){
		return spielerVW.getMitspieler();
	}
	
	public Spieler getSpielerByIndex(int index){
		return spielerVW.getSpielerByIndex(index);
	}
	
	
	public int getLength(){
		return spielerVW.getSize();
	}

	public Station getStationByIndex(int index){
		return sv.getStationByIndex(index);
	}
}

