package misterx.local.ui.cui;
//hi
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
	public int xnr;
	
	public void startMenue() throws IOException {
<<<<<<< HEAD
		System.out.println("StartmenÃ¼");
		System.out.println("1 - Spieler hinzufÃ¼gen");
		System.out.println("2 - Mister X hinzufÃ¼gen");
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
					System.out.println("Neuer Spieler mit Name " 
							+ name + " wurde angelegt.");
					}catch (SpielerExistiertBereitsException e){
						System.out.println("Spieler mit Name  " 
								+ name + " Existiert bereits.");	
						
					}
					
					break;
		case "2": 	System.out.println("Name von MisterX eingeben:");
<<<<<<< HEAD
<<<<<<< HEAD
					String nameX = reader.readLine();	
=======
					name = reader.readLine();	
>>>>>>> master
=======
					name = reader.readLine();	
=======
					String nameX = reader.readLine();	
>>>>>>> refs/remotes/origin/YagmurWorkspace
>>>>>>> origin/master
					try{	
						spiel.spielerHinzufuegen(nameX);
						System.out.println("Neuer Spieler mit Name " 
								+ nameX + " wurde angelegt.");
						}catch (SpielerExistiertBereitsException e){
							System.out.println("Spieler mit Name  " 
									+ nameX + " Existiert bereits.");	
							
						}
						
						break;
		case "3":  //TODO
			break;
=======
	
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


			String name;

			switch (aktion){
			case "1" :	
				System.out.println("Name des Spielers eingeben:");
				name = reader.readLine();
				for (int i= 0; i<5; i++){					
					//Station strasse = spiel.getStationByIndex(i);
					System.out.println("Nr: " + (i+1)+ "   " + spiel.getStationByIndex(i));
				}
				
				System.out.println("Wähle die Nummer der Startstation:");
				String stationsnr = reader.readLine();
				
				
				try{	
					Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr)-1);
					//System.out.println(station);
					Spieler neuerSpieler = new Spieler(name);
					neuerSpieler.setStandort(station);
					spiel.spielerHinzufügen(neuerSpieler);
					System.out.println("Neuer Spieler mit dem Namen " 
						+ name + " wurde angelegt.");
					System.out.println(neuerSpieler);
				}catch (SpielerExistiertBereitsException e){
					System.out.println("Spieler mit dem Namen " 
						+ name + " existiert bereits.");
				}
				System.out.println();
				break;
				
			case "2": 
				System.out.println("Name von Mister X eingeben:");
				name = reader.readLine();
				for (int i= 0; i<5; i++){				
					//Station strasse = spiel.getStationByIndex(i);
					System.out.println("Nr: " + (i+1)+ "   " + spiel.getStationByIndex(i));
				}
				
				System.out.println("Wähle die Nummer der Startstation:");
				String stationsnr1 = reader.readLine();	
				
				try{	
					Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr1)-1);
					//System.out.println(station);
					Spieler neuerSpieler = new MisterX(name);
					neuerSpieler.setStandort(station);
					spiel.spielerHinzufügen(neuerSpieler);
					System.out.println("Mister X mit dem Namen " 
						+ name + " wurde angelegt.");
					//System.out.println(neuerSpieler); //geheim
					System.out.println("Station von Mister X ist geheim!");
					xnr=spiel.getLength()-1;
				
				}catch (SpielerExistiertBereitsException e){
				System.out.println("Spieler mit dem Namen " 
						+ name + " existiert bereits.");	
				}
				System.out.println();
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
				
		
>>>>>>> origin/master
		
		
		// Fallunterscheidung / switch
		// wenn 1: spiel.spielerHinzufügen(name);
		// wenn 2: spiel.misterXFestlegen(name);
		// wenn 3: Spielfeld feld = spiel.spielfeldErzeugen()
		//			feld ausgeben in CUI
<<<<<<< HEAD
		// 			neues Menï¿½ anzeigen: was kann Spieler tun? hallo
	}
=======
		// 			neues Menü anzeigen: was kann Spieler tun?
		

	
	
<<<<<<< HEAD
>>>>>>> origin/master
	
	private Spiellogik logik = new Spiellogik();
=======
>>>>>>> refs/remotes/origin/Chris-workspace
	int zaehler;
		
	public void aktionAusfuehren() throws IOException {
		
		Spieler misterx = spiel.getSpielerByIndex(xnr);
		spiel.getNaechsteRunde();
		System.out.println("Runde " + spiel.getRunde());
		
		if(spiel.getZeigen()){
			System.out.println("Mister X ist bei der " + misterx.getStandort());
		}
		for (int i= 0; i<spiel.getLength(); i++){
			zaehler=1;
			Spieler spieler = spiel.getSpielerByIndex(i);
			System.out.println(spieler.getName() + " ist an der Reihe");
			
			Iterator<Spieler> posIterator = spiel.getSpieler().iterator();
			while (posIterator.hasNext()) {
				System.out.println(posIterator.next());
			}

			System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
			+ spieler.getBusChips() + " Buschips und " + spieler.getBahnChips() + " U-Bahnchips.");
			System.out.println("Deine Zugmöglichkeiten sind:");
			
			Iterator<Station> nachbIterator = spieler.getStandort().getTaxiNachbarn().iterator();
			if(spieler.getTaxiChips()>0){
				if(nachbIterator.hasNext()){
					System.out.println("Taxi:");
				}
				while (nachbIterator.hasNext()) {
					System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
				}
				System.out.println();
			}
			
			nachbIterator = spieler.getStandort().getBusNachbarn().iterator();
			if(spieler.getBusChips()>0){
				if(nachbIterator.hasNext()){
					System.out.println("Bus:");
				}
				while (nachbIterator.hasNext()) {
					System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
				}
			System.out.println();
			}
			
			nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
			if(spieler.getBahnChips()>0){
				if(nachbIterator.hasNext()){
					System.out.println("Bahn:");
				}
				while (nachbIterator.hasNext()) {
					System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
				}
				System.out.println();
			}
			
			if(spieler.getTaxiChips()==0 && spieler.getBusChips()==0 && spieler.getBahnChips()==0){
				System.out.println("Spiel zuende!");
			}
			
			System.out.println("Zu welcher Station möchtest du fahren?");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String stationsausw = reader.readLine();
			
			//nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
			Iterator<Station> nachbTaxiIterator = spieler.getStandort().getTaxiNachbarn().iterator();
			Iterator<Station> nachbBusIterator = spieler.getStandort().getBusNachbarn().iterator();
			Iterator<Station> nachbBahnIterator = spieler.getStandort().getBahnNachbarn().iterator();
			for(int l=0;l<(Integer.parseInt(stationsausw));l++){
								
				if (nachbTaxiIterator.hasNext()) {
					spiel.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l);
				}else if (nachbBusIterator.hasNext()) {
					spiel.busFahren(nachbBusIterator, stationsausw, spieler, misterx, l);					
				}else if (nachbBahnIterator.hasNext()) {
					spiel.bahnFahren(nachbBahnIterator, stationsausw, spieler, misterx, l);
				}
			}
			
			System.out.println("Du stehst nun an der " + spieler.getStandort());
			System.out.println();
				
			misterx = spiel.getSpielerByIndex(xnr);
			if(spiel.getXWin(spieler, misterx) == 2){
				System.out.println("----- Mister X wurde gefunden! -----");
				i=spiel.getLength()-1;
			}
			
			if(spiel.getXWin(spieler, misterx) == 1){
				System.out.println("----- Mister X ist entkommen! -----");
				i=spiel.getLength()-1;
			}

		}
		if(spiel.getGewonnen()==0){
			aktionAusfuehren();
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