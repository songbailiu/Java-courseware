package gok.lesson16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class Test09JTabbedPane extends JFrame {
	// 标题面板 选项卡面板

	public Test09JTabbedPane() {
		init();

		this.setTitle("选项卡面板");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// 自动调整大小
		// this.pack();
	}

	private void init() {

		JPanel panel1 = new JPanel();
		panel1.add(new JButton("按钮1"));

		JPanel panel2 = new JPanel();
		panel2.add(new JButton("按钮2"));

		//
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.add("标题一", panel1);
		jTabbedPane.add("标题二", panel2);

		this.add(jTabbedPane);

	}

	public static void main(String[] args) {
		//设置皮肤   必须要在界面初始化之前
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		new Test09JTabbedPane();
	}

}
