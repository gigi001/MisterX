package misterx.local.domain;

import java.util.List;
import java.util.Vector;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class SpielerVerw {

	List<Spieler> mitspieler;
	

	public SpielerVerw() {
		this.mitspieler = new Vector<Spieler>();
	}
	

	public Spieler getSpielerByIndex(int index){
		Spieler spieler = mitspieler.get(index);
		return spieler;
	}
	
	
	public int getSize(){
		return mitspieler.size();
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
<<<<<<< HEAD
	
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
	
=======
		
>>>>>>> origin/master
	
	
}