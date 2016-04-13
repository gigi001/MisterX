package misterx.local.domain;
import java.util.List;
import java.util.Vector;

import misterx.local.valueobjekts.Station;

public class StadtVerw {
	
	List<Station> meineStationen = new Vector<Station>();
	
	public StadtVerw() {
		Station fStrasse = new Station("Friedrichstr" );
		Station xStrasse = new Station("X-str" );
		meineStationen.add(fStrasse);
		meineStationen.add(xStrasse);
		meineStationen.add(new Station("Y-str" ));
		fStrasse.addTaxiNachbar(xStrasse);
		xStrasse.addTaxiNachbar(fStrasse);
	}

	public Station getStationByIndex(int index){
		Station strasse = meineStationen.get(index);
		return strasse;
	}
}
