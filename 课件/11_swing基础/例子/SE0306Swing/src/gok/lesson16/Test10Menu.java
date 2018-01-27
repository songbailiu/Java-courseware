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
	// 菜单项 --》 菜单--》菜单条 --》 窗体
	public Test10Menu() {
		init();

		this.setTitle("菜单");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// 自动调整大小
		// this.pack();
	}

	private void init() {
		// 菜单条
		JMenuBar jMenuBar = new JMenuBar();

		// 菜单
		JMenu menuGame = new JMenu("游戏");
		JMenu menuHelp = new JMenu("帮助");

		// 菜单条
		JMenuItem menuItemStart = new JMenuItem("开始");
		JMenuItem menuItemC = new JMenuItem("初级");
		JMenuItem menuItemZ = new JMenuItem("中级");
		JMenuItem menuItemG = new JMenuItem("高级");
		JMenuItem menuItemExit = new JMenuItem("退出");
		menuGame.add(menuItemStart);
		// 菜单分割线
		menuGame.addSeparator();
		menuGame.add(menuItemC);
		menuGame.add(menuItemZ);
		menuGame.add(menuItemG);
		// 菜单分割线
		menuGame.addSeparator();
		menuGame.add(menuItemExit);

		JMenuItem menuItemAbout = new JMenuItem("游戏版本");
		JMenuItem menuItemHelp = new JMenuItem("帮助");
		menuHelp.add(menuItemHelp);
		menuHelp.add(menuItemAbout);

		// 二级菜单:菜单中添加菜单
		JMenu menuTwo = new JMenu("二级菜单");
		JRadioButtonMenuItem menuItem1 = new JRadioButtonMenuItem("菜单一");
		JCheckBoxMenuItem menuItem2 = new JCheckBoxMenuItem("菜单二");
		menuTwo.add(menuItem1);
		menuTwo.add(menuItem2);
		menuHelp.add(menuTwo);

		// 菜单--》菜单条
		jMenuBar.add(menuGame);
		jMenuBar.add(menuHelp);

		// 设置快捷键 ALT + 键
		menuGame.setMnemonic('G');
		menuHelp.setMnemonic('H');

		// 窗体设置菜单条
		this.setJMenuBar(jMenuBar);
	}

	public static void main(String[] args) {
		// 设置皮肤 必须要在界面初始化之前
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new Test10Menu();
	}

}
