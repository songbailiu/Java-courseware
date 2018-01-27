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
	// ������� ѡ����

	public Test09JTabbedPane() {
		init();

		this.setTitle("ѡ����");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// �Զ�������С
		// this.pack();
	}

	private void init() {

		JPanel panel1 = new JPanel();
		panel1.add(new JButton("��ť1"));

		JPanel panel2 = new JPanel();
		panel2.add(new JButton("��ť2"));

		//
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.add("����һ", panel1);
		jTabbedPane.add("�����", panel2);

		this.add(jTabbedPane);

	}

	public static void main(String[] args) {
		//����Ƥ��   ����Ҫ�ڽ����ʼ��֮ǰ
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		new Test09JTabbedPane();
	}

}
