package misterx.local.valueobjekts;

import java.util.ArrayList;

public class Spieler {

	private String name;
	private int taxiChips;
	private int busChips;
	private int bahnChips;
    //private ArrayList <Integer> guthaben;
	
	public Spieler(String name) {
		this.name = name;
		taxiChips=30;
		busChips=40;
		bahnChips=50;
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
	
	
	
	
	
	

