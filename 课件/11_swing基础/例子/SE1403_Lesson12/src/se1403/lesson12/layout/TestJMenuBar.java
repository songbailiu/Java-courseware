package se1403.lesson12.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.PopupMenu;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 菜单与皮肤包,进度条
 * 
 * @author admin
 * 
 */
public class TestJMenuBar extends JFrame {
	// 菜单条，菜单，菜单项
	// 菜单项 加到菜单 菜单加入菜单条，窗体设置菜单条

	public TestJMenuBar() {
		init();
		testJProgressBar();

		this.setTitle("菜单");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		// 菜单条
		JMenuBar jMenuBar = new JMenuBar();
		// 菜单
		JMenu jMenuGame = new JMenu("游戏(G)");
		JMenu jMenuHelp = new JMenu("帮助(H)");
		// 设置快捷键
		jMenuGame.setMnemonic('G');
		jMenuHelp.setMnemonic('H');
		// 菜单项
		Icon icon = new ImageIcon("image/icon.gif");
		JMenuItem jMenuItemOpen = new JMenuItem("打开", icon);
		JMenuItem jMenuItemSave = new JMenuItem("保存");
		JMenuItem jMenuItemC = new JRadioButtonMenuItem("初级");
		JMenuItem jMenuItemZ = new JRadioButtonMenuItem("中级");
		// 菜单进行互斥效果
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jMenuItemC);

		buttonGroup.add(jMenuItemZ);

		JMenuItem jMenuItemG = new JCheckBoxMenuItem("高级");
		buttonGroup.add(jMenuItemG);
		JMenuItem jMenuItemExit = new JMenuItem("退出游戏");
		jMenuGame.add(jMenuItemOpen);
		jMenuGame.add(jMenuItemSave);
		// 菜单分割线
		jMenuGame.addSeparator();
		jMenuGame.add(jMenuItemC);
		jMenuGame.add(jMenuItemZ);
		jMenuGame.add(jMenuItemG);
		// 菜单分割线
		jMenuGame.addSeparator();
		jMenuGame.add(jMenuItemExit);
		JMenuItem jMenuItemAbout = new JMenuItem("关于游戏");
		JMenuItem jMenuItemCopy = new JMenuItem("版权声明");
		jMenuHelp.add(jMenuItemAbout);
		jMenuHelp.add(jMenuItemCopy);

		jMenuBar.add(jMenuGame);
		jMenuBar.add(jMenuHelp);

		// 窗体设置菜单条
		this.setJMenuBar(jMenuBar);

		// 右键PopupMenu

	}

	private void testJProgressBar() {
		JPanel jPanel = new JPanel();
		jPanel.add(new JButton("按钮"));
		this.add(jPanel);

		// 进度条
		final JProgressBar jProgressBar = new JProgressBar(0, 100);
		// 设置当前进度
		jProgressBar.setValue(50);
		// 是否显示进度字符串 百分比
		jProgressBar.setStringPainted(true);
		jProgressBar.setPreferredSize(new Dimension(200, 20));
		jPanel.add(jProgressBar);

		// 改变进度值 两种方式：后台线程或者计时器
		// 使用线程
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					int value = jProgressBar.getValue();
					value += 10;
					jProgressBar.setValue(value);
					//停止循环,结束线程
					if (value >= jProgressBar.getMaximum()) {
						break;
					}

					// 控件执行速度
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		// 启动线程
		thread.start();

	}

	public static void main(String[] args) {
		// 皮肤包:必须在界面创建之前设置
		try {
			// UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			// // com.sun.java.swing.plaf.motif.MotifLookAndFeel//java早起风格
			// com.sun.java.swing.plaf.windows.WindowsLookAndFeel//windows 风格
			// javax.swing.plaf.metal.MetalLookAndFeel//swing默认风格
			// 获得操作系统的默认风格
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new TestJMenuBar();
	}

}
