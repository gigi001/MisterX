package misterx.local.domain;

import java.util.Iterator;
import java.util.List;

import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class Spiellogik {

	private int runde = 0;
	private int gewonnen = 0;
	private boolean zeigen = false;
private String letzterXZug = null;
	

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

	public int getXWin(List<Spieler> spieler, Spieler misterx) {
		for(int i=0; i<spieler.size();i++){
			if(getRunde()>23){
				return gewonnen = 1;
			}else if(spieler.get(i).getStandort() == misterx.getStandort() && spieler.get(i).getName() != misterx.getName()){
				return gewonnen = 2;
			}
		}
		return gewonnen = 0;
	}
	
	
	public boolean getZeigen() {
		if(getRunde() == 3 || getRunde() == 8 || getRunde() == 13 || getRunde() == 18 || getRunde() == 24){
			zeigen = true;
		}else{
			zeigen = false;
		}
		
		return zeigen;
	}

	public void taxiAbziehen(Spieler spieler, MisterX misterx) {
		spieler.setTaxiChips(spieler.getTaxiChips()-1);
		if(spieler instanceof MisterX){
			misterx.setTaxiChips(misterx.getTaxiChips()+1);
		}else{
			setLetzterXZug("Taxi");
		}
	}
	
	public void busAbziehen(Spieler spieler, MisterX misterx) {
		spieler.setBusChips(spieler.getTaxiChips()-1);
		if(spieler instanceof MisterX){
			misterx.setBusChips(misterx.getBusChips()+1);
		}else{
			setLetzterXZug("Bus");
		}
	}

	public void bahnAbziehen(Spieler spieler, MisterX misterx) {
		spieler.setBahnChips(spieler.getBahnChips()-1);
		if(spieler instanceof MisterX){
			misterx.setBahnChips(misterx.getBahnChips()+1);
		}else{
			setLetzterXZug("Bahn");
		}
	}
	
	public void blackAbziehen(MisterX misterx) {
		misterx.setBlackTickets(misterx.getBlackTickets()-1);
		setLetzterXZug("Black Ticket");
	}
	
	public void doppelAbziehen(MisterX misterx) {
		misterx.setDoubleChips(misterx.getDoubleChips()-1);
		getNaechsteRunde();
	}
	
	/*
	public void taxiFahren(Iterator<Station> nachbTaxiIterator, String stationsausw, Spieler spieler, Spieler misterx, int l, int sonderchips) {
		if(l+1==Integer.parseInt(stationsausw)){
			spieler.setStandort(nachbTaxiIterator.next());
			System.out.println(sonderchips);
			if(sonderchips == 2 || sonderchips == 4){
				blackAbziehen((MisterX) misterx);
			}
			if(sonderchips == 3 || sonderchips == 4){
				doppelAbziehen(misterx);
			}
			if(sonderchips == 1 || sonderchips == 3){
				taxiAbziehen(spieler, misterx);
			}
		}else{
			nachbTaxiIterator.next();
		}
	} */
	public void taxiFahren(Station station, Spieler spieler, MisterX misterx, int sonderchips) {
		spieler.setStandort(station);
		//System.out.println(sonderchips);
		if(sonderchips == 2 || sonderchips == 4){
			blackAbziehen(misterx);
		}
		if(sonderchips == 3 || sonderchips == 4){
			doppelAbziehen(misterx);
		}
		if(sonderchips == 1 || sonderchips == 3){
			taxiAbziehen(spieler, misterx);
		}
	}
	
	public void busFahren(Station station, Spieler spieler, MisterX misterx, int sonderchips) {
		spieler.setStandort(station);
		if(sonderchips == 2 || sonderchips == 4){
			blackAbziehen(misterx);
		}
		if(sonderchips == 3 || sonderchips == 4){
			doppelAbziehen(misterx);
		}
		if(sonderchips == 1 || sonderchips == 3){
			busAbziehen(spieler, misterx);
		}
	}
	
	public void bahnFahren(Station station, Spieler spieler, MisterX misterx, int sonderchips) {
		spieler.setStandort(station);
		if(sonderchips == 2 || sonderchips == 4){
			blackAbziehen((MisterX) misterx);
		}
		if(sonderchips == 3 || sonderchips == 4){
			doppelAbziehen((MisterX) misterx);
		}
		if(sonderchips == 1 || sonderchips == 3){
			bahnAbziehen(spieler, misterx);
		}
	}
	
	
	public String getLetzterXZug() {
		return letzterXZug;
	}
	
	public void setLetzterXZug(String letzterXZug){
		this.letzterXZug = letzterXZug;
	}
	
	
	
	/*
	 * - Spielzyklus (wer ist dran?)
	 * - von A nach B fahren (Spieler oder MisterX)
	 * 	 - ggf. Zugriff auf SpielerVerwaltung, um Chips zu prüfen / reduzieren
	 *   - prüfen, ob MisterX gefunden
	 * - Wann zeigt sich MisterX
	 */
}

