package se1403.zuoye12.sweep;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SweepFrame extends JFrame {
	MyJMenuBar menuBar = new MyJMenuBar();

	FaceJPanel faceJPanel = new FaceJPanel();
	BombPanel bombPanel = new BombPanel();

	public SweepFrame() {

		this.setJMenuBar(menuBar);

		this.add(faceJPanel, BorderLayout.NORTH);

		this.add(bombPanel);
		// icon,ImageIcon,Image
		// Õº∆¨
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		// ÕºœÒ
		Image image = imageIcon.getImage();
		// ¥∞ÃÂ…Ë÷√ÕºœÒ
		this.setIconImage(image);
		this.setTitle("JAVA…®¿◊");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.pack();
	}

	public static void main(String[] args) {
		new SweepFrame();
	}

}
