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
		
		
		JPanel hinzuf�gen = new JPanel(new MigLayout(""));
		hinzuf�gen.setBorder(BorderFactory.createTitledBorder("Hinzuf�gen"));
		
		hinzuf�gen.add(name);
		hinzuf�gen.add(nameFeld, "growx, wrap");
		
		hinzuf�gen.add(station);
		hinzuf�gen.add(stationFeld, "growx, wrap");
		
		hinzuf�gen.add(leer, "wrap");
		
		hinzuf�gen.add(rolle, "span, wrap");
		
		hinzuf�gen.add(spieler);
		hinzuf�gen.add(misterX);
		
		panel.add(hinzuf�gen);
		
		
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
		
		//nach wrap n�chste Zeile
		//span �ber ganze zeile
		//center mitte
	}
	
}
