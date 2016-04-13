package misterx.local.valueobjekts;

import java.util.HashSet;
import java.util.Set;

public class Station {
	
	private String name;
	private String typ; // ggf. als Aufz‰hlung / Enumeration
	private Set<Station> uBahnNachbarn = new HashSet<Station>();
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
	
	public Set<Station> getNachbarn() {
		return uBahnNachbarn;
	}

	public void setNachbarn(Set<Station> nachbarn) {
		this.uBahnNachbarn = nachbarn;
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
		return "Diese Station heiﬂt " + name;	
	}

	public Set<Station> getBusNachbarn() {
		return busNachbarn;
	}

	public void setBusNachbarn(Set<Station> busNachbarn) {
		this.busNachbarn = busNachbarn;
	}
	
}
