
package misterx.local.persistence;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import misterx.local.domain.MisterXSpiel;
import misterx.local.ui.gui.MainWindow;
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

	

	
//	public Spieler ladeSpieler(List<Station> stationen) throws IOException {
	
	
	@Override
	public void speichereSpiel(MainWindow s,String datenQuelle){
		
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
	@Override
	public  MainWindow ladeSpiel(String datenQuelle){
		MainWindow spiel= null;
		try {
			openForReading("src/"+datenQuelle);
				spiel = (MainWindow)inputStream.readObject();
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
			
			return spiel;
		}


	

	




}

