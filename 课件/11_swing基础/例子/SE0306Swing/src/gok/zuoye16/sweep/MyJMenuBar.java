package gok.zuoye16.sweep;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * �˵���
 * 
 * @author admin
 * 
 */
public class MyJMenuBar extends JMenuBar {
	public MyJMenuBar() {
		init();
	}

	private void init() {

		JMenu menuGame = new JMenu("��Ϸ(G)");
		JMenu menuHelp = new JMenu("����(H)");

		JMenuItem menuItem = new JMenuItem("��ʼ");

		JMenuItem menuItemC = new JMenuItem("����");
		JMenuItem menuItemZ = new JMenuItem("�м�");
		JMenuItem menuItemG = new JMenuItem("�߼�");

		JMenu menuScore = new JMenu("��Ϸ�ɼ�(�����˵�)");
		JMenuItem menuItemScoreC = new JMenuItem("����");
		JMenuItem menuItemScoreZ = new JMenuItem("�м�");
		JMenuItem menuItemScoreG = new JMenuItem("�߼�");
		menuScore.add(menuItemScoreC);
		menuScore.add(menuItemScoreZ);
		menuScore.add(menuItemScoreG);
		JMenuItem menuItemExit = new JMenuItem("�˳�");

		menuGame.add(menuItem);
		menuGame.addSeparator();
		menuGame.add(menuItemC);
		menuGame.add(menuItemZ);
		menuGame.add(menuItemG);
		menuGame.addSeparator();
		// �˵�����Ӳ˵�
		menuGame.add(menuScore);
		menuGame.addSeparator();
		menuGame.add(menuItemExit);

		JMenuItem menuItemCopy = new JMenuItem("��Ȩ");
		JMenuItem menuItemAbout = new JMenuItem("����");

		menuHelp.add(menuItemCopy);
		menuHelp.add(menuItemAbout);

		this.add(menuGame);
		this.add(menuHelp);

	}

}
