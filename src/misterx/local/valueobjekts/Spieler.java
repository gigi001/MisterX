package misterx.local.valueobjekts;



public class Spieler {

	private String name;
	private int taxiChips;
	private int busChips;
	private int bahnChips;
	private Station standort;
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

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals-Methode");
		if (obj instanceof Spieler) {
			Spieler andererSpieler = (Spieler) obj;
			return (name.equals(andererSpieler.getName()));
		}
		return false;
	}

	public Station getStandort() {
		return standort;
	}

	public void setStandort(Station standort) {
		this.standort = standort;
	}
	
	public String toString() {
		return "Spieler " + name + " steht an Station " + standort.getName() + ".";
	}
}
	