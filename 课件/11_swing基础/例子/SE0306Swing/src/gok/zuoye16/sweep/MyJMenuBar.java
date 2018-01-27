package gok.zuoye16.sweep;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 菜单条
 * 
 * @author admin
 * 
 */
public class MyJMenuBar extends JMenuBar {
	public MyJMenuBar() {
		init();
	}

	private void init() {

		JMenu menuGame = new JMenu("游戏(G)");
		JMenu menuHelp = new JMenu("帮助(H)");

		JMenuItem menuItem = new JMenuItem("开始");

		JMenuItem menuItemC = new JMenuItem("初级");
		JMenuItem menuItemZ = new JMenuItem("中级");
		JMenuItem menuItemG = new JMenuItem("高级");

		JMenu menuScore = new JMenu("游戏成绩(二级菜单)");
		JMenuItem menuItemScoreC = new JMenuItem("初级");
		JMenuItem menuItemScoreZ = new JMenuItem("中级");
		JMenuItem menuItemScoreG = new JMenuItem("高级");
		menuScore.add(menuItemScoreC);
		menuScore.add(menuItemScoreZ);
		menuScore.add(menuItemScoreG);
		JMenuItem menuItemExit = new JMenuItem("退出");

		menuGame.add(menuItem);
		menuGame.addSeparator();
		menuGame.add(menuItemC);
		menuGame.add(menuItemZ);
		menuGame.add(menuItemG);
		menuGame.addSeparator();
		// 菜单中添加菜单
		menuGame.add(menuScore);
		menuGame.addSeparator();
		menuGame.add(menuItemExit);

		JMenuItem menuItemCopy = new JMenuItem("版权");
		JMenuItem menuItemAbout = new JMenuItem("关于");

		menuHelp.add(menuItemCopy);
		menuHelp.add(menuItemAbout);

		this.add(menuGame);
		this.add(menuHelp);

	}

}
