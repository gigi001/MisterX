package misterx.local.valueobjekts;



public class Spieler {

	protected String name;
	protected int taxiChips;
	protected int busChips;
	protected int bahnChips;
	protected int blackTickets;
	protected int doubleChips;
	protected Station standort;
    //private ArrayList <Integer> guthaben;
	
	public Spieler(String name) {
		this.name = name;
		taxiChips=3;
		busChips=2;
		bahnChips=3;
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

	
	
	public void setBlackTickets(int blackTickets){
		this.blackTickets = blackTickets;
	}
	
	public int getBlackTickets(){
		return blackTickets;
	}
	
	
	public void setDoubleChips(int doubleChips){
		this.doubleChips = doubleChips;
	}
	
	public int getDoubleChips(){
		return doubleChips;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals-Methode");
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
		return "Spieler " + name + " steht an der Station " + standort.getName() + ".";
	}
}
	