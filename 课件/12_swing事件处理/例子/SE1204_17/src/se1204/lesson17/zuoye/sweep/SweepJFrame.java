package se1204.lesson17.zuoye.sweep;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SweepJFrame extends JFrame {
	private MyJMenuBar menuBar = new MyJMenuBar();

	private MyFacePanel facePanel = new MyFacePanel();

	private MyCenterPanel centerPanel = new MyCenterPanel();

	public SweepJFrame() {
		this.setJMenuBar(menuBar);
		this.add(facePanel, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
		this.setTitle("É¨À×");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new SweepJFrame();
	}

}
