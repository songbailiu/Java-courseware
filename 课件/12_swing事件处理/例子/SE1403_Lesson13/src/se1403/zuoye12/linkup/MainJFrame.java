package se1403.zuoye12.linkup;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainJFrame extends JFrame {
	MapJPanel mapJPanel = new MapJPanel();
	
	public MainJFrame() {
		this.add(mapJPanel);
		this.setTitle("JAVAÁ¬Á¬¿´");
		this.setSize(new Dimension(640, 540));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MainJFrame();
	}

}
