package se1204.lesson17.zuoye.sweep;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * �˵�����װ��
 * @author Administrator
 *
 */
public class MyJMenuBar extends JMenuBar {
	public MyJMenuBar() {
		init();
	}

	private void init() {
		JMenu menuGame = new JMenu("��Ϸ");
		JMenu menuHelp = new JMenu("����");

		JMenuItem menuItemStart = new JMenuItem("����");
		JMenuItem menuItemC = new JMenuItem("����");
		JMenuItem menuItemZ = new JMenuItem("�м�");
		JMenuItem menuItemG = new JMenuItem("�߼�");
		JMenuItem menuItemSelf = new JMenuItem("�Զ���");
		//ʹ�ö����˵�
		JMenu menuHero = new JMenu("Ӣ�۰�");
		JMenuItem menuItemHeroC = new JMenuItem("����Ӣ�۰�");
		JMenuItem menuItemHeroZ = new JMenuItem("�м�Ӣ�۰�");
		JMenuItem menuItemHeroG = new JMenuItem("�߼�Ӣ�۰�");
		menuHero.add(menuItemHeroC);
		menuHero.add(menuItemHeroZ);
		menuHero.add(menuItemHeroG);
		
		
		JMenuItem menuItemExit = new JMenuItem("�˳�");
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

		JMenuItem menuItemAbout = new JMenuItem("����ɨ��");
		JMenuItem menuItemHou = new JMenuItem("���Ž���");
		menuHelp.add(menuItemAbout);
		menuHelp.add(menuItemHou);

		this.add(menuGame);
		this.add(menuHelp);

	}

}
