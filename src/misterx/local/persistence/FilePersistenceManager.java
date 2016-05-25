package misterx.local.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import misterx.local.valueobjekts.MisterX;
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
	public Spieler ladeSpieler(List<Station> stationen) throws IOException {
		
		String sClass = liesZeile();
		if (sClass == null) {
			// keine Daten mehr vorhanden
			return null;
		}

		String name = liesZeile();
		if (name== null) {
			// keine Daten mehr vorhanden
			return null;
		}
		String standort = liesZeile();
		if (standort == null) {
			// keine Daten mehr vorhanden
			return null;
		}
		
		// TODO: Aus Standortname das richtige Stationsoobjekt ermitteln
		// über Stationsliste iterieren und Namen vergleichen
		
		String blackTickets = "";
		String doubleChips ="";
		if(sClass.equals("MisterX")){
			blackTickets= liesZeile();
			if (blackTickets== null) {
				// keine Daten mehr vorhanden
				return null;
			}
			doubleChips= liesZeile();
			if (doubleChips== null) {
				// keine Daten mehr vorhanden
				return null;
			}
		}
		String bahnChips= liesZeile();
		if (bahnChips== null) {
			// keine Daten mehr vorhanden
			return null;
		}

		
		
		
		String busChips= liesZeile();
		if (busChips== null) {
			// keine Daten mehr vorhanden
			return null;
		}
		String taxiChips= liesZeile();
		if ( taxiChips== null) {
			// keine Daten mehr vorhanden
			return null;
		}
		
		
		if(sClass.equals("MisterX")){
			return new MisterX(name,Integer.parseInt(blackTickets),Integer.parseInt(doubleChips),Integer.parseInt(taxiChips),Integer.parseInt(bahnChips),Integer.parseInt(busChips));
		}
		return new Spieler(name,Integer.parseInt(taxiChips),Integer.parseInt(bahnChips),Integer.parseInt(busChips));
	}
	

	@Override
	public boolean speichereSpieler(Spieler s) throws IOException{
		String sClass = s.getClass().getName();
		schreibeZeile(sClass);
		schreibeZeile(s.getName());
		schreibeZeile(s.getStandort().getName());
		if (s instanceof MisterX){
			schreibeZeile(((MisterX) s).getBlackTickets()+"");
			schreibeZeile(((MisterX) s).getDoubleChips()+"");
		}
		
		
		
		schreibeZeile(s.getBahnChips()+"");
		
		schreibeZeile(s.getBusChips()+"");
		schreibeZeile(s.getTaxiChips()+"");
		
		
		

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
