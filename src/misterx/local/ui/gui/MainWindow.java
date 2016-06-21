package misterx.local.ui.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class MainWindow{
	
	
	private MisterXSpiel spiel = new MisterXSpiel();
	
	public MainWindow() {
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
		frame.setLayout(new GridLayout(1,1));
		
		Font f1 = new Font("Berlin Sans FB", Font.BOLD,20);
		Font f2 = new Font("Berlin Sans FB", Font.ROMAN_BASELINE,16);

		JPanel panel = new JPanel(new MigLayout("insets 0"));	//debug insets 0
		JPanel hinzufügen = new JPanel(new MigLayout(""));
		hinzufügen.setBorder(BorderFactory.createTitledBorder("Hinzufügen"));
		JPanel menü = new JPanel(new MigLayout(""));
		menü.setBorder(BorderFactory.createTitledBorder("Menü"));
		JPanel win = new JPanel(new MigLayout(""));
		JPanel runde = new JPanel(new MigLayout(""));
		JPanel lezug = new JPanel(new MigLayout(""));
		lezug.setBorder(BorderFactory.createTitledBorder("Letzte Verkehrsmittel"));
		JPanel zepos = new JPanel(new MigLayout(""));
		zepos.setBorder(BorderFactory.createTitledBorder("Zeigt sich in"));
		JPanel mrX = new JPanel(new MigLayout(""));
		mrX.setBorder(BorderFactory.createTitledBorder("Mister X"));
		JPanel sp = new JPanel(new MigLayout(""));
		
		
		JLabel namen = new JLabel("Name: ");
		namen.setFont(f2);
		JLabel station = new JLabel("Startstation: ");
		station.setFont(f2);
		JLabel rolle = new JLabel("Rolle des neuen Spielers: ");
		rolle.setFont(f2);
		JLabel leer = new JLabel("");
		leer.setFont(f2);
		JLabel stationFeld = new JLabel("Karte klicken");
		stationFeld.setFont(f2);
		JLabel gewonnen = new JLabel("win");
		gewonnen.setFont(f1);
		JLabel rundenzahl = new JLabel("los gehts!");
		rundenzahl.setFont(f1);
		JLabel zug = new JLabel();
		updateZugLabel(zug);
		zug.setFont(f1);
		JLabel zeige = new JLabel("Position");
		zeige.setFont(f1);
		
		
		String path1 = "images/karte.jpg";
		ImageIcon icon = new ImageIcon(path1);
//		Image image = Toolkit.getDefaultToolkit().getImage(path1);
//		ImageView iView = new ImageView(image);
		Bg bild = new Bg();		
		JLabel spieler1 = new JLabel(new ImageIcon("images/Spieler1.png"));
		JLabel spieler2 = new JLabel(new ImageIcon("images/Spieler2.png"));
		JLabel spieler3 = new JLabel(new ImageIcon("images/Spieler3.png"));
		JLabel spieler4 = new JLabel(new ImageIcon("images/Spieler4.png"));
		JLabel spieler5 = new JLabel(new ImageIcon("images/Spieler5.png"));
		JLabel spieler6 = new JLabel(new ImageIcon("images/Spieler6.png"));
		JLabel spieler7 = new JLabel(new ImageIcon("images/Spieler7.png"));
		JLabel spieler8 = new JLabel(new ImageIcon("images/Spieler8.png"));

		BufferedImage image = ImageIO.read(new File("images/punkte.png"));
		
		JTextField nameFeld = new JTextField();
		nameFeld.setFont(f2);
		//JTextField stationFeld = new JTextField();
		
		JButton spielerbt = new JButton("Sucher");
		spielerbt.setFont(f2);
		JButton misterXbt = new JButton("Mister X");
		misterXbt.setFont(f2);
		JButton starten = new JButton("Spiel starten");
		starten.setFont(f2);
		JButton neu = new JButton("Neues Spiel");
		neu.setFont(f2);
		JButton laden = new JButton("Spiel laden");
		laden.setFont(f2);
		JButton speichern = new JButton("Spiel speichern");
		speichern.setFont(f2);
		
		 
		win.add(gewonnen);
		
		runde.add(rundenzahl);
		
		mrX.add(lezug, "wrap, growx, width 220:220:220");
		mrX.add(zepos, "growx");
		
		lezug.add(zug);
		
		zepos.add(zeige); 
		
		
		hinzufügen.add(namen);
		hinzufügen.add(nameFeld, "growx, wrap");
		
		hinzufügen.add(station);
		hinzufügen.add(stationFeld, "growx, wrap");
		
		hinzufügen.add(leer, "wrap");
		hinzufügen.add(leer, "wrap");
		
		hinzufügen.add(rolle, "span, wrap");
		
		hinzufügen.add(spielerbt, "growx");
		hinzufügen.add(misterXbt, "wrap");

		hinzufügen.add(leer, "wrap");
		
		hinzufügen.add(starten, "span, growx");
		starten.setEnabled(false);
		
		
		
		
		menü.add(neu, "wrap");
		menü.add(laden, "growx");
		
		
		
		
		
		
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
		taxizahl.setFont(f1);
		JLabel buszahl = new JLabel("0");
		buszahl.setFont(f1);
		JLabel bahnzahl = new JLabel("0");
		bahnzahl.setFont(f1);
		JLabel blackzahl = new JLabel("0");
		blackzahl.setFont(f1);
		JLabel zweixzahl = new JLabel("0");
		zweixzahl.setFont(f1);

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
		
		
		
		sp.add(speichern);

		
		
		SpringLayout layout1 = new SpringLayout();
		layout1.putConstraint(SpringLayout.EAST, menü, -100, SpringLayout.EAST, bild);
		layout1.putConstraint(SpringLayout.NORTH, menü, 50, SpringLayout.NORTH, bild);
		
		
		
		//width 500:1600:1600
		bild.add(menü);
		bild.setLayout(layout1);	
		bild.add(panel);
		
		
		frame.add(bild);
		frame.setMinimumSize(new Dimension(1620, 950));
		
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
		        spiel.setFarbe(c.getRed());
		        
		        boolean bo = false;
		        
		        if(!spiel.getSpielbar()){
		        	bo = true;
		        }else{
		        	if(kontrolle()){
		        		bo = true;
		        	}
		        }

	    		
		        if(spiel.getFarbe() != 255 && bo){
		        		
		        		
		        	System.out.println("Station: " + spiel.getFarbe());
		        	stationFeld.setText(Integer.toString(spiel.getFarbe()));
			        if(spiel.getDran()==-1 && !spiel.getSpielbar()){
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
			        	if(spiel.getLength() == 3){
		        			bild.add(spieler4);
		        			layout1.putConstraint(SpringLayout.WEST, spieler4, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler4, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getLength() == 4){
		        			bild.add(spieler5);
		        			layout1.putConstraint(SpringLayout.WEST, spieler5, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler5, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getLength() == 5){
		        			bild.add(spieler6);
		        			layout1.putConstraint(SpringLayout.WEST, spieler6, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler6, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getLength() == 6){
		        			bild.add(spieler7);
		        			layout1.putConstraint(SpringLayout.WEST, spieler7, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler7, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getLength() == 7){
		        			bild.add(spieler8);
		        			layout1.putConstraint(SpringLayout.WEST, spieler8, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler8, b-10, SpringLayout.NORTH, bild);
		        		}
		        	}
			        
			        
			        
			        
			        if(spiel.getSpielbar()){


			    		MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
		        		
		        				        		
		        		if(spiel.getDran()==0){
		        			bild.remove(spieler1);
		        			bild.add(spieler1);
		        			layout1.putConstraint(SpringLayout.WEST, spieler1, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler1, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==1){
		        			bild.remove(spieler2);
		        			bild.add(spieler2);
		        			layout1.putConstraint(SpringLayout.WEST, spieler2, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler2, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==2){
		        			bild.remove(spieler3);
		        			bild.add(spieler3);
		        			layout1.putConstraint(SpringLayout.WEST, spieler3, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler3, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==3){
		        			bild.remove(spieler4);
		        			bild.add(spieler4);
		        			layout1.putConstraint(SpringLayout.WEST, spieler4, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler4, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==4){
		        			bild.remove(spieler5);
		        			bild.add(spieler5);
		        			layout1.putConstraint(SpringLayout.WEST, spieler5, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler5, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==5){
		        			bild.remove(spieler6);
		        			bild.add(spieler6);
		        			layout1.putConstraint(SpringLayout.WEST, spieler6, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler6, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==6){
		        			bild.remove(spieler7);
		        			bild.add(spieler7);
		        			layout1.putConstraint(SpringLayout.WEST, spieler7, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler7, b-10, SpringLayout.NORTH, bild);
		        		}
		        		if(spiel.getDran()==7){
		        			bild.remove(spieler8);
		        			bild.add(spieler8);
		        			layout1.putConstraint(SpringLayout.WEST, spieler8, a-10, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, spieler8, b-10, SpringLayout.NORTH, bild);
		        		}

			        	aktionAusfuehren();

			        	black.removeAll();
			        	zweix.removeAll();
			    		black.add(new JLabel(new ImageIcon("images/black.png")));
			    		zweix.add(new JLabel(new ImageIcon("images/2x.png")));
			        	
			        	if(spiel.getSpielSpieler().getName() == misterx.getName()){
			        	
				        	for(int l=0; l<5; l++){
				        		spiel.setKfz(spiel.getKfz(l+1), l);
				        		//kfz[l]=kfz[l+1];
				        	}
				        	
				        	if(spiel.getZeigen()){
				        		spiel.setKfz(spiel.getLetzterXZug() + " zur " + misterx.getStandort(), 5);
				        	}else{
				        		spiel.setKfz(spiel.getLetzterXZug(), 5);
				        	}
				        	
				        	updateZugLabel(zug);
				        	

				        	if(spiel.getInRunden() > 1){
				        		zeige.setText(spiel.getInRunden() + " Runden");
				        	}else{
				        		zeige.setText(spiel.getInRunden() + " Runde");
				        	}
			        	}
			        	
			        	weiter();
						chips.setBorder(BorderFactory.createTitledBorder(spiel.getSpielSpieler().getName()));
						rundenzahl.setText("Runde: " + Integer.toString(spiel.getRunde()));
				        taxizahl.setText((Integer.toString(spiel.getSpielSpieler().getTaxiChips())));
				        buszahl.setText((Integer.toString(spiel.getSpielSpieler().getBusChips())));
				        bahnzahl.setText((Integer.toString(spiel.getSpielSpieler().getBahnChips())));
				        
				        if(spiel.getSpielSpieler().getName() == misterx.getName()){
				        	chips.add(blackzahl);
				        	chips.add(black, "wrap");
				        	chips.add(zweixzahl);
				        	chips.add(zweix);
				        	blackzahl.setText((Integer.toString(((MisterX) spiel.getSpielSpieler()).getBlackTickets())));
				        	zweixzahl.setText((Integer.toString(((MisterX) spiel.getSpielSpieler()).getDoubleChips())));
				        	
				        }else{
				        	chips.remove(blackzahl);
				        	chips.remove(black);
				        	chips.remove(zweixzahl);
				        	chips.remove(zweix);
				        }
				        
				        
				        if(spiel.getGewonnen() != 0){
				        	bild.add(win);
				        	layout1.putConstraint(SpringLayout.WEST, win, 150, SpringLayout.WEST, bild);
					        layout1.putConstraint(SpringLayout.NORTH, win, 50, SpringLayout.NORTH, bild);
					        if(Integer.toString(spiel.getXWin(spiel.getSpieler(), misterx)).equals(""+2)){
					        	gewonnen.setText("Mister X wurde gefunden!");
					        }
					        if(Integer.toString(spiel.getXWin(spiel.getSpieler(), misterx)).equals(""+1)){
					        	gewonnen.setText("Mister X ist entkommen!");
					        }
					        spiel.setSpielbar(false);
					        
			        		frame.pack();
				        }
				        
		        	}

			        frame.pack();
			        
			        
			        
			        
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
		
				ObjectPersistenceManager ladeManager = new ObjectPersistenceManager();
//				 = ladeManager.ladeSpiel("test");
//				MisterXSpiel geladenesSpiel = ladeManager.ladeSpiel("test");
				spiel = ladeManager.ladeSpiel("test");
				//spiel = geladenesSpiel.spiel;
				
//				getMainWindow() = ladeManager.ladeSpiel("test");
				
				
				bild.add(spieler1);
				layout1.putConstraint(SpringLayout.WEST, spieler1, spiel.getSp1Loc().x, SpringLayout.WEST, bild);
				layout1.putConstraint(SpringLayout.NORTH, spieler1, spiel.getSp1Loc().y, SpringLayout.NORTH, bild);
				bild.add(spieler2);
				layout1.putConstraint(SpringLayout.WEST, spieler2, spiel.getSp2Loc().x, SpringLayout.WEST, bild);
				layout1.putConstraint(SpringLayout.NORTH, spieler2, spiel.getSp2Loc().y, SpringLayout.NORTH, bild);
				if(spiel.getSp3Loc() != null){
					bild.add(spieler3);
					layout1.putConstraint(SpringLayout.WEST, spieler3, spiel.getSp3Loc().x, SpringLayout.WEST, bild);
					layout1.putConstraint(SpringLayout.NORTH, spieler3, spiel.getSp3Loc().y, SpringLayout.NORTH, bild);
				}
				if(spiel.getSp4Loc() != null){
					bild.add(spieler4);
					layout1.putConstraint(SpringLayout.WEST, spieler3, spiel.getSp4Loc().x, SpringLayout.WEST, bild);
					layout1.putConstraint(SpringLayout.NORTH, spieler3, spiel.getSp4Loc().y, SpringLayout.NORTH, bild);
				}
				if(spiel.getSp5Loc() != null){
					bild.add(spieler5);
					layout1.putConstraint(SpringLayout.WEST, spieler3, spiel.getSp5Loc().x, SpringLayout.WEST, bild);
					layout1.putConstraint(SpringLayout.NORTH, spieler3, spiel.getSp5Loc().y, SpringLayout.NORTH, bild);
				}
				if(spiel.getSp6Loc() != null){
					bild.add(spieler6);
					layout1.putConstraint(SpringLayout.WEST, spieler3, spiel.getSp6Loc().x, SpringLayout.WEST, bild);
					layout1.putConstraint(SpringLayout.NORTH, spieler3, spiel.getSp6Loc().y, SpringLayout.NORTH, bild);
				}
				if(spiel.getSp7Loc() != null){
					bild.add(spieler7);
					layout1.putConstraint(SpringLayout.WEST, spieler3, spiel.getSp7Loc().x, SpringLayout.WEST, bild);
					layout1.putConstraint(SpringLayout.NORTH, spieler3, spiel.getSp7Loc().y, SpringLayout.NORTH, bild);
				}
				if(spiel.getSp8Loc() != null){
					bild.add(spieler8);
					layout1.putConstraint(SpringLayout.WEST, spieler3, spiel.getSp8Loc().x, SpringLayout.WEST, bild);
					layout1.putConstraint(SpringLayout.NORTH, spieler3, spiel.getSp8Loc().y, SpringLayout.NORTH, bild);
				}
				
				bild.remove(menü);
				bild.add(chips);
				layout1.putConstraint(SpringLayout.EAST, chips, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, chips, 50, SpringLayout.NORTH, bild);
				bild.add(runde);
				layout1.putConstraint(SpringLayout.EAST, runde, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, runde, 10, SpringLayout.NORTH, bild);
				
				
				bild.add(mrX);
				layout1.putConstraint(SpringLayout.EAST, mrX, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.SOUTH, mrX, -100, SpringLayout.SOUTH, bild);
				bild.add(sp);
				layout1.putConstraint(SpringLayout.EAST, sp, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.SOUTH, sp, -60, SpringLayout.SOUTH, bild);
				
				
				if(spiel.getInRunden() > 1){
	        		zeige.setText(spiel.getInRunden() + " Runden");
	        	}else{
	        		zeige.setText(spiel.getInRunden() + " Runde");
	        	}
				
				updateZugLabel(zug);
				MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
				rundenzahl.setText("Runde: " + Integer.toString(spiel.getRunde()));
				chips.setBorder(BorderFactory.createTitledBorder(spiel.getSpielSpieler().getName()));
		        taxizahl.setText((Integer.toString(spiel.getSpielSpieler().getTaxiChips())));
		        buszahl.setText((Integer.toString(spiel.getSpielSpieler().getBusChips())));
		        bahnzahl.setText((Integer.toString(spiel.getSpielSpieler().getBahnChips())));
		        
		        if(spiel.getSpielSpieler().getName() == misterx.getName()){
		        	chips.add(blackzahl);
		        	chips.add(black, "wrap");
		        	chips.add(zweixzahl);
		        	chips.add(zweix);
		        	blackzahl.setText((Integer.toString(((MisterX) spiel.getSpielSpieler()).getBlackTickets())));
		        	zweixzahl.setText((Integer.toString(((MisterX) spiel.getSpielSpieler()).getDoubleChips())));
			        	
		        }else{
		        	chips.remove(blackzahl);
		        	chips.remove(black);
		        	chips.remove(zweixzahl);
		        	chips.remove(zweix);
		        }
				

				frame.pack();
				
				System.out.println("Spiel wurde geladen");
				
				
				
//				for(int i=0; i<frame.getWidth(); i++){
//					for(int j=0; j<frame.getHeight(); j++){
//						
//						int rgb = image.getRGB(i, j);
//				        Color c = new Color(rgb);
//				        farbeladen = c.getRed();
//				        System.out.println(spieler.getStandort().getName());
////				        if(farbeladen+"" == spieler.getStandort().getName()){
//				        
//					        bild.add(spieler1);
//					        layout1.putConstraint(SpringLayout.WEST, spieler1, i-10, SpringLayout.WEST, bild);
//					        layout1.putConstraint(SpringLayout.NORTH, spieler1, j-10, SpringLayout.NORTH, bild);
//		        	
////				        }
//					        
//					}
//				}
				
			}
		});
		
		spielerbt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {

				String name = nameFeld.getText();
				boolean ok = false;
				try {
					ok = isAlpha(name); 
				} catch (EingabeException eex) {
					System.err.println(eex.getMessage());
				}
				
					

				try{	
					if(ok && stationFeld.getText() != "Karte klicken"){
						Station station = spiel.getStationByIndex(spiel.getFarbe()-1);
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
					JOptionPane.showMessageDialog(frame, e.getMessage(), "Spieler existiert schon", JOptionPane.ERROR_MESSAGE);
//					System.out.println("Spieler mit dem Namen " + name + " existiert bereits.");
				}
				
				if(spiel.getXnr() != -1 && spiel.getLength() > 1){
					starten.setEnabled(true);
				}
			}
		});
		
		
		misterXbt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {
				
				String name = nameFeld.getText();
				boolean ok = false;
				try {
					ok = isAlpha(name); 
				} catch (EingabeException eex) {
					System.err.println(eex.getMessage());
				}

				
				try{	
					if(ok && stationFeld.getText() != "Karte klicken"){
						Station station = spiel.getStationByIndex(spiel.getFarbe()-1);
						//System.out.println(station);
						Spieler neuerSpieler = new MisterX(name);
						neuerSpieler.setStandort(station);
						spiel.spielerHinzufügen(neuerSpieler);
						//System.out.println("Mister X mit dem Namen " + name + " wurde angelegt.");
						System.out.println(neuerSpieler + " (Mister X)");
						spiel.setXnr(spiel.getLength()-1);
						
						nameFeld.setText("");
						stationFeld.setText("Karte klicken");
						misterXbt.setEnabled(false);
					}else{
						nameFeld.setText("keine Sonderzeichen oder Zahlen");
					}
				
				}catch (SpielerExistiertBereitsException e){
				System.out.println("Spieler mit dem Namen " + name + " existiert bereits.");	
				}
				
				if(spiel.getXnr() != -1 && spiel.getLength() > 1){
					starten.setEnabled(true);
				}
			}
		});
		
		
		starten.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {
				
				for (int j = 0; j < 5; j++) {
//					Station strasse = spiel.getStationByIndex(j);
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
				bild.add(runde);
				layout1.putConstraint(SpringLayout.EAST, runde, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.NORTH, runde, 10, SpringLayout.NORTH, bild);
//				bild.add(lepos);
//				layout1.putConstraint(SpringLayout.EAST, lepos, -100, SpringLayout.EAST, bild);
//				layout1.putConstraint(SpringLayout.SOUTH, lepos, -50, SpringLayout.SOUTH, bild);				
//				bild.add(lezug);
//				layout1.putConstraint(SpringLayout.EAST, lezug, -100, SpringLayout.EAST, bild);
//				layout1.putConstraint(SpringLayout.SOUTH, lezug, -100, SpringLayout.SOUTH, bild);
				bild.add(mrX);
				layout1.putConstraint(SpringLayout.EAST, mrX, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.SOUTH, mrX, -100, SpringLayout.SOUTH, bild);
				bild.add(sp);
				layout1.putConstraint(SpringLayout.EAST, sp, -100, SpringLayout.EAST, bild);
				layout1.putConstraint(SpringLayout.SOUTH, sp, -60, SpringLayout.SOUTH, bild);
//				bild.add(chips2);
//				layout1.putConstraint(SpringLayout.EAST, chips2, -100, SpringLayout.EAST, bild);
//				layout1.putConstraint(SpringLayout.NORTH, chips2, 300, SpringLayout.NORTH, bild);
				frame.pack();
				System.out.println();
				System.out.println("Spiel wurde gestartet!");
				System.out.println();
				
				//aktionAusfuehren();
				spiel.setSpielbar(true);
				weiter();
//				i = 1;

				MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
				chips.setBorder(BorderFactory.createTitledBorder(spiel.getSpielSpieler().getName()));
		        taxizahl.setText((Integer.toString(spiel.getSpielSpieler().getTaxiChips())));
		        buszahl.setText((Integer.toString(spiel.getSpielSpieler().getBusChips())));
		        bahnzahl.setText((Integer.toString(spiel.getSpielSpieler().getBahnChips())));
		        
		        if(spiel.getSpielSpieler().getName() == misterx.getName()){
		        	chips.add(blackzahl);
		        	chips.add(black, "wrap");
		        	chips.add(zweixzahl);
		        	chips.add(zweix);
		        	blackzahl.setText((Integer.toString(((MisterX) spiel.getSpielSpieler()).getBlackTickets())));
		        	zweixzahl.setText((Integer.toString(((MisterX) spiel.getSpielSpieler()).getDoubleChips())));
			        	
		        }else{
		        	chips.remove(blackzahl);
		        	chips.remove(black);
		        	chips.remove(zweixzahl);
		        	chips.remove(zweix);
		        }

	        	zeige.setText("3 Runden");
				frame.pack();
			}
		});
		
		
		
		
		black.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent m) {
				MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
				black.removeAll();
				if(!spiel.getAktb() && misterx.getBlackTickets()>0){
					black.add(new JLabel(new ImageIcon("images/blackakt.png")));
					spiel.setAktb(true);
				}else{
					black.add(new JLabel(new ImageIcon("images/black.png")));
					spiel.setAktb(false);
				}
				frame.pack();
				
				
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
		
		
		
		
		zweix.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent m) {
				MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
				zweix.removeAll();
				if(!spiel.getAkt2() && misterx.getDoubleChips()>0){
					zweix.add(new JLabel(new ImageIcon("images/2xakt.png")));
					spiel.setAkt2(true);
				}else{
					zweix.add(new JLabel(new ImageIcon("images/2x.png")));
					spiel.setAkt2(false);
				}
				frame.pack();
				
				
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
		
		
		
		
		speichern.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent a) {
//				Point point = new Point();
//				point.
				spiel.setSp1Loc(spieler1.getLocation());
				spiel.setSp2Loc(spieler2.getLocation());
				if(spieler3.getX()>0){
					spiel.setSp3Loc(spieler3.getLocation());
				}
				if(spieler4.getX()>0){
					spiel.setSp4Loc(spieler4.getLocation());
				}
				if(spieler5.getX()>0){
					spiel.setSp5Loc(spieler5.getLocation());
				}
				if(spieler6.getX()>0){
					spiel.setSp6Loc(spieler6.getLocation());
				}
				if(spieler7.getX()>0){
					spiel.setSp7Loc(spieler7.getLocation());
				}
				if(spieler8.getX()>0){
					spiel.setSp8Loc(spieler8.getLocation());
				}
				
				
				ObjectPersistenceManager objectPersistenceManager = new ObjectPersistenceManager();
				objectPersistenceManager.speichereSpiel(spiel, "test");
				
				System.out.println("");
				System.out.println("Spiel wurde gepeichert!");
				System.out.println("");
			}
		});
		
	}
	
	
	
	
	
	public void weiter(){
		

		MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
		
		
		if(spiel.getSonderchips() != 3 && spiel.getSonderchips() != 4){
			spiel.setDran((spiel.getDran()+1) % spiel.getLength());
			spiel.setSpielSpieler(spiel.getSpielerByIndex(spiel.getDran()));
		}
		
		spiel.setSonderchips(1);
		
		
		//speichern
		
		
		if(spiel.getDran()==0){
			spiel.getNaechsteRunde();
			System.out.println("Runde " + spiel.getRunde());
		}
		
		
		

		if(spiel.getXnr()+1 < spiel.getLength()){
			if(spiel.getDran() == spiel.getXnr()+1){
				if(spiel.getLetzterXZug() != null){
					System.out.println("Letztes Verkehrsmittel von Mister X: " + spiel.getLetzterXZug());
				}		
				if(spiel.getZeigen()){
					System.out.println("Mister X ist bei der " + misterx.getStandort());
				}
			}
		}else{
			if(spiel.getDran() == 0){
				if(spiel.getLetzterXZug() != null){
					System.out.println("Letztes Verkehrsmittel von Mister X: " + spiel.getLetzterXZug());
				}		
				if(spiel.getZeigen()){
					System.out.println("Mister X ist bei der " + misterx.getStandort());
				}
			}
		}
		

		System.out.println(spiel.getSpielSpieler().getName() + " ist an der Reihe");
	}
	
	
	
	
	public boolean kontrolle(){


		Iterator<Station> nachbIterator = spiel.getSpielSpieler().getStandort().getTaxiNachbarn().iterator();
		//if(spieler.getTaxiChips()>0){
			if(nachbIterator.hasNext()){
				while (nachbIterator.hasNext()) {
					if(nachbIterator.next().getName().equals(""+spiel.getFarbe())){
						spiel.setVerk(1);
						return true;
					}
				}
			}
		//}

		
		nachbIterator = spiel.getSpielSpieler().getStandort().getBusNachbarn().iterator();
		if(spiel.getSpielSpieler().getBusChips()>0){
			if(nachbIterator.hasNext()){
				while (nachbIterator.hasNext()) {
					if(nachbIterator.next().getName().equals(""+spiel.getFarbe())){
						spiel.setVerk(2);
						return true;
					}
				}
			}
		}
		
		nachbIterator = spiel.getSpielSpieler().getStandort().getBahnNachbarn().iterator();
		if(spiel.getSpielSpieler().getBahnChips()>0){
			if(nachbIterator.hasNext()){
				while (nachbIterator.hasNext()) {
					if(nachbIterator.next().getName().equals(""+spiel.getFarbe())){
						spiel.setVerk(3);
						return true;
					}
				}
			}
		}
		
		
		return false;
		
	}
	
	
	
	public void aktionAusfuehren(){

		MisterX misterx = (MisterX) spiel.getSpielerByIndex(spiel.getXnr());
		
		
		
//		if(spieler.getName() == misterx.getName()){
//			System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
//					+ spieler.getBusChips() + " Buschips, " + spieler.getBahnChips() + " U-Bahnchips, " + 
//					((MisterX) spieler).getBlackTickets() + " Black Tickets und " + ((MisterX) spieler).getDoubleChips() + " Doppelchips.");
//		}else{
//			System.out.println(spieler.getName() + " besitzt: " + spieler.getTaxiChips() + " Taxichips, " 
//					+ spieler.getBusChips() + " Buschips und " + spieler.getBahnChips() + " U-Bahnchips.");
//		}
//		
		
		
		if(spiel.getSpielSpieler().getTaxiChips()==0 && spiel.getSpielSpieler().getBusChips()==0 && spiel.getSpielSpieler().getBahnChips()==0){
			System.out.println("Spiel zuende!");
		}
		
		
		
		
		
//		System.out.println(xnr);
		
		
//		int zaehler = 0;
//		int nachbar = 0;
//		Iterator<Station> nachbIterator = spieler.getStandort().getTaxiNachbarn().iterator();
//		if(spieler.getTaxiChips()>0){
//			if(nachbIterator.hasNext()){
//				while (nachbIterator.hasNext()) {
//					zaehler++;
//					if(nachbIterator.next().getName().equals(""+farbe)){
//						nachbar = zaehler;
//						System.out.println("erfolg");
//						System.out.println(nachbar);
//					}
//				}
//			}
//		}
//		
//		System.out.println("test " +farbe + " "+ nachbar);
		
		
		if(spiel.getAkt2()){
			spiel.setSonderchips(3);
		}
		if(spiel.getAktb()){
			spiel.setSonderchips(2);
			if(spiel.getAkt2()){
				spiel.setSonderchips(4);
			}
		}
		
		spiel.setAktb(false);
		spiel.setAkt2(false);
		
		
		if(spiel.getVerk() == 1){
			spiel.taxiFahren(spiel.getStationByIndex(spiel.getFarbe()-1), spiel.getSpielSpieler(), misterx);
		}

		if(spiel.getVerk() == 2){
			spiel.busFahren(spiel.getStationByIndex(spiel.getFarbe()-1), spiel.getSpielSpieler(), misterx);
		}

		if(spiel.getVerk() == 3){
			spiel.bahnFahren(spiel.getStationByIndex(spiel.getFarbe()-1), spiel.getSpielSpieler(), misterx);
		}
		
		
		//spiel.getLetzterXZug()
		
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
		
		System.out.println("Du stehst nun an der " + spiel.getSpielSpieler().getStandort());
		System.out.println();
		
		
		
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

	private void updateZugLabel(JLabel zug) {
		int nul=-1;
		for(int l=0; l<6; l++){
			if(spiel.getKfz(l) == null){
				nul = l;
			}
		}

		switch(nul){
		case -1:zug.setText("<html>" + spiel.getKfz(5)+"<br>"+spiel.getKfz(4)+"<br>"+spiel.getKfz(3)+"<br>"+spiel.getKfz(2)+"<br>"+spiel.getKfz(1)+"<br>"+spiel.getKfz(0)+"</html>");
		break;
		case 0 :zug.setText("<html>" + spiel.getKfz(5)+"<br>"+spiel.getKfz(4)+"<br>"+spiel.getKfz(3)+"<br>"+spiel.getKfz(2)+"<br>"+spiel.getKfz(1)+"</html>");
		break;
		case 1 :zug.setText("<html>" + spiel.getKfz(5)+"<br>"+spiel.getKfz(4)+"<br>"+spiel.getKfz(3)+"<br>"+spiel.getKfz(2)+"</html>");
		break;
		case 2 :zug.setText("<html>" + spiel.getKfz(5)+"<br>"+spiel.getKfz(4)+"<br>"+spiel.getKfz(3)+"</html>");
		break;
		case 3 :zug.setText("<html>" + spiel.getKfz(5)+"<br>"+spiel.getKfz(4)+"</html>");
		break;
		case 4 :zug.setText("<html>" + spiel.getKfz(5)+"</html>");
		break;
		default: zug.setText("nicht gefahren");
		}
	}




	
	
	
	
}
