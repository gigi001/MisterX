package misterx.local.domain;

import java.util.Iterator;

import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class Spiellogik {

	private int runde = 0;
	private int gewonnen = 0;
	private boolean zeigen = false;
	

	public int getRunde() {
		return runde;
	}
	
	public int getNaechsteRunde() {
		runde++;
		return runde;
	}

	
	public int getGewonnen() {
		return gewonnen;
	}

	public int getXWin(Spieler spieler, Spieler misterx) {
		if(getRunde()>23){
			return gewonnen = 1;
		}else if(spieler.getStandort() == misterx.getStandort() && spieler.getName()!= misterx.getName()){
			return gewonnen = 2;
		}else{
			return gewonnen = 0;
		}
	}
	
	public boolean getZeigen() {
		if(getRunde() == 3 || getRunde() == 8 || getRunde() == 13 || getRunde() == 18 || getRunde() == 24){
			zeigen = true;
		}else{
			zeigen = false;
		}
		
		return zeigen;
	}

	public void taxiAbziehen(Spieler spieler, Spieler misterx) {
		spieler.setTaxiChips(spieler.getTaxiChips()-1);
		if(spieler.getName()!=misterx.getName()){
			misterx.setTaxiChips(misterx.getTaxiChips()+1);
		}
	}
	
	public void busAbziehen(Spieler spieler, Spieler misterx) {
		spieler.setBusChips(spieler.getTaxiChips()-1);
		if(spieler.getName()!=misterx.getName()){
			misterx.setBusChips(misterx.getBusChips()+1);
		}
	}

	public void bahnAbziehen(Spieler spieler, Spieler misterx) {
		spieler.setBahnChips(spieler.getBahnChips()-1);
		if(spieler.getName()!=misterx.getName()){
			misterx.setBahnChips(misterx.getBahnChips()+1);
		}
	}
	
	
	public void taxiFahren(Iterator<Station> nachbTaxiIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) {
		if(l+1==Integer.parseInt(stationsausw)){
			spieler.setStandort(nachbTaxiIterator.next());
			taxiAbziehen(spieler, misterx);
		}else{
			nachbTaxiIterator.next();
		}
	}
	
	public void busFahren(Iterator<Station> nachbBusIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) {
		if(l+1==Integer.parseInt(stationsausw)){
			spieler.setStandort(nachbBusIterator.next());
			busAbziehen(spieler, misterx);
		}else{
			nachbBusIterator.next();
		}
	}
	
	public void bahnFahren(Iterator<Station> nachbBahnIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) {
		if(l+1==Integer.parseInt(stationsausw)){
			spieler.setStandort(nachbBahnIterator.next());
			bahnAbziehen(spieler, misterx);
		}else{
			nachbBahnIterator.next();
		}
	}
	
	
	
	/*
	 * - Spielzyklus (wer ist dran?)
	 * - von A nach B fahren (Spieler oder MisterX)
	 * 	 - ggf. Zugriff auf SpielerVerwaltung, um Chips zu prüfen / reduzieren
	 *   - prüfen, ob MisterX gefunden
	 * - Wann zeigt sich MisterX
	 */
}

