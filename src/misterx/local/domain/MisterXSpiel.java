package misterx.local.domain;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.persistence.FilePersistenceManager;
import misterx.local.persistence.PersistenceManager;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel {

	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
	private Spiellogik logik = new Spiellogik();
	private PersistenceManager pm = new FilePersistenceManager();
	
//	private List<Spieler> SpielerStand = new Vector<Spieler>();
		
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

	
	public void taxiAbziehen(Spieler spieler, MisterX misterx){
		logik.taxiAbziehen(spieler, misterx);
	}
	
	public void busAbziehen(Spieler spieler, MisterX misterx){
		logik.busAbziehen(spieler, misterx);
	}
	
	public void bahnAbziehen(Spieler spieler, MisterX misterx){
		logik.bahnAbziehen(spieler, misterx);
	}
	
	
//	public void taxiFahren(Iterator<Station> nachbTaxiIterator, String stationsausw, Spieler spieler, Spieler misterx, int l, String sonderchips) {
//		logik.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l, Integer.parseInt(sonderchips));
//	}
	public void taxiFahren(Station station, Spieler spieler, MisterX misterx, String sonderchips) {
		logik.taxiFahren(station, spieler, misterx, Integer.parseInt(sonderchips));
	}
	
	public void busFahren(Station station, Spieler spieler, MisterX misterx, String sonderchips) {
		logik.busFahren(station, spieler, misterx, Integer.parseInt(sonderchips));
	}
	
	public void bahnFahren(Station station, Spieler spieler, MisterX misterx, String sonderchips) {
		logik.bahnFahren(station, spieler, misterx, Integer.parseInt(sonderchips));
	}
	
	
	public String getLetzterXZug() {
		return logik.getLetzterXZug();
	}
	
	
	public void speicher(String datei) throws IOException{
		pm.openForWriting(datei);
		Iterator<Spieler> it = spielerVW.getMitspieler().iterator();
		while (it.hasNext()) {
			Spieler s = it.next();
			pm.speichereSpieler(s);
		}
		pm.close();
	}
	
	public void lade() throws IOException{
		/*pm.openForReading(datei);
		Spieler einSpieler;
		do {
			// Spieler-Objekt einlesen
		einSpieler = pm.ladeSpieler(sv.meineStationen);
			if (einSpieler != null) {
				// Spieler in Liste einfügen
				try {
					einfuegen(einSpieler);
				} catch (SpielerExistiertBereitsException e1) {
					// Kann hier eigentlich nicht auftreten,
					// daher auch keine Fehlerbehandlung...
				}
			}
		} while (einSpieler != null);

		// Persistenz-Schnittstelle wieder schließen
		pm.close();*/
	}
	
	
}
