package misterx.local.valueobjekts;

import java.util.ArrayList;

public class Spieler {

	private String name;
	private int taxiChips;
	private int busChips;
	private int bahnChips;
    private ArrayList <Integer> guthaben;
	
	public Spieler(String name) {
		this.name = name;
		guthaben.add(taxiChips,30);// frage kann ich mit ArrayList die werte ändern ? so das es bei jeden spielzug ein chip abgezogen wird
		guthaben.add(busChips,40);
		guthaben.add(bahnChips, 50);
	}

	public void setTaxiChips(int taxiChips) {
		this.taxiChips = taxiChips;
	}

	public void setBusChips(int busChips) {
		this.busChips = busChips;
	}

	public void setBahnChips(int bahnChips) {
		this.bahnChips = bahnChips;
	}

	public String getName() {
		return name;
	}
	
	public int getTaxiChips(){
		return taxiChips;
	}
	
	public int getBusChips(){
		return busChips;
	}
	
	public int getBahnChips(){
		return bahnChips;
	}
	
	
		
		
		
	}
	
	
	
	
	
	

