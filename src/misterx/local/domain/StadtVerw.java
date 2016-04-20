package misterx.local.domain;
import java.util.List;
import java.util.Vector;

import misterx.local.valueobjekts.Station;

public class StadtVerw {
	
	List<Station> meineStationen = new Vector<Station>();
	
	public StadtVerw() {
		Station eStrasse = new Station("Friedrichstr" );
		Station dStrasse = new Station("X-str" );
		Station bStrasse = new Station ("HerStr");
		Station cStrasse= new Station ("NeulanderStr");
		Station aStrasse= new Station ("haferkampStr");
		Station fStrasse= new Station ("OsterholzStr");
		Station gStrasse= new Station ("LindenStr");
		Station hStrasse= new Station ("LöhStr");
		
		
		meineStationen.add(eStrasse);
		meineStationen.add(dStrasse);
		meineStationen.add(aStrasse);
		meineStationen.add(bStrasse);
		meineStationen.add(cStrasse);
		meineStationen.add(eStrasse);
		meineStationen.add(fStrasse);
		meineStationen.add(gStrasse);
		meineStationen.add(hStrasse);
		
		
	   meineStationen.add(new Station("Y-str" ));
		eStrasse.addTaxiNachbar(dStrasse);
		dStrasse.addTaxiNachbar(eStrasse);
		dStrasse.addTaxiNachbar(aStrasse);
		
		
		
		
		
	}

	public Station getStationByIndex(int index){
		Station strasse = meineStationen.get(index);
		return strasse;
	}
}
