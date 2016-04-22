package misterx.local.valueobjekts;

import java.util.HashSet;
import java.util.Set;

public class Station {
	
	private String name;
	//private String typ; // ggf. als Aufzählung / Enumeration
	private Set<Station> bahnNachbarn = new HashSet<Station>();
	private Set<Station> busNachbarn = new HashSet<Station>();
	private Set<Station> taxiNachbarn = new HashSet<Station>();
	
	
	public Set<Station> getTaxiNachbarn() {
		return taxiNachbarn;
	}

	public void setTaxiNachbarn(Set<Station> taxiNachbarn) {
		this.taxiNachbarn = taxiNachbarn;
	}
	
	public void addTaxiNachbar(Station taxiNachbar) {
		taxiNachbarn.add(taxiNachbar);
	}
	
	
	public Set<Station> getBahnNachbarn() {
		return bahnNachbarn;
	}

	public void setBahnNachbarn(Set<Station> bahnNachbarn) {
		this.bahnNachbarn = bahnNachbarn;
	}
	
	public void addBahnNachbarn(Station bahnNachbar) {
		bahnNachbarn.add(bahnNachbar);
	}
	
	
	public Set<Station> getBusNachbarn() {
		return busNachbarn;
	}

	public void setBusNachbarn(Set<Station> busNachbarn) {
		this.busNachbarn = busNachbarn;
	}
	
	public void addBusNachbar(Station busNachbar) {
		busNachbarn.add(busNachbar);
	}
	

	public Station(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		return "Station: " + name;	
	}

	
	
}