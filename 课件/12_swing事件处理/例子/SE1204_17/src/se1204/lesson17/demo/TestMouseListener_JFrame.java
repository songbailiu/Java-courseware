package se1204.lesson17.demo;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestMouseListener_JFrame extends JFrame {
	// ����¼���Ҫ��Ե����Ķ����������¼� ������Ҽ� ˫��������������
	Icon iconStart = new ImageIcon("image/serverstart.gif");

	Icon iconStop = new ImageIcon("image/serverstop.gif");

	public TestMouseListener_JFrame() {
		init();

		this.setTitle("MouseListenerʾ��");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setVisible(true);

	}

	private void init() {

		final JLabel label = new JLabel(iconStart);
		label.setBorder(BorderFactory.createLineBorder(Color.blue));
		JPanel panel = new JPanel();
		panel.add(label);
		this.add(panel);

		label.addMouseListener(new MouseListener() {
			boolean isDoublePress = false;

			boolean isLeftPress = false;

			public void mouseClicked(MouseEvent e) {
				// ���������� ���²����ͷ�ȫ���� �����ƿ�
				// System.out.println("���");

			}

			public void mouseEntered(MouseEvent e) {
				// ������
				// System.out.println("������");
				label.setIcon(iconStop);

			}

			public void mouseExited(MouseEvent e) {
				// ����뿪
				// System.out.println("����뿪");
				label.setIcon(iconStart);

			}

			public void mousePressed(MouseEvent e) {
				// ��갴��
				// System.out.println("��갴��");
				// �ж����Ҽ� ˫��
				// ���ж�˫�� ���жϵ���
				if (e.getModifiersEx() == (InputEvent.BUTTON1_DOWN_MASK + InputEvent.BUTTON3_DOWN_MASK)) {
					System.out.println("˫������...");
					isDoublePress = true;
					isLeftPress = false;

				} else if (e.getModifiers() == InputEvent.BUTTON1_MASK) {

					System.out.println("�������");
					isLeftPress = true;
					isDoublePress = false;

				} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
					System.out.println("�Ҽ�����");
				}

			}

			public void mouseReleased(MouseEvent e) {
				// ����ͷ�
				// System.out.println("����ͷ�");
				// �ж����Ҽ� ˫��
				if (isDoublePress) {
					System.out.println("˫���ͷ�...");
					isDoublePress = false;

				} else {
					if (isLeftPress) {
						isLeftPress = false;
						System.out.println("����ͷ�");
						
					} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
						System.out.println("�Ҽ��ͷ�");
					}
				}

			}
		});

	}

	public static void main(String[] args) {
		new TestMouseListener_JFrame();
	}

}
