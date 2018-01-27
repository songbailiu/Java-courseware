package se1204.lesson17.zuoye.sweep;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 菜单条封装类
 * @author Administrator
 *
 */
public class MyJMenuBar extends JMenuBar {
	public MyJMenuBar() {
		init();
	}

	private void init() {
		JMenu menuGame = new JMenu("游戏");
		JMenu menuHelp = new JMenu("帮助");

		JMenuItem menuItemStart = new JMenuItem("开局");
		JMenuItem menuItemC = new JMenuItem("初级");
		JMenuItem menuItemZ = new JMenuItem("中级");
		JMenuItem menuItemG = new JMenuItem("高级");
		JMenuItem menuItemSelf = new JMenuItem("自定义");
		//使用二级菜单
		JMenu menuHero = new JMenu("英雄版");
		JMenuItem menuItemHeroC = new JMenuItem("初级英雄版");
		JMenuItem menuItemHeroZ = new JMenuItem("中级英雄版");
		JMenuItem menuItemHeroG = new JMenuItem("高级英雄版");
		menuHero.add(menuItemHeroC);
		menuHero.add(menuItemHeroZ);
		menuHero.add(menuItemHeroG);
		
		
		JMenuItem menuItemExit = new JMenuItem("退出");
		menuGame.add(menuItemStart);
		menuGame.addSeparator();
		menuGame.add(menuItemC);
		menuGame.add(menuItemZ);
		menuGame.add(menuItemG);
		
		menuGame.add(menuItemSelf);
		menuGame.addSeparator();
		menuGame.add(menuHero);
		menuGame.addSeparator();
		menuGame.add(menuItemExit);

		JMenuItem menuItemAbout = new JMenuItem("关于扫雷");
		JMenuItem menuItemHou = new JMenuItem("后门进入");
		menuHelp.add(menuItemAbout);
		menuHelp.add(menuItemHou);

		this.add(menuGame);
		this.add(menuHelp);

	}

}
