package misterx.local.domain.exceptions;

import misterx.local.valueobjekts.Spieler;

public class ChipsBestandException extends Exception{
	
	public ChipsBestandException(String fahrzeug){
		super("Leider haben Sie keine "+ fahrzeug+" Chips mehr");
	}

}
