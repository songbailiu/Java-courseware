package gok.lesson17;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test04MouseListenerFrame extends JFrame {
	// MouseListener ����¼������룬�Ƴ������£��ͷţ����
	// ������MouseAdapter

	Icon iconStart = new ImageIcon("image/serverstart.gif");
	Icon iconStop = new ImageIcon("image/serverstop.gif");

	// ���ô���˫���ͷ� ���� ��������
	boolean doublePress = false;
	boolean leftPress = false;
	boolean rightPress = false;

	public Test04MouseListenerFrame() {
		init();
		this.setTitle("MouseListener");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		final JLabel label = new JLabel(iconStart);

		label.setPreferredSize(new Dimension(100, 100));
		label.setBorder(BorderFactory.createLineBorder(Color.blue));

		panel.add(label);

		this.add(panel);

		// �������¼�
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// �ͷ�
				// System.out.println("����ͷ�mouseReleased");
				// �ж���� ���Ҽ� [���µ�ʱ���¼״̬���ͷ�ֱ�Ӹ���״ֵ̬�ж�]

				if (doublePress) {
					// ˫������
					System.out.println("˫�� �ͷ�");
					doublePress = false;
				} else if (leftPress) {
					// ��� ����
					System.out.println("���  �ͷ�");
					leftPress = false;

				} else if (rightPress) {
					// �Ҽ� ����
					System.out.println("�Ҽ� �ͷ�");
					rightPress = false;
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// ����
				// System.out.println("��갴��mousePressed");
				// ��� ���������� x��y����
				// Point point = e.getPoint();
				// System.out.println("point="+point);
				// int x = e.getX();
				// int y = e.getY();
				// System.out.println("����Ϊ:"+x+","+y);

				// �ж���갴�� �����ж� ���Ҽ�
				if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK
						+ InputEvent.BUTTON3_DOWN_MASK) {
					// ˫������
					System.out.println("˫������");
					doublePress = true;
					leftPress = false;
					rightPress = false;
				} else if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
					// ��� ����
					System.out.println("���  ����");
					doublePress = false;
					leftPress = true;
					rightPress = false;

				} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
					// �Ҽ� ����
					System.out.println("�Ҽ� ����");
					doublePress = false;
					leftPress = false;
					rightPress = true;
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// ����Ƴ�
				System.out.println("����Ƴ�mouseExited");
				label.setIcon(iconStart);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// ����
				System.out.println("������mouseEntered");

				// �л�ͼƬ���ֹͣͼƬ
				label.setIcon(iconStop);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// ��������²��ͷ� ��겻���ƶ�
				System.out.println("�����mouseClicked");
			}
		});

		// ���������˶��켣 MouseMotionListener
		label.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				//
				int x = e.getX();
				int y = e.getY();
				System.out.println("����ƶ�mouseMoved..." + x + "," + y);

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��갴�²��϶�  mouseDragged...");
			}
		});

	}

	public static void main(String[] args) {
		new Test04MouseListenerFrame();
	}

}
