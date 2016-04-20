package misterx.local.domain;

import misterx.local.valueobjekts.Spieler;

@SuppressWarnings("serial")
public class SpielerExistiertBereitsException extends Exception{
	
	public  SpielerExistiertBereitsException(Spieler spieler){
		super ("Spieler mit Name "+ spieler.getName()+ " existiert bereits ");
		
	}

}
