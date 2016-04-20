package misterx.local.ui.cui;
//hi
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import misterx.local.domain.MisterXSpiel;
import misterx.local.domain.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXClientCUI {

	private MisterXSpiel spiel = new MisterXSpiel();
	
	public void startMenue() throws IOException {
		System.out.println("Startmenue");
		System.out.println("1 - Spieler hinzufuegen");
		System.out.println("2 - Mister X hinzufuegen");
		System.out.println("3 - Spiel starten");
		
		// Aktion einlesen
		System.out.println("Bitte Aktion eingeben.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String aktion = reader.readLine();
		
		String name;
		
		switch (aktion){
		case "1" :	System.out.println("Name des Spielers eingeben:");
					name = reader.readLine();
					try{	
					spiel.spielerHinzufuegen(new Spieler(name));
					System.out.println("Neuer Spieler mit dem Namen " 
							+ name + " wurde angelegt.");
					}catch (SpielerExistiertBereitsException e){
						System.out.println("Spieler mit dem Namen " 
								+ name + " existiert bereits.");							
					}
					startMenue();
					
					break;
		case "2": 	System.out.println("Name von MisterX eingeben:");
					name = reader.readLine();	
					try{	
					spiel.spielerHinzufuegen(new MisterX(name));
					System.out.println("MisterX mit dem Namen " 
							+ name + " wurde angelegt.");
					}catch (SpielerExistiertBereitsException e){
						System.out.println("Spieler mit Name  " 
								+ name + " existiert bereits.");							
					}
					startMenue();
						
						break;
		case "3":  //TODO
			break;
		
		}
		//hi
		// Fallunterscheidung / switch
		// wenn 1: spiel.spielerHinzufuegen(name);
		// wenn 2: spiel.misterXFestlegen(name);
		// wenn 3: Spielfeld feld = spiel.spielfeldErzeugen()
		//			feld ausgeben in CUI
		// 			neues Menue anzeigen: was kann Spieler tun?
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
