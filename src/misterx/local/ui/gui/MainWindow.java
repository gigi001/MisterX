package misterx.local.ui.gui;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MainWindow {
	
	public void create(){
		JFrame frame = new JFrame("Mister X");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(10,10);
		frame.setSize(1600, 900);

		JPanel panel = new JPanel(new MigLayout(""));	//debug
		
		JLabel name = new JLabel("Name: ");
		JLabel station = new JLabel("Startstation: ");
		JLabel rolle = new JLabel("Rolle des neuen Spielers: ");
		JLabel leer = new JLabel("");
		
		JTextField nameFeld = new JTextField();
		JTextField stationFeld = new JTextField();
		
		JButton spieler = new JButton("Sucher");
		JButton misterX = new JButton("Mister X");
		
		
		JPanel hinzufügen = new JPanel(new MigLayout(""));
		hinzufügen.setBorder(BorderFactory.createTitledBorder("Hinzufügen"));
		
		hinzufügen.add(name);
		hinzufügen.add(nameFeld, "growx, wrap");
		
		hinzufügen.add(station);
		hinzufügen.add(stationFeld, "growx, wrap");
		
		hinzufügen.add(leer, "wrap");
		
		hinzufügen.add(rolle, "span, wrap");
		
		hinzufügen.add(spieler);
		hinzufügen.add(misterX);
		
		panel.add(hinzufügen);
		
		
		JPanel bild = new JPanel(new MigLayout(""));
		
		//String path = "/karte.png";
		String path = "d:\\Program Files (x86)\\MisterX\\karte.png";
		ImageIcon icon = new ImageIcon(path);
		JLabel l1 = new JLabel(icon);
		bild.add(l1);
		
		panel.add(bild);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
		//nach wrap nächste Zeile
		//span über ganze zeile
		//center mitte
	}
	
}
