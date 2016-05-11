package misterx.local.persistence;

import misterx.local.valueobjekts.Spieler;

public interface PersistenceManager {
	
	
	public void openForReading(String datenquelle);
	
	public void openForWriting(String datenquelle);
	
	public boolean close();
	
	public Spieler ladeSpieler();
	
	public boolean speichereSpieler(Spieler s);
	
}
