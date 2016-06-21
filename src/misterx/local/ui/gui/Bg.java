package misterx.local.ui.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Bg extends JPanel {
	
	private String path1 = "images/karte.jpg";
	private ImageIcon icon;
	private Image image;
	
	public Bg(){
		icon = new ImageIcon(path1);
		image = icon.getImage();
	}
	
	public void paintComponent(Graphics g){
		icon = new ImageIcon(path1);
		image = icon.getImage();
		super.paintComponent(g);
		if(image != null){
			g.drawImage(image, 0, 0,this.getWidth(),this.getHeight(), null);
		}
		
	}
}
