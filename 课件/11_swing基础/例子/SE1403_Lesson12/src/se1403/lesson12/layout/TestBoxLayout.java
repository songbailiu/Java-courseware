package se1403.lesson12.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestBoxLayout extends JFrame {
	// ��ʽ����BoxLayout��һ�л���һ��չʾ���
	// BoxĬ�Ͼ��Ǻ�ʽ����

	public TestBoxLayout() {
		init();
		testBox();
		this.setTitle("��ʽ����");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		// BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.LINE_AXIS);
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxLayout);
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				JButton button = new JButton("��ť" + i + "," + j);
				panel.add(button);
			}
		}
		this.add(panel);
	}

	private void testBox() {
		// Box��̬��������������������Box
		Box box = Box.createHorizontalBox();
		ImageIcon icon = new ImageIcon("image/d0.gif");
		ImageIcon iconFace = new ImageIcon("image/face0.gif");
		JLabel label = new JLabel(icon);
		JLabel buttonFace = new JLabel(iconFace);
		JLabel label2 = new JLabel(icon);

		// ��߼�� ռλ�ռ����
		box.add(Box.createHorizontalStrut(10));
		box.add(label);
		// ����
		box.add(Box.createHorizontalGlue());
		box.add(buttonFace);
		// ����
		box.add(Box.createHorizontalGlue());
		box.add(label2);

		this.add(box, BorderLayout.NORTH);

	}

	public static void main(String[] args) {
		new TestBoxLayout();
	}

}
