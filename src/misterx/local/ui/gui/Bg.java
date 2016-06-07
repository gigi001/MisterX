package misterx.local.ui.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Bg extends Panel {
	
	private int b;
	private int h;
	private String path1 = "images/karte.jpg";
	private ImageIcon icon;
	private Image image;
	
	public Bg(int br, int hö){
		this.b = br;
		this.h = hö;
		icon = new ImageIcon(path1);
		//image = icon.getImage();
		image = Toolkit.getDefaultToolkit().createImage("images/karte.jpg");
		//this.add(image);
	}
	
	public void paintComponent(Graphics g){
//		BufferedImage resizedImage =  new BufferedImage(b,h,BufferedImage.TYPE_INT_RGB);
//		Graphics g2 = resizedImage.createGraphics();
//		g2.drawImage(image, 0, 0, b, h, null);
//		icon = new ImageIcon(path1);
//		image = icon.getImage();
//		super.paintComponent(g);
//		if(image != null){
			g.drawImage(image, 0, 0, null);
//		}
		
	}
}
