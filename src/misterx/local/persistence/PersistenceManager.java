package misterx.local.persistence;

import java.io.IOException;
import java.util.List;

import misterx.local.domain.MisterXSpiel;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public interface PersistenceManager {
	
	
	public void openForReading(String datenquelle) throws IOException;
	
	public void openForWriting(String datenquelle) throws IOException;
	
	public boolean close();
		
	public MisterXSpiel ladeSpiel(String datenQuelle) throws IOException;
	
	public void  speichereSpiel(MisterXSpiel s, String datenQuelle) throws IOException;

	
}
