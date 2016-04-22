package misterx.local.ui.cui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;

import misterx.local.domain.MisterXSpiel;
import misterx.local.domain.Spiellogik;
import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXClientCUI {

	private MisterXSpiel spiel = new MisterXSpiel();
	
	public void startMenue() throws IOException {
	
		String aktion = "";
		
		do {

			System.out.println("Startmen�");
			System.out.println("1 - Spieler hinzuf�gen");
			System.out.println("2 - Mister X hinzuf�gen");
			System.out.println("3 - Spiel starten");

			// Aktion einlesen
			System.out.println("Bitte Aktion eingeben.");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			aktion = reader.readLine();


			String name;

			switch (aktion){
			case "1" :	
				System.out.println("Name des Spielers eingeben:");
				name = reader.readLine();
				for (int i= 0; i<5; i++){					
					Station strasse = spiel.getStationByIndex(i);
					System.out.println("Nr: " + (i+1)+ "   " + spiel.getStationByIndex(i));
				}
				
				System.out.println("W�hle die Nummer der Startstation:");
				String stationsnr = reader.readLine();
				
				
				try{	
					Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr)-1);
					//System.out.println(station);
					Spieler neuerSpieler = new Spieler(name);
					neuerSpieler.setStandort(station);
					spiel.spielerHinzuf�gen(neuerSpieler);
					System.out.println("Neuer Spieler mit dem Namen " 
						+ name + " wurde angelegt.");
					System.out.println(neuerSpieler);
				}catch (SpielerExistiertBereitsException e){
					System.out.println("Spieler mit dem Namen " 
						+ name + " existiert bereits.");
				}
				break;
				
			case "2": 
				System.out.println("Name von MisterX eingeben:");
				name = reader.readLine();
				for (int i= 0; i<5; i++){				
					Station strasse = spiel.getStationByIndex(i);
					System.out.println("Nr: " + (i+1)+ "   " + spiel.getStationByIndex(i));
				}
				
				System.out.println("W�hle die Nummer der Startstation:");
				String stationsnr1 = reader.readLine();	
				
				try{	
					Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr1)-1);
					//System.out.println(station);
					Spieler neuerSpieler = new Spieler(name);
					neuerSpieler.setStandort(station);
					spiel.spielerHinzuf�gen(new MisterX(name));
					System.out.println("MisterX mit dem Namen " 
						+ name + " wurde angelegt.");
					//System.out.println(neuerSpieler); //geheim
					System.out.println("Station von MisterX ist geheim!");
				
				}catch (SpielerExistiertBereitsException e){
				System.out.println("Spieler mit dem Namen " 
						+ name + " existiert bereits.");	
				}
				break;
				
			case "3":
				for (int j = 0; j < 5; j++) {
					Station strasse = spiel.getStationByIndex(j);
					System.out.println();
					//System.out.println(spiel.toString());
					System.out.println(strasse.getName());
					//System.out.println(spiel.getStationByIndex(j));
					System.out.println("Taxinachbarn: " + strasse.getTaxiNachbarn()+", Bahnnachbarn: " + strasse.getBahnNachbarn()+", Busnachbarn: " + strasse.getBusNachbarn());
				}
				break;
			}

		} while (!aktion.equals("3"));
		System.out.println();
		System.out.println("Spiel wurde gestartet!");
		System.out.println();
	}
				
		
		
		
		// Fallunterscheidung / switch
		// wenn 1: spiel.spielerHinzuf�gen(name);
		// wenn 2: spiel.misterXFestlegen(name);
		// wenn 3: Spielfeld feld = spiel.spielfeldErzeugen()
		//			feld ausgeben in CUI
		// 			neues Men� anzeigen: was kann Spieler tun?
		

	private Spiellogik logik = new Spiellogik();
	int zaehler=1;
		
	public void aktionAusfuehren() throws IOException {
		
		for (int i= 0; i<spiel.getLength(); i++){
			Spieler spieler = spiel.getSpielerByIndex(i);
			System.out.println(spieler.getName() + " ist an der Reihe");
			
			Iterator<Spieler> posIterator = spiel.getSpieler().iterator();
			while (posIterator.hasNext()) {
				System.out.println(posIterator.next());
			}
			
			//System.out.println(spiel.getSpieler());
			System.out.println("Du besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
			+ spieler.getBusChips() + " Buschips und " + spieler.getBahnChips() + " U-Bahnchips.");
			System.out.println("Deine Zugm�glichkeiten sind:");
			
			System.out.println("Taxi:");
			Iterator<Station> nachbIterator = spieler.getStandort().getTaxiNachbarn().iterator();
			while (nachbIterator.hasNext()) {
				System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
			}
			System.out.println();

			System.out.println("Bus:");
			nachbIterator = spieler.getStandort().getBusNachbarn().iterator();
			while (nachbIterator.hasNext()) {
				System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
			}
			System.out.println();
			
			System.out.println("Bahn:");
			nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
			while (nachbIterator.hasNext()) {
				System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
			}
			System.out.println();
			
			
			
			System.out.println("Wohin willst du?");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String stationsausw = reader.readLine();
			/*
			nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
			for(int l=0;l<stationsausw;l++){
				
			}
			spieler.setStandort("Mittelstra�e");
			*/
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MisterXClientCUI cui = new MisterXClientCUI();
		try {
			cui.startMenue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cui.aktionAusfuehren();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}