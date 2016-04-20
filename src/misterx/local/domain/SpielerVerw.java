package misterx.local.domain;

import java.util.List;
import java.util.Vector;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.Spieler;

public class SpielerVerw {

	List<Spieler> mitspieler;
	

	public SpielerVerw() {
		this.mitspieler = new Vector<Spieler>();
	}
	
	public void spielerHinzufügen(Spieler neuerSpieler ) throws SpielerExistiertBereitsException {
		// prüfen, ob Spieler mit Name schon vorhanden
		// --> SpielerExistiertBereitsException werfen
		if (mitspieler.contains(neuerSpieler)){
			throw new SpielerExistiertBereitsException(neuerSpieler);
		}
		mitspieler.add(neuerSpieler);	
	}
	
	// -> in Spiellogik verschieben
	public void chipsAbziehen(String typ, int spielernummer){
		
		switch (typ){
		case "bus":
			mitspieler.get(spielernummer).setBusChips(mitspieler.get(spielernummer).getBusChips()-1);
			break;
		case "bahn":
			mitspieler.get(spielernummer).setBahnChips(mitspieler.get(spielernummer).getBahnChips()-1);
			break;
		case "taxi":
			mitspieler.get(spielernummer).setTaxiChips(mitspieler.get(spielernummer).getTaxiChips()-1);
		
		}
		
	}
	
	
	
}