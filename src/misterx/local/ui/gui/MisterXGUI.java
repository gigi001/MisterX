package misterx.local.ui.gui;

import java.io.Serializable;

public class MisterXGUI implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6504438308185216574L;
	
	
	private MainWindow mainw = new MainWindow();
	
	
	
	public void initialize(){
		//mainw.create();
	}
	
	
	

	public static void main(String[] args) {
		MisterXGUI gui = new MisterXGUI();
		gui.initialize();
	}
	
}
