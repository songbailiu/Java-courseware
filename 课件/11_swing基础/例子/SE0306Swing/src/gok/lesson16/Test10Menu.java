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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class Test10Menu extends JFrame {
	// �˵��� --�� �˵�--���˵��� --�� ����
	public Test10Menu() {
		init();

		this.setTitle("�˵�");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// �Զ�������С
		// this.pack();
	}

	private void init() {
		// �˵���
		JMenuBar jMenuBar = new JMenuBar();

		// �˵�
		JMenu menuGame = new JMenu("��Ϸ");
		JMenu menuHelp = new JMenu("����");

		// �˵���
		JMenuItem menuItemStart = new JMenuItem("��ʼ");
		JMenuItem menuItemC = new JMenuItem("����");
		JMenuItem menuItemZ = new JMenuItem("�м�");
		JMenuItem menuItemG = new JMenuItem("�߼�");
		JMenuItem menuItemExit = new JMenuItem("�˳�");
		menuGame.add(menuItemStart);
		// �˵��ָ���
		menuGame.addSeparator();
		menuGame.add(menuItemC);
		menuGame.add(menuItemZ);
		menuGame.add(menuItemG);
		// �˵��ָ���
		menuGame.addSeparator();
		menuGame.add(menuItemExit);

		JMenuItem menuItemAbout = new JMenuItem("��Ϸ�汾");
		JMenuItem menuItemHelp = new JMenuItem("����");
		menuHelp.add(menuItemHelp);
		menuHelp.add(menuItemAbout);

		// �����˵�:�˵�����Ӳ˵�
		JMenu menuTwo = new JMenu("�����˵�");
		JRadioButtonMenuItem menuItem1 = new JRadioButtonMenuItem("�˵�һ");
		JCheckBoxMenuItem menuItem2 = new JCheckBoxMenuItem("�˵���");
		menuTwo.add(menuItem1);
		menuTwo.add(menuItem2);
		menuHelp.add(menuTwo);

		// �˵�--���˵���
		jMenuBar.add(menuGame);
		jMenuBar.add(menuHelp);

		// ���ÿ�ݼ� ALT + ��
		menuGame.setMnemonic('G');
		menuHelp.setMnemonic('H');

		// �������ò˵���
		this.setJMenuBar(jMenuBar);
	}

	public static void main(String[] args) {
		// ����Ƥ�� ����Ҫ�ڽ����ʼ��֮ǰ
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new Test10Menu();
	}

}
