package misterx.local.domain;
import java.util.List;
import java.util.Vector;

import misterx.local.valueobjekts.Station;

public class StadtVerw {
	
	List<Station> meineStationen = new Vector<Station>();
	
	public StadtVerw() {
		Station str1 = new Station("Friedrichstr");
		Station str2 = new Station("Mittelstraﬂe");
		Station str3 = new Station("Unter den Linden");
		Station str4 = new Station("Franz.Str");
		Station str5 = new Station("Stadtmitte");
		
		
		
		meineStationen.add(str1);
		meineStationen.add(str2);
		meineStationen.add(str5);
		meineStationen.add(str3);
		meineStationen.add(str4);
		meineStationen.add(str1);
	
		
	    //meineStationen.add(new Station("Y-str" ));
		//str1 Nachbarn festlegen
		str1.addTaxiNachbar(str2);
		str1.addBusNachbar(str3);
		str1.addBahnNachbarn(str4);
		
		//str2
		str2.addTaxiNachbar(str1);
		str2.addTaxiNachbar(str3);
		
		//str3
		str3.addBusNachbar(str1);
		str3.addBusNachbar(str4);
		str3.addTaxiNachbar(str2);
		str3.addTaxiNachbar(str4);
		
		//str4		
		str4.addBahnNachbarn(str1);
		str4.addBusNachbar(str3);
		str4.addTaxiNachbar(str3);
		
		// str5
		str5.addBahnNachbarn(str3);
		str5.addTaxiNachbar(str3);
		str5.addBusNachbar(str4);
		
	}
	

	public Station getStationByIndex(int index){
		Station strasse = meineStationen.get(index);
		return strasse;
	}
}