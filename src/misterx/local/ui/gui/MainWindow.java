package misterx.local.ui.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import misterx.local.domain.MisterXSpiel;
import misterx.local.domain.exceptions.EingabeException;
import misterx.local.domain.exceptions.SpielerExistiertBereitsException;
import misterx.local.persistence.ObjectPersistenceManager;
import misterx.local.valueobjekts.MisterX;
import misterx.local.valueobjekts.Spieler;
import misterx.local.valueobjekts.Station;
import net.miginfocom.swing.MigLayout;

public class MainWindow {
	
	private MisterXSpiel spiel = new MisterXSpiel();
	private int xnr = -1;
	private Spieler ausg;
	private Spieler spieler;
	private String sonderchips = "1";
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private int farbe = 1;
	private int i = -1;
	
	

	
	public MainWindow(){
		try {
			create();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void create() throws IOException{
		JFrame frame = new JFrame("Mister X - Berlin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(10,10);
		frame.setSize(1600, 900);
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new MigLayout("insets 0"));	//debug insets 0
		
		
		JLabel namen = new JLabel("Name: ");
		JLabel station = new JLabel("Startstation: ");
		JLabel rolle = new JLabel("Rolle des neuen Spielers: ");
		JLabel leer = new JLabel("");
		JLabel stationFeld = new JLabel("Karte klicken");
		
		JTextField nameFeld = new JTextField();
		//JTextField stationFeld = new JTextField();
		
		JButton spieler = new JButton("Sucher");
		JButton misterX = new JButton("Mister X");
		JButton starten = new JButton("Spiel starten");
		JButton neu = new JButton("Neues Spiel");
		JButton laden = new JButton("Spiel laden");
		
		 
		JPanel hinzufügen = new JPanel(new MigLayout(""));
		hinzufügen.setBorder(BorderFactory.createTitledBorder("Hinzufügen"));
		
		hinzufügen.add(namen);
		hinzufügen.add(nameFeld, "growx, wrap");
		
		hinzufügen.add(station);
		hinzufügen.add(stationFeld, "growx, wrap");
		
		hinzufügen.add(leer, "wrap");
		hinzufügen.add(leer, "wrap");
		
		hinzufügen.add(rolle, "span, wrap");
		
		hinzufügen.add(spieler);
		hinzufügen.add(misterX, "wrap");

		hinzufügen.add(leer, "wrap");
		
		hinzufügen.add(starten, "span, growx");
		starten.setEnabled(false);
		
		
		
		JPanel menü = new JPanel(new MigLayout(""));
		menü.setBorder(BorderFactory.createTitledBorder("Menü"));
		
		menü.add(neu, "wrap");
		menü.add(laden, "growx");
		
		
		
		//String path = "/karte.png";
		String path1 = "images/karte.jpg";
		ImageIcon icon = new ImageIcon(path1);
		JLabel bild = new JLabel(icon);
		
		//JLabel punkte = new JLabel(new ImageIcon("images/punkte.png"));
		JLabel spieler1 = new JLabel(new ImageIcon("images/Spieler1.png"));
		JLabel spieler2 = new JLabel(new ImageIcon("images/Spieler2.png"));
		
		BufferedImage image = ImageIO.read(new File("images/punkte.png"));
		//frame.setContentPane(l1);
		
		//bild.add(l1);
		
		
		JPanel chips = new JPanel(new MigLayout(""));
		
		JPanel taxi = new JPanel(new MigLayout());
		taxi.add(new JLabel(new ImageIcon("images/taxi.png")));

		JPanel bus = new JPanel(new MigLayout());
		bus.add(new JLabel(new ImageIcon("images/bus.png")));

		JPanel bahn = new JPanel(new MigLayout());
		bahn.add(new JLabel(new ImageIcon("images/bahn.png")));

		JPanel black = new JPanel(new MigLayout());
		black.add(new JLabel(new ImageIcon("images/black.png")));

		JPanel zweix = new JPanel(new MigLayout());
		zweix.add(new JLabel(new ImageIcon("images/2x.png")));
		
		JLabel taxizahl = new JLabel("0");
		JLabel buszahl = new JLabel("0");
		JLabel bahnzahl = new JLabel("0");
		JLabel blackzahl = new JLabel("0");
		JLabel zweixzahl = new JLabel("0");

		chips.setBorder(BorderFactory.createTitledBorder("sp1"));
		chips.add(taxizahl);
		chips.add(taxi, "");
		chips.add(buszahl);
		chips.add(bus, "wrap");
		chips.add(bahnzahl);
		chips.add(bahn, "");
		chips.add(blackzahl);
		chips.add(black, "wrap");
		chips.add(zweixzahl);
		chips.add(zweix, ""); 

		
		JPanel chips2 = new JPanel(new MigLayout(""));
		
		JPanel taxi2 = new JPanel(new MigLayout());
		taxi2.add(new JLabel(new ImageIcon("images/taxi.png")));

		JPanel bus2 = new JPanel(new MigLayout());
		bus2.add(new JLabel(new ImageIcon("images/bus.png")));

		JPanel bahn2 = new JPanel(new MigLayout());
		bahn2.add(new JLabel(new ImageIcon("images/bahn.png")));

		JPanel black2 = new JPanel(new MigLayout());
		black2.add(new JLabel(new ImageIcon("images/black.png")));

		JPanel zweix2 = new JPanel(new MigLayout());
		zweix2.add(new JLabel(new ImageIcon("images/2x.png")));

		chips2.setBorder(BorderFactory.createTitledBorder("sp2"));
		chips2.add(taxi2, "");
		chips2.add(bus2, "wrap");
		chips2.add(bahn2, "");
		chips2.add(black2, "wrap");
		chips2.add(zweix2, ""); 
		
		
		SpringLayout layout1 = new SpringLayout();
		layout1.putConstraint(SpringLayout.EAST, menü, -100, SpringLayout.EAST, bild);
		layout1.putConstraint(SpringLayout.NORTH, menü, 50, SpringLayout.NORTH, bild);
		
		
		
		
		//width 500:1600:1600
		bild.add(menü);

		bild.setLayout(layout1);
		
		
		bild.add(panel);
		
		//bild.add(punkte);
		//bild.add(punkte);
		
		frame.add(bild);
		
		frame.pack();
		frame.setVisible(true);
	
		
		
		//nach wrap nächste Zeile
		//span über ganze zeile
		//center mitte
		
		
//		frame.setLayout(new BorderLayout());
//		frame.setContentPane(new JLabel(new ImageIcon("images/karte.jpg")));
//		frame.setLayout(new FlowLayout());
//		JLabel l2=new JLabel("Here is a button");
//		JButton b1=new JButton("I am a button");
//		frame.add(l2);
//		frame.add(b1);
//		frame.pack();

//		frame.setSize(399,399);
//		frame.setSize(400,400);
		
		
		bild.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent m) {
				// TODO Auto-generated method stub
				int a = m.getX();
				int b = m.getY();
				
				int rgb = image.getRGB(a, b);
		        Color c = new Color(rgb);
		        farbe = c.getRed();
		        if(farbe != 255){
		        	System.out.println("Station: " + farbe);
		        	stationFeld.setText(Integer.toString(farbe));
		        	if(spiel.getLength() == 0){
						bild.add(spieler1);
				        layout1.putConstraint(SpringLayout.WEST, spieler1, a-10, SpringLayout.WEST, bild);
				        layout1.putConstraint(SpringLayout.NORTH, spieler1, b-10, SpringLayout.NORTH, bild);
		        	}else{
		        		bild.add(spieler2);
				        layout1.putConstraint(SpringLayout.WEST, spieler2, a-10, SpringLayout.WEST, bild);
				        layout1.putConstraint(SpringLayout.NORTH, spieler2, b-10, SpringLayout.NORTH, bild);
		        	
		        	}
			        frame.pack();
			        
			        if(i != -1){
			        	aktionAusfuehren();
			        }
			        
		        }
		        
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}
			@Override
			public void mouseExited(MouseEvent arg0) {}
			@Override
			public void mousePressed(MouseEvent arg0) {}
			@Override
			public void mouseReleased(MouseEvent arg0) {}
		});
		
		
		neu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bild.remove(menü);
				bild.add(hinzufügen);
				layout1.putConstraint(SpringLayout.EAST, hinzufügen, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, hinzufügen, 50, SpringLayout.NORTH, bild);
				frame.pack();
			}
		});
		
		laden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				bild.remove(menü);
				bild.add(chips);
				layout1.putConstraint(SpringLayout.EAST, chips, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, chips, 50, SpringLayout.NORTH, bild);
				frame.pack();
				
				System.out.println("HALLO");
				ObjectPersistenceManager ladeManager = new ObjectPersistenceManager();
				spiel = ladeManager.ladeSpiel("test");
				xnr=spiel.getXnr();
				
			}
		});
		
		spieler.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {

				String name = nameFeld.getText();
				boolean ok = false;
				try {
					ok = isAlpha(name); 
				} catch (EingabeException eex) {
					System.err.println(eex.getMessage());
				}
				
					

				Integer stationsnr = farbe;
				try{	
					if(ok){
						Station station = spiel.getStationByIndex(stationsnr-1);
						//System.out.println(station);
						Spieler neuerSpieler = new Spieler(name);
						neuerSpieler.setStandort(station);
						spiel.spielerHinzufügen(neuerSpieler);
						//System.out.println("Neuer Spieler mit dem Namen " + name + " wurde angelegt.");
						System.out.println(neuerSpieler);
						
						nameFeld.setText("");
						stationFeld.setText("Karte klicken");
					}else{
						nameFeld.setText("keine Sonderzeichen oder Zahlen");
					}
				}catch (SpielerExistiertBereitsException e){
					System.out.println("Spieler mit dem Namen " + name + " existiert bereits.");
				}
				
				if(xnr != -1 && spiel.getLength() > 1){
					starten.setEnabled(true);
				}
			}
		});
		
		
		misterX.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {
				
				String name = nameFeld.getText();
				boolean ok = false;
				try {
					ok = isAlpha(name); 
				} catch (EingabeException eex) {
					System.err.println(eex.getMessage());
				}

				
				String stationsnr = stationFeld.getText();
				try{	
					if(ok){
						Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr)-1);
						//System.out.println(station);
						Spieler neuerSpieler = new MisterX(name);
						neuerSpieler.setStandort(station);
						spiel.spielerHinzufügen(neuerSpieler);
						//System.out.println("Mister X mit dem Namen " + name + " wurde angelegt.");
						System.out.println(neuerSpieler + " (Mister X)");
						xnr=spiel.getLength()-1;
						spiel.setXnr(xnr);
						
						nameFeld.setText("");
						stationFeld.setText("Karte klicken");
						misterX.setEnabled(false);
					}else{
						nameFeld.setText("keine Sonderzeichen oder Zahlen");
					}
				
				}catch (SpielerExistiertBereitsException e){
				System.out.println("Spieler mit dem Namen " + name + " existiert bereits.");	
				}
				
				if(xnr != -1 && spiel.getLength() > 1){
					starten.setEnabled(true);
				}
			}
		});
		
		
		starten.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {
				
				for (int j = 0; j < 5; j++) {
					Station strasse = spiel.getStationByIndex(j);
					//System.out.println();
					//System.out.println(spiel.toString());
					//System.out.println(strasse.getName());
					//System.out.println(spiel.getStationByIndex(j));
					//System.out.println("Taxinachbarn: " + strasse.getTaxiNachbarn()+", Bahnnachbarn: " + strasse.getBahnNachbarn()+", Busnachbarn: " + strasse.getBusNachbarn());
				}
				
				bild.remove(hinzufügen);
				bild.add(chips);
				layout1.putConstraint(SpringLayout.EAST, chips, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, chips, 50, SpringLayout.NORTH, bild);
				frame.pack();
//				bild.add(chips2);
//				layout1.putConstraint(SpringLayout.EAST, chips2, -100, SpringLayout.EAST, bild);
//				layout1.putConstraint(SpringLayout.NORTH, chips2, 300, SpringLayout.NORTH, bild);
//				frame.pack();
				System.out.println();
				System.out.println("Spiel wurde gestartet!");
				System.out.println();
				
				aktionAusfuehren();
				
			}
		});
		
		
		
	}
	
	
	public void aktionAusfuehren(){

		MisterX misterx = (MisterX) spiel.getSpielerByIndex(xnr);
		
		
		if(Integer.parseInt(sonderchips) != 3 && Integer.parseInt(sonderchips) != 4){
			i = (i+1) % spiel.getLength();
			spieler = spiel.getSpielerByIndex(i);
		}
		
		sonderchips = "1";
		
		
		
		//speichern
		
		
		
		spiel.getNaechsteRunde();
		System.out.println("Runde " + spiel.getRunde());
		
		
		
		
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
		
		
		if(spieler.getName() == misterx.getName()){
			//chips.add(black);
		}
		
		
		System.out.println(spieler.getName() + " ist an der Reihe");
		
		if(spieler.getName() == misterx.getName()){
			System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
					+ spieler.getBusChips() + " Buschips, " + spieler.getBahnChips() + " U-Bahnchips, " + 
					((MisterX) spieler).getBlackTickets() + " Black Tickets und " + ((MisterX) spieler).getDoubleChips() + " Doppelchips.");
		}else{
			System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
					+ spieler.getBusChips() + " Buschips und " + spieler.getBahnChips() + " U-Bahnchips.");
		}
		
		
		
		if(spieler.getTaxiChips()==0 && spieler.getBusChips()==0 && spieler.getBahnChips()==0){
			System.out.println("Spiel zuende!");
		}
		
		
		//fahren
		
		
		
		misterx = (MisterX) spiel.getSpielerByIndex(xnr);
		if(spiel.getXWin(spiel.getSpieler(), misterx) == 2){
			System.out.println("----- Mister X wurde gefunden! -----");
		}
		
		if(spiel.getXWin(spiel.getSpieler(), misterx) == 1){
			System.out.println("----- Mister X ist entkommen! -----");
		}
		
	}
	
	
	
	
	
	public boolean isAlpha(String text) throws EingabeException {
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
            
            throw new EingabeException(text);
//            return false;
        }
        return true;
    }





	
	
	
	
}
