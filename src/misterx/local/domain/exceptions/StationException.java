package misterx.local.domain.exceptions;

import misterx.local.valueobjekts.Station;

public class StationException  extends Exception{
	
	public StationException(Station spieler){
		super("sie haben verloren ");
	}

}
