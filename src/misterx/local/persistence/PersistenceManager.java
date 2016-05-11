package misterx.local.persistence;

import java.io.IOException;

import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public interface PersistenceManager {
	
	
	public void openForReading(String datenquelle) throws IOException;
	
	public void openForWriting(String datenquelle) throws IOException;
	
	public boolean close();
	
	public Station ladeStation() throws IOException;
	
	public Spieler ladeSpieler() throws IOException;
	
	public boolean speichereSpieler(Spieler s) throws IOException;
	
}
