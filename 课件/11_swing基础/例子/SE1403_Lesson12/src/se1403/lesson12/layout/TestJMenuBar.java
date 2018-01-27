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
 * �˵���Ƥ����,������
 * 
 * @author admin
 * 
 */
public class TestJMenuBar extends JFrame {
	// �˵������˵����˵���
	// �˵��� �ӵ��˵� �˵�����˵������������ò˵���

	public TestJMenuBar() {
		init();
		testJProgressBar();

		this.setTitle("�˵�");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		// �˵���
		JMenuBar jMenuBar = new JMenuBar();
		// �˵�
		JMenu jMenuGame = new JMenu("��Ϸ(G)");
		JMenu jMenuHelp = new JMenu("����(H)");
		// ���ÿ�ݼ�
		jMenuGame.setMnemonic('G');
		jMenuHelp.setMnemonic('H');
		// �˵���
		Icon icon = new ImageIcon("image/icon.gif");
		JMenuItem jMenuItemOpen = new JMenuItem("��", icon);
		JMenuItem jMenuItemSave = new JMenuItem("����");
		JMenuItem jMenuItemC = new JRadioButtonMenuItem("����");
		JMenuItem jMenuItemZ = new JRadioButtonMenuItem("�м�");
		// �˵����л���Ч��
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jMenuItemC);

		buttonGroup.add(jMenuItemZ);

		JMenuItem jMenuItemG = new JCheckBoxMenuItem("�߼�");
		buttonGroup.add(jMenuItemG);
		JMenuItem jMenuItemExit = new JMenuItem("�˳���Ϸ");
		jMenuGame.add(jMenuItemOpen);
		jMenuGame.add(jMenuItemSave);
		// �˵��ָ���
		jMenuGame.addSeparator();
		jMenuGame.add(jMenuItemC);
		jMenuGame.add(jMenuItemZ);
		jMenuGame.add(jMenuItemG);
		// �˵��ָ���
		jMenuGame.addSeparator();
		jMenuGame.add(jMenuItemExit);
		JMenuItem jMenuItemAbout = new JMenuItem("������Ϸ");
		JMenuItem jMenuItemCopy = new JMenuItem("��Ȩ����");
		jMenuHelp.add(jMenuItemAbout);
		jMenuHelp.add(jMenuItemCopy);

		jMenuBar.add(jMenuGame);
		jMenuBar.add(jMenuHelp);

		// �������ò˵���
		this.setJMenuBar(jMenuBar);

		// �Ҽ�PopupMenu

	}

	private void testJProgressBar() {
		JPanel jPanel = new JPanel();
		jPanel.add(new JButton("��ť"));
		this.add(jPanel);

		// ������
		final JProgressBar jProgressBar = new JProgressBar(0, 100);
		// ���õ�ǰ����
		jProgressBar.setValue(50);
		// �Ƿ���ʾ�����ַ��� �ٷֱ�
		jProgressBar.setStringPainted(true);
		jProgressBar.setPreferredSize(new Dimension(200, 20));
		jPanel.add(jProgressBar);

		// �ı����ֵ ���ַ�ʽ����̨�̻߳��߼�ʱ��
		// ʹ���߳�
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					int value = jProgressBar.getValue();
					value += 10;
					jProgressBar.setValue(value);
					//ֹͣѭ��,�����߳�
					if (value >= jProgressBar.getMaximum()) {
						break;
					}

					// �ؼ�ִ���ٶ�
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		// �����߳�
		thread.start();

	}

	public static void main(String[] args) {
		// Ƥ����:�����ڽ��洴��֮ǰ����
		try {
			// UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			// // com.sun.java.swing.plaf.motif.MotifLookAndFeel//java������
			// com.sun.java.swing.plaf.windows.WindowsLookAndFeel//windows ���
			// javax.swing.plaf.metal.MetalLookAndFeel//swingĬ�Ϸ��
			// ��ò���ϵͳ��Ĭ�Ϸ��
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new TestJMenuBar();
	}

}
