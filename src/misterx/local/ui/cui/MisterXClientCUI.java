package misterx.local.ui.cui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import misterx.local.domain.MisterXSpiel;
import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class MisterXClientCUI {

	private MisterXSpiel spiel = new MisterXSpiel();
	private int xnr = -1;
	private Spieler ausg;
	private Spieler spieler;
	private String sonderchips = "1";
	
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


			String name;

			switch (aktion){
			case "1" :	
				System.out.println("Name des Spielers eingeben:");
				name = reader.readLine();
				//->
				while(!isAlpha(name)) {
	                System.out.println("Es dürfen keine Zahlen sowie die Zeichen !, /, _, ?, € enthalten sein!");
	                System.out.println("Name des Spielers eingeben:");
	                name= reader.readLine();
				}
				//<-
				
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
				if(xnr == -1){
					System.out.println("Name von Mister X eingeben:");
					name = reader.readLine();
					//->
					while(!isAlpha(name)) {
		                System.out.println("Es dürfen keine Zahlen sowie die Zeichen !, /, _, ?, € enthalten sein!");
		                System.out.println("Name von Mister X eingeben:");
		                name= reader.readLine();
					}
					//<-					
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
				}else{
					System.out.println("Mister X existiert bereits!");
				}
				System.out.println();
				break;
				
			case "3":
				if(xnr != -1 && spiel.getLength() > 1){
					for (int j = 0; j < 5; j++) {
						Station strasse = spiel.getStationByIndex(j);
						System.out.println();
						//System.out.println(spiel.toString());
						System.out.println(strasse.getName());
						//System.out.println(spiel.getStationByIndex(j));
						System.out.println("Taxinachbarn: " + strasse.getTaxiNachbarn()+", Bahnnachbarn: " + strasse.getBahnNachbarn()+", Busnachbarn: " + strasse.getBusNachbarn());
					}
				}else{
					if(spiel.getLength() == 0 && xnr == -1){
						System.out.println("Bitte ein Spieler hinzufügen!");
					}
					if(spiel.getLength() <= 1 && xnr != -1){
						System.out.println("Bitte ein Spieler hinzufügen!");
					}
					if(xnr == -1){
						System.out.println("Bitte ein Mister X hinzufügen!");
					}
					System.out.println();
				}
				break;
			}

		} while (!aktion.equals("3") || xnr == -1 || spiel.getLength() < 2);
		System.out.println();
		System.out.println("Spiel wurde gestartet!");
		System.out.println();
	}
				
		
		
		
		// Fallunterscheidung / switch
		// wenn 1: spiel.spielerHinzufügen(name);
		// wenn 2: spiel.misterXFestlegen(name);
		// wenn 3: Spielfeld feld = spiel.spielfeldErzeugen()
		//			feld ausgeben in CUI
		// 			neues Menü anzeigen: was kann Spieler tun?
		

	
	
	int zaehler;
		
	public void aktionAusfuehren() throws IOException {
//		List<Spieler> spieler = spiel.getSpieler();
//		Spieler misterx = spieler.get(xnr);
		
		Spieler misterx = spiel.getSpielerByIndex(xnr);

		int i = -1;
		do {
			if(Integer.parseInt(sonderchips) != 3 && Integer.parseInt(sonderchips) != 4){
				i = (i+1) % spiel.getLength();
				spieler = spiel.getSpielerByIndex(i);
			}
			// aktSpieler macht Aktion
			// Ergebnis der Aktion ausgeben
			// - wenn aktSpieler = MisterX, dann Zusatzinfo ausgeben
//		} while (spiel.getGewonnen() == 0);
	
		//for (int i= 0; i<spiel.getLength(); i++){
//		for (int i= 0; i<spieler.size(); i++){
			//if(spiel.getGewonnen() == 0){
				
			sonderchips = "1";
			
			if(i == 0){
				spiel.getNaechsteRunde();
				System.out.println("Runde " + spiel.getRunde());
			}
			
			if(xnr+1 < spiel.getLength()){
				if(i == xnr+1){
					if(spiel.getLetzterXZug() != null){
						System.out.println("Letztes Verkehrsmittel von Mister X: " + spiel.getLetzterXZug());
					}		
					if(spiel.getZeigen()){
						System.out.println("Mister X ist bei der " + misterx.getStandort());
					}
				}
			}else{
				if(i == 0){
					if(spiel.getLetzterXZug() != null){
						System.out.println("Letztes Verkehrsmittel von Mister X: " + spiel.getLetzterXZug());
					}		
					if(spiel.getZeigen()){
						System.out.println("Mister X ist bei der " + misterx.getStandort());
					}
				}
			}
			
			//spieler = spiel.getSpielerByIndex(i);
			System.out.println(spieler.getName() + " ist an der Reihe");
			
			zaehler=1;
			Iterator<Spieler> posIterator = spiel.getSpieler().iterator();
			while (posIterator.hasNext()) {
				ausg = posIterator.next();
				if(ausg == spiel.getSpielerByIndex(xnr)){
					System.out.println(ausg + " (im Spiel nicht zu sehen)");
				}else{
					System.out.println(ausg);
				}
			}
			
			if(spieler.getName() == misterx.getName()){
				System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
						+ spieler.getBusChips() + " Buschips, " + spieler.getBahnChips() + " U-Bahnchips, " + 
						spieler.getBlackTickets() + " Black Tickets und " + spieler.getDoubleChips() + " Doppelchips.");
			}else{
				System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
						+ spieler.getBusChips() + " Buschips und " + spieler.getBahnChips() + " U-Bahnchips.");
			}
			System.out.println("Deine Zugmöglichkeiten sind:");
			
			Iterator<Station> nachbIterator = spieler.getStandort().getTaxiNachbarn().iterator();
			if(spieler.getTaxiChips()>0){
				if(nachbIterator.hasNext()){
					System.out.println("Taxi:");
					while (nachbIterator.hasNext()) {
						System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
					}
					System.out.println();
				}
			}
			
			nachbIterator = spieler.getStandort().getBusNachbarn().iterator();
			if(spieler.getBusChips()>0){
				if(nachbIterator.hasNext()){
					System.out.println("Bus:");
					while (nachbIterator.hasNext()) {
						System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
					}
					System.out.println();
				}
			}
			
			nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
			if(spieler.getBahnChips()>0){
				if(nachbIterator.hasNext()){
					System.out.println("U-Bahn:");
					while (nachbIterator.hasNext()) {
						System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
					}
					System.out.println();
				}
			}
			
			if(spieler.getTaxiChips()==0 && spieler.getBusChips()==0 && spieler.getBahnChips()==0){
				System.out.println("Spiel zuende!");
			}
			
			System.out.println("Zu welcher Station möchtest du fahren?");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String stationsausw = reader.readLine();
			
			
			if(spieler.getName() == misterx.getName()){
				System.out.println("Möchtest du Sonderchips benutzen?");
				System.out.println("1 keine; 2 Black Ticket; 3 Doppelchip; 4 Black Ticket und Doppelchip");
				sonderchips = reader.readLine();
				//switch(sonderchips){
				//case "3": 
				//}
			}
			
			//nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
			Iterator<Station> nachbTaxiIterator = spieler.getStandort().getTaxiNachbarn().iterator();
			Iterator<Station> nachbBusIterator = spieler.getStandort().getBusNachbarn().iterator();
			Iterator<Station> nachbBahnIterator = spieler.getStandort().getBahnNachbarn().iterator();
			for(int l=0;l<(Integer.parseInt(stationsausw));l++){
								
				if (nachbTaxiIterator.hasNext()) {
					spiel.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l, sonderchips);
				}else if (nachbBusIterator.hasNext()) {
					spiel.busFahren(nachbBusIterator, stationsausw, spieler, misterx, l, sonderchips);					
				}else if (nachbBahnIterator.hasNext()) {
					spiel.bahnFahren(nachbBahnIterator, stationsausw, spieler, misterx, l, sonderchips);
				}
			}
			
			System.out.println("Du stehst nun an der " + spieler.getStandort());
			System.out.println();
				
			misterx = spiel.getSpielerByIndex(xnr);
			if(spiel.getXWin(spiel.getSpieler(), misterx) == 2){
				System.out.println("----- Mister X wurde gefunden! -----");
			}
			
			if(spiel.getXWin(spiel.getSpieler(), misterx) == 1){
				System.out.println("----- Mister X ist entkommen! -----");
			}
				//}
			//}
			//if(spiel.getGewonnen()==0){
			//	aktionAusfuehren();
			//}

		} while (spiel.getGewonnen() == 0);
	}
	
	
	
	
	public boolean isAlpha(String text) {
        for (char c : text.toCharArray()) {

            // a - z
            if (c >= 'a' && c <= 'z')
                continue;

            // A - Z
            if (c >= 'A' && c <= 'Z')
                continue;

            // ö, ü, ä, ß
            if (c == 'ö' || c == 'ß' || c == 'ä' || c == 'ü')
                continue;
            

            return false;
        }
        return true;
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
