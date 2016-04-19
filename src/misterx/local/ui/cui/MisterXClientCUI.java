package misterx.local.ui.cui;
//hi
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import misterx.local.domain.MisterXSpiel;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXClientCUI {

	private MisterXSpiel spiel = new MisterXSpiel();
	
	public void startMenue() throws IOException {
		System.out.println("Startmenü");
		System.out.println("1 - Spieler hinzufügen");
		System.out.println("2 - Mister X hinzufügen");
		System.out.println("3 - Spiel starten");
		
		// Aktion einlesen
		System.out.println("Bitte Aktion eingeben.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String aktion = reader.readLine();
		
		if (aktion.equals("1")) {
			System.out.println("Name des Spielers eingeben:");
			String name = reader.readLine();
			Spieler meinBrandneuerSpieler = spiel.spielerHinzufügen(name);
			System.out.println("Neuer Spieler mit Name " 
					+ meinBrandneuerSpieler.getName() + " wurde angelegt.");
		}
		// Fallunterscheidung / switch
		// wenn 1: spiel.spielerHinzufügen(name);
		// wenn 2: spiel.misterXFestlegen(name);
		// wenn 3: Spielfeld feld = spiel.spielfeldErzeugen()
		//			feld ausgeben in CUI
		// 			neues Menü anzeigen: was kann Spieler tun?
	}
	
	public void aktionAusfuehren() {
		for (int j = 0; j < 3; j++) {
			Station strasse = spiel.test(j);
			System.out.println(strasse.getName());
			System.out.println("Nachbarn: " + strasse.getTaxiNachbarn());
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
		
		cui.aktionAusfuehren();

	}

}
