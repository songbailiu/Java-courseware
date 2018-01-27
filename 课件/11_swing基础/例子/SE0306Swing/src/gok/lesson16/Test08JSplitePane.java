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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test08JSplitePane extends JFrame {
	// 分割面板

	public Test08JSplitePane() {
		init();

		this.setTitle("分割面板");
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
		panel2.add(new JButton("按钮1"));

		// 可以水品分割也可以纵向分割
		JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				panel1, panel2);
		//设置分割条位置
		jSplitPane.setDividerLocation(150);
		this.add(jSplitPane);

	}

	public static void main(String[] args) {
		new Test08JSplitePane();
	}

}
