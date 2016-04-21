package misterx.local.ui.cui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import misterx.local.domain.MisterXSpiel;
import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXClientCUI {

	private MisterXSpiel spiel = new MisterXSpiel();
	
	public void startMenue() throws IOException {
	
		String aktion = "";
		
		do {

			System.out.println("Startmenü");
			System.out.println("1 - Spieler hinzufügen");
			System.out.println("2 - Mister X hinzufügen");
			System.out.println("3 - Spiel starten");

			// Aktion einlesen
			System.out.println("Bitte Aktion eingeben.");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			aktion = reader.readLine();


			int zahl= 0;
			String name;

			switch (aktion){
			case "1" :	
				System.out.println("Name des Spielers eingeben:");
				name = reader.readLine();
				for (int i= 0; i<5; i++){
					
					Station strasse = spiel.getStationByIndex(i);
					System.out.println("Nr:  " + zahl+ "   " + spiel.getStationByIndex(i));
					zahl++;
					
					
				}
				System.out.println("Wähle eine Nummer der Startstation:");
				String stationsnr = reader.readLine();
			try{	
				Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr));
				System.out.println(station);
				Spieler neuerSpieler = new Spieler(name);
				neuerSpieler.setStandort(station);
				spiel.spielerHinzufügen(neuerSpieler);
				System.out.println("Neuer Spieler mit Name " 
						+ name + " wurde angelegt.");
				System.out.println(neuerSpieler);
			}catch (SpielerExistiertBereitsException e){
				System.out.println("Spieler mit Name  " 
						+ name + " Existiert bereits.");
			}
			break;
			case "2": 
				System.out.println("Name von MisterX eingeben:");
				name = reader.readLine();
			for (int i= 0; i<5; i++){
				
				Station strasse = spiel.getStationByIndex(i);
				System.out.println("Nr:  " + zahl+ "   " + spiel.getStationByIndex(i));
				zahl++;
			}
			System.out.println("Wähle eine Nummer der Startstation:");
			String stationsnr1 = reader.readLine();		
			try{	
				Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr1));
				System.out.println(station);
				Spieler neuerSpieler = new Spieler(name);
				neuerSpieler.setStandort(station);
				spiel.spielerHinzufügen(new MisterX(name));
				System.out.println("Neuer Spieler mit Name " 
						+ name + " wurde angelegt.");
				System.out.println(neuerSpieler);
				
			}catch (SpielerExistiertBereitsException e){
				System.out.println("Spieler mit Name  " 
						+ name + " Existiert bereits.");	
			}
			break;
			case "3":
				for (int j = 0; j < 5; j++) {
					Station strasse = spiel.test(j);
					System.out.println(spiel.toString());
					System.out.println(strasse.getName());
					System.out.println(spiel.getStationByIndex(j));
					System.out.println("Nachbarn: " + strasse.getTaxiNachbarn()+" " + strasse.getBahnNachbarn()+" " + strasse.getBusNachbarn());
				}
				break;
			}

		} while (! aktion.equals("3"));

	
	}
				
		
		
		
		// Fallunterscheidung / switch
		// wenn 1: spiel.spielerHinzufügen(name);
		// wenn 2: spiel.misterXFestlegen(name);
		// wenn 3: Spielfeld feld = spiel.spielfeldErzeugen()
		//			feld ausgeben in CUI
		// 			neues Menü anzeigen: was kann Spieler tun?
		
		
	public void aktionAusfuehren() {
		
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
		
		cui.aktionAusfuehren();

	}

}