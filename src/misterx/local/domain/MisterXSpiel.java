package misterx.local.domain;

import java.util.Iterator;
import java.util.List;

import misterx.local.domain.exceptions.ChipsBestandException;
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
	
	public int getXWin(List<Spieler> spieler, Spieler misterx) {
		return logik.getXWin(spieler, misterx);
	}
	
	
	public boolean getZeigen() {
		return logik.getZeigen();
	}

	
	public void taxiAbziehen(Spieler spieler, Spieler misterx) throws ChipsBestandException{
		logik.taxiAbziehen(spieler, misterx);
	}
	
	public void busAbziehen(Spieler spieler, Spieler misterx) throws ChipsBestandException{
		logik.busAbziehen(spieler, misterx);
	}
	
	public void bahnAbziehen(Spieler spieler, Spieler misterx) throws ChipsBestandException{
		logik.bahnAbziehen(spieler, misterx);
	}
	
	
<<<<<<< HEAD
	public void taxiFahren(Iterator<Station> nachbTaxiIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) throws ChipsBestandException {
		logik.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l);
	}
	
	public void busFahren(Iterator<Station> nachbBusIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) throws ChipsBestandException {
		logik.busFahren(nachbBusIterator, stationsausw, spieler, misterx, l);
	}
	
	public void bahnFahren(Iterator<Station> nachbBahnIterator, String stationsausw, Spieler spieler, Spieler misterx, int l) throws ChipsBestandException {
		logik.bahnFahren(nachbBahnIterator, stationsausw, spieler, misterx, l);
=======
	public void taxiFahren(Iterator<Station> nachbTaxiIterator, String stationsausw, Spieler spieler, Spieler misterx, int l, String sonderchips) {
		logik.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l, Integer.parseInt(sonderchips));
	}
	
	public void busFahren(Iterator<Station> nachbBusIterator, String stationsausw, Spieler spieler, Spieler misterx, int l, String sonderchips) {
		logik.busFahren(nachbBusIterator, stationsausw, spieler, misterx, l, Integer.parseInt(sonderchips));
	}
	
	public void bahnFahren(Iterator<Station> nachbBahnIterator, String stationsausw, Spieler spieler, Spieler misterx, int l, String sonderchips) {
		logik.bahnFahren(nachbBahnIterator, stationsausw, spieler, misterx, l, Integer.parseInt(sonderchips));
>>>>>>> refs/remotes/origin/master
	}
	
	
	public String getLetzterXZug() {
		return logik.getLetzterXZug();
	}
	
	
}

