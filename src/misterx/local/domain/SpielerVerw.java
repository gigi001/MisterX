package misterx.local.domain;

import java.util.List;
import java.util.Vector;

import misterx.local.valueobjekts.Spieler;

public class SpielerVerw {

	List<Spieler> mitspieler;
	

	public SpielerVerw() {
		this.mitspieler = new Vector<Spieler>();
	}
	

	
	public List<Spieler> getMitspieler() {
		return mitspieler;
	}



	public void setMitspieler(List<Spieler> mitspieler) {
		this.mitspieler = mitspieler;
	}



	public void spielerHinzufügen(Spieler neuerSpieler ) throws SpielerExistiertBereitsException {
		// prüfen, ob Spieler mit Name schon vorhanden
		// --> SpielerExistiertBereitsException werfen
		if (mitspieler.contains(neuerSpieler)){
			throw new SpielerExistiertBereitsException(neuerSpieler);
		}
		mitspieler.add(neuerSpieler);	
	}
	
	public void chipsAbziehen(String typ, int anzahl, int spielernummer){
		
		switch (typ){
		case "bus":
			mitspieler.get(spielernummer).setBusChips(anzahl);
			break;
		case "bahn":
			mitspieler.get(spielernummer).setBahnChips(anzahl);
			break;
		case "taxi":
			mitspieler.get(spielernummer).setTaxiChips(anzahl);
		
		}
		
	}
	
	
	
}