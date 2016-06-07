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
import java.util.Iterator;

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
	private int ialt = 0;
	private boolean XX = false;
	
	private Station station;

	
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
		
		 
		JPanel hinzuf�gen = new JPanel(new MigLayout(""));
		hinzuf�gen.setBorder(BorderFactory.createTitledBorder("Hinzuf�gen"));
		
		hinzuf�gen.add(namen);
		hinzuf�gen.add(nameFeld, "growx, wrap");
		
		hinzuf�gen.add(station);
		hinzuf�gen.add(stationFeld, "growx, wrap");
		
		hinzuf�gen.add(leer, "wrap");
		hinzuf�gen.add(leer, "wrap");
		
		hinzuf�gen.add(rolle, "span, wrap");
		
		hinzuf�gen.add(spieler);
		hinzuf�gen.add(misterX, "wrap");

		hinzuf�gen.add(leer, "wrap");
		
		hinzuf�gen.add(starten, "span, growx");
		starten.setEnabled(false);
		
		
		
		JPanel men� = new JPanel(new MigLayout(""));
		men�.setBorder(BorderFactory.createTitledBorder("Men�"));
		
		men�.add(neu, "wrap");
		men�.add(laden, "growx");
		
		
		
		//String path = "/karte.png";
		String path1 = "images/karte.jpg";
		ImageIcon icon = new ImageIcon(path1);
		JLabel bild = new JLabel(icon);
		
		//JLabel punkte = new JLabel(new ImageIcon("images/punkte.png"));
		JLabel spieler1 = new JLabel(new ImageIcon("images/Spieler1.png"));
		JLabel spieler2 = new JLabel(new ImageIcon("images/Spieler2.png"));
		JLabel spieler3 = new JLabel(new ImageIcon("images/Spieler3.png"));
		
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
		layout1.putConstraint(SpringLayout.EAST, men�, -100, SpringLayout.EAST, bild);
		layout1.putConstraint(SpringLayout.NORTH, men�, 50, SpringLayout.NORTH, bild);
		
		
		
		
		//width 500:1600:1600
		bild.add(men�);

		bild.setLayout(layout1);
		
		
		bild.add(panel);
		
		//bild.add(punkte);
		//bild.add(punkte);
		
		frame.add(bild);
		
		frame.pack();
		frame.setVisible(true);
	
		
		
		//nach wrap n�chste Zeile
		//span �ber ganze zeile
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
		        	System.out.println(i);
			        if(i==-1){
			        	if(spiel.getLength() == 0){
							bild.add(spieler1);
					        layout1.putConstraint(SpringLayout.WEST, spieler1, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler1, b-10, SpringLayout.NORTH, bild);
			        	}
			        	if(spiel.getLength() == 1){
			        		bild.add(spieler2);
					        layout1.putConstraint(SpringLayout.WEST, spieler2, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler2, b-10, SpringLayout.NORTH, bild);
			        	}
			        	if(spiel.getLength() == 2){
			        		bild.add(spieler3);
					        layout1.putConstraint(SpringLayout.WEST, spieler3, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler3, b-10, SpringLayout.NORTH, bild);
			        	}
			        	
		        	}else{
		        		
		        		if(ialt==0){
		        			bild.remove(spieler1);
		        			bild.add(spieler1);
		        			layout1.putConstraint(SpringLayout.WEST, spieler1, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler1, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(ialt==1){
		        			bild.remove(spieler2);
		        			bild.add(spieler2);
		        			layout1.putConstraint(SpringLayout.WEST, spieler2, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler2, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(ialt==2){
		        			bild.remove(spieler3);
		        			bild.add(spieler3);
		        			layout1.putConstraint(SpringLayout.WEST, spieler3, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler3, b-10, SpringLayout.NORTH, bild);
		        		}
		        		
		        	}
			        
			        //taxizahl.setText(spieler.getTaxiChips());
			        
			        frame.pack();
			        
			        if(XX){
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
				bild.remove(men�);
				bild.add(hinzuf�gen);
				layout1.putConstraint(SpringLayout.EAST, hinzuf�gen, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, hinzuf�gen, 50, SpringLayout.NORTH, bild);
				frame.pack();
			}
		});
		
		laden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				bild.remove(men�);
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
					if(ok && stationFeld.getText() != "Karte klicken"){
						Station station = spiel.getStationByIndex(stationsnr-1);
						//System.out.println(station);
						Spieler neuerSpieler = new Spieler(name);
						neuerSpieler.setStandort(station);
						spiel.spielerHinzuf�gen(neuerSpieler);
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
					if(ok && stationFeld.getText() != "Karte klicken"){
						Station station = spiel.getStationByIndex(Integer.parseInt(stationsnr)-1);
						//System.out.println(station);
						Spieler neuerSpieler = new MisterX(name);
						neuerSpieler.setStandort(station);
						spiel.spielerHinzuf�gen(neuerSpieler);
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
				
				bild.remove(hinzuf�gen);
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
				
				//aktionAusfuehren();
				XX = true;
				i = 1;
			}
		});
		
		
		
	}
	
	
	
	
	
	public void aktionAusfuehren(){

		MisterX misterx = (MisterX) spiel.getSpielerByIndex(xnr);
		
		
		
		if(Integer.parseInt(sonderchips) != 3 && Integer.parseInt(sonderchips) != 4){
			ialt = i;
			i = (i+1) % spiel.getLength();
			spieler = spiel.getSpielerByIndex(i);
		}
		
		sonderchips = "1";
		
		
		
		//speichern
		
		
		if(i==0){
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
		
		
		
		
		station = spiel.getStationByIndex(farbe-1);
		spiel.taxiFahren(station, spieler, misterx, sonderchips);
		
		
		
		
//		Iterator<Station> nachbIterator = spieler.getStandort().getTaxiNachbarn().iterator();
//		if(spieler.getTaxiChips()>0){
//			if(nachbIterator.hasNext()){
//				while (nachbIterator.hasNext()) {
//					zaehler++;
//					if(nachbIterator.next().getName().equals((Integer.toString(farbe)))){
//						nachbar = zaehler;
//						System.out.println("erfolg");
//						System.out.println(nachbar);
//					}
//				}
//			}
//		}
//		
//		System.out.println("test " +farbe + " "+ nachbar);
//		
//		
////		nachbIterator = spieler.getStandort().getBusNachbarn().iterator();
////		if(spieler.getBusChips()>0){
////			if(nachbIterator.hasNext()){
////				System.out.println("Bus:");
////				while (nachbIterator.hasNext()) {
////					System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
////				}
////				System.out.println();
////			}
////		}
////		
////		nachbIterator = spieler.getStandort().getBahnNachbarn().iterator();
////		if(spieler.getBahnChips()>0){
////			if(nachbIterator.hasNext()){
////				System.out.println("U-Bahn:");
////				while (nachbIterator.hasNext()) {
////					System.out.print((zaehler++) + " " + nachbIterator.next() + "   ");
////				}
////				System.out.println();
////			}
////		}
//		
//		//fahren
//		Iterator<Station> nachbTaxiIterator = spieler.getStandort().getTaxiNachbarn().iterator();
//		Iterator<Station> nachbBusIterator = spieler.getStandort().getBusNachbarn().iterator();
//		Iterator<Station> nachbBahnIterator = spieler.getStandort().getBahnNachbarn().iterator();
//		for(int l=0;l<(nachbar);l++){
//							
//			if (nachbTaxiIterator.hasNext()) {
//				Station station = nachbTaxiIterator.next();
//				//System.out.println(station.getName());
//				if ((l+1) == nachbar) {
////					spiel.taxiFahren(nachbTaxiIterator, stationsausw, spieler, misterx, l, sonderchips);
//					spiel.taxiFahren(station, spieler, misterx, sonderchips);
//				}
//			}else if (nachbBusIterator.hasNext()) {
//				Station station = nachbBusIterator.next();
//				if ((l+1) == nachbar) {
//					spiel.busFahren(station, spieler, misterx, sonderchips);	
//				}
//			}else if (nachbBahnIterator.hasNext()) {
//				Station station = nachbBahnIterator.next();
//				if ((l+1) == nachbar) {
//					spiel.bahnFahren(station, spieler, misterx, sonderchips);
//				}
//			}
//		}
		
		System.out.println("Du stehst nun an der " + spieler.getStandort());
		System.out.println();
		
		
		
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

            // �, �, �, �
            if (c == '�' || c == '�' || c == '�' || c == '�')
                continue;
            
            throw new EingabeException(text);
//            return false;
        }
        return true;
    }





	
	
	
	
}
