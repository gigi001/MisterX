package misterx.local.persistence;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;

public class ObjectPersistenceManager implements PersistenceManager {

	// Buffer zum schreiben des Objekt alles was ich übergebe das ganze spiel 
	ObjectOutputStream outputStream= null;
	//Buffer zum ausgabe des Spieles
	ObjectInputStream inputStream= null;
	
	
	
	@Override

	//Der Lese Stream wird geöffnet vom gespeicherten spiel 
	public void openForReading(String datenquelle) throws IOException {
	inputStream= new ObjectInputStream(new BufferedInputStream(new FileInputStream(datenquelle)));
		
	}

	@Override
	// bauen die verbindung zu Spiel datei auf  ... input greift auf spiel , spiel gibt es an  output zum speichert weiter // input >Spiel> output 
	public void openForWriting(String datenquelle) throws IOException {
		outputStream= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(datenquelle)));
		
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Station ladeStation() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spieler ladeSpieler() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Spieler testLaden(String datenQuelle){
		Spieler spieler= null;
		try {
			openForReading("src/"+datenQuelle);
			spieler = (Spieler)inputStream.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream != null){
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
		
		return spieler;
	}

	@Override
	public boolean speichereSpieler(Spieler s) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public void testSpeichern(Spieler s,String datenQuelle){
		
		try {
			openForWriting("src/"+datenQuelle);
			outputStream.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				if(outputStream != null){
					try {
						outputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}	
		}		
		
	
	public static void main (String [] args){
		ObjectPersistenceManager objectPersistenceManager = new ObjectPersistenceManager();
		Spieler spieler = new Spieler("test");
		objectPersistenceManager.testSpeichern(spieler, "test");
		ObjectPersistenceManager ladeManager = new ObjectPersistenceManager();
		
		Spieler ladespieler = ladeManager.testLaden("test");
		System.out.println(ladespieler.getName());
		
	}
	
	
}
