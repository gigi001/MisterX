package misterx.local.domain;

import java.util.Iterator;
import java.util.List;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel {

	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
	private Spiellogik logik = new Spiellogik();
		
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
	
	
	public int getRunde() {
		return logik.getRunde();
	}
	
	public int getNaechsteRunde() {
		return logik.getNaechsteRunde();
	}
	
	
	public int getGewonnen() {
		return logik.getGewonnen();
	}
	
	public int getXWin(Spieler spieler, Spieler misterx) {
		return logik.getXWin(spieler, misterx);
	}
	
	
	public boolean getZeigen() {
		return logik.getZeigen();
	}

	
	public void taxiAbziehen(Spieler spieler, Spieler misterx){
		logik.taxiAbziehen(spieler, misterx);
	}
	
	public void busAbziehen(Spieler spieler, Spieler misterx){
		logik.busAbziehen(spieler, misterx);
	}
	
	public void bahnAbziehen(Spieler spieler, Spieler misterx){
		logik.bahnAbziehen(spieler, misterx);
	}
	
	
	public void taxiFahren(Iterator<Station> nachbTaxiIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) {
		logik.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l);
	}
	
	public void busFahren(Iterator<Station> nachbBusIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) {
		logik.busFahren(nachbBusIterator, stationsausw, spieler, misterx, l);
	}
	
	public void bahnFahren(Iterator<Station> nachbBahnIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) {
		logik.bahnFahren(nachbBahnIterator, stationsausw, spieler, misterx, l);
	}
	
	
}

