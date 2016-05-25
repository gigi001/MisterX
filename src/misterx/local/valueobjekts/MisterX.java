package misterx.local.valueobjekts;

public class MisterX extends Spieler  {

	protected int blackTickets;
	protected int doubleChips;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5077729389860276661L;

	public MisterX(String name) {
		super(name);
		blackTickets = 5;
		doubleChips = 2;
	}
	public MisterX(String name,int blackTickets, int doubleChips, int taxiChips, int bahnChips, int busChips) {
		super(name,taxiChips,busChips, bahnChips);
		this.blackTickets = blackTickets;
		this.doubleChips = doubleChips;
	
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
	

}