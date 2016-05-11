package misterx.local.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class FilePersistenceManager implements PersistenceManager{

	private BufferedReader reader = null;
	private PrintWriter writer = null;
	
	@Override
	public void openForReading(String datenquelle) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(datenquelle));
	}

	@Override
	public void openForWriting(String datenquelle) throws IOException{
		writer = new PrintWriter(new BufferedWriter(new FileWriter(datenquelle)));
	}

	@Override
	public boolean close() {
		if (writer != null)
			writer.close();
		
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				return false;
			}
		}
		return true;
	}

	@Override
	public Station ladeStation() throws IOException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spieler ladeSpieler() throws IOException {
		
		String titel = liesZeile();
		if (titel == null) {
			// keine Daten mehr vorhanden
			return null;
		}

		String name = liesZeile();
		
		return new Spieler(name);
	}
	

	@Override
	public boolean speichereSpieler(Spieler s) throws IOException{

		schreibeZeile(s.getName());

		return true;
	}
	
	
	private String liesZeile() throws IOException {
		if (reader != null)
			return reader.readLine();
		else
			return "";
	}

	private void schreibeZeile(String daten) {
		if (writer != null)
			writer.println(daten);
	}

}
