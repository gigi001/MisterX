package misterx.local.domain;

import java.awt.Point;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.persistence.PersistenceManager;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXSpiel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7820214001179855866L;
	private StadtVerw sv = new StadtVerw();
	private SpielerVerw spielerVW = new SpielerVerw();
	private Spiellogik logik = new Spiellogik();
	private int xnr = -1;
	private int farbe;
	private boolean blackTicketAktiv;
	private boolean zweimalTicketAktiv;
	private int sonderchips;
	private String[] kfz = new String[6];
	private int verkehrsmittel;
	private boolean spielbar = false;
	private int dran = -1;
	private int inRunden;
	private Spieler spieler;
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	private Point point5;
	private Point point6;
	private Point point7;
	private Point point8;
	//private PersistenceManager pm = new FilePersistenceManager();
	
//	private List<Spieler> SpielerStand = new Vector<Spieler>();
		
	public void setSp1Loc(Point point) {
		this.point1 = point;
	}
	public void setSp2Loc(Point point) {
		this.point2 = point;
	}
	public void setSp3Loc(Point point) {
		this.point3 = point;
	}
	public void setSp4Loc(Point point) {
		this.point4 = point;
	}
	public void setSp5Loc(Point point) {
		this.point5 = point;
	}
	public void setSp6Loc(Point point) {
		this.point6 = point;
	}
	public void setSp7Loc(Point point) {
		this.point7 = point;
	}
	public void setSp8Loc(Point point) {
		this.point8 = point;
	}
	
	public Point getSp1Loc() {
		return point1;
	}
	public Point getSp2Loc() {
		return point2;
	}
	public Point getSp3Loc() {
		return point3;
	}
	public Point getSp4Loc() {
		return point4;
	}
	public Point getSp5Loc() {
		return point5;
	}
	public Point getSp6Loc() {
		return point6;
	}
	public Point getSp7Loc() {
		return point7;
	}
	public Point getSp8Loc() {
		return point8;
	}
	
	
	
	
	public void setSpielSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
	
	public Spieler getSpielSpieler() {
		return spieler;
	}
	
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

	
	public void setFarbe(int farbe) {
		this.farbe = farbe;
	}
	
	public int getFarbe() {
		return farbe;
	}
	
	public void setAktb(boolean aktb) {
		this.blackTicketAktiv = aktb;
	}
	
	public void setAkt2(boolean akt2) {
		this.zweimalTicketAktiv = akt2;
	}
	
	public boolean getAktb() {
		return blackTicketAktiv;
	}
	
	public boolean getAkt2() {
		return zweimalTicketAktiv;
	}
	
	public void setSonderchips(int sonderchips) {
		this.sonderchips = sonderchips;
	}
	
	public int getSonderchips() {
		return sonderchips;
	}
	
	public void setKfz(String kfz, int l) {
		this.kfz[l] = kfz;
	}
	
	public String getKfz(int l) {
		return kfz[l];
	}
	
	public void setVerk(int verk) {
		this.verkehrsmittel = verk;
	}
	
	public int getVerk() {
		return verkehrsmittel;
	}
	
	public void setSpielbar(boolean spielbar) {
		this.spielbar = spielbar;
	}
	
	public boolean getSpielbar() {
		return spielbar;
	}
	
	public void setDran(int dran) {
		this.dran = dran;
	}
	
	public int getDran() {
		return dran;
	}
	
	public int getInRunden() {
		if(logik.getRunde() < 24) {
			inRunden = (24 - logik.getRunde());
		}
		if(logik.getRunde() < 18) {
			inRunden = (18 - logik.getRunde());
		}
		if(logik.getRunde() < 13) {
			inRunden = (13 - logik.getRunde());
		}
		if(logik.getRunde() < 8) {
			inRunden = (8 - logik.getRunde());
		}
		if(logik.getRunde() < 3) {
			inRunden = (3 - logik.getRunde());
		}
		
		return inRunden;
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
	public void taxiFahren(Station station, Spieler spieler, MisterX misterx) {
		logik.taxiFahren(station, spieler, misterx, getSonderchips());
	}
	
	public void busFahren(Station station, Spieler spieler, MisterX misterx) {
		logik.busFahren(station, spieler, misterx, getSonderchips());
	}
	
	public void bahnFahren(Station station, Spieler spieler, MisterX misterx) {
		logik.bahnFahren(station, spieler, misterx, getSonderchips());
	}
	
	
	public String getLetzterXZug() {
		return logik.getLetzterXZug();
	}

	public int getXnr() {
		return xnr;
	}

	public void setXnr(int xnr) {
		this.xnr = xnr;
	}
	
	
	
}