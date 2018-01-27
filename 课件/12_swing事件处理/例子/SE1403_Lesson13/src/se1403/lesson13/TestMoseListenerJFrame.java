package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestMoseListenerJFrame extends JFrame {

	ImageIcon iconStart = new ImageIcon("image/serverstart.gif");
	ImageIcon iconStop = new ImageIcon("image/serverstop.gif");
	JLabel jLabel = new JLabel(iconStart);

	public TestMoseListenerJFrame() {
		init();

		this.setTitle("���Mouse�¼�");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {

		jLabel.setPreferredSize(new Dimension(100, 100));

		JPanel panel = new JPanel();
		panel.add(jLabel);
		jLabel.setBorder(BorderFactory.createLineBorder(Color.blue));

		this.add(panel);

		jLabel.addMouseListener(new MouseListener() {

			// ����˫�����µ�boolean��״ֵ̬:�໥�ų�Ч��
			boolean doublePress = false;
			boolean leftPress = false;
			boolean rightPress = false;

			@Override
			public void mouseReleased(MouseEvent e) {
				// ����ͷ�
				// System.out.println("mouseReleased�ͷ�");

				// ���Ҽ��ж�
				// ˫���ͷ� �жϱ�־
				if (doublePress) {
					System.out.println("˫���ͷ�");
					doublePress = false;
				} else if (leftPress) {
					System.out.println("����ͷ�");
					leftPress = false;
				} else if (rightPress) {
					System.out.println("�Ҽ��ͷ�");
					rightPress = false;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// ��갴��
				// System.out.print("mousePressed����");

				// ����¼����������꣬����¼�Դ[�����]����
				// int x = e.getX();
				// int y = e.getY();
				//				
				// System.out.println(",����Ϊ:"+x+","+y);
				// Point point = e.getPoint();
				// System.out.println("point����Ϊ:"+point.x+","+point.y);

				// ���Ҽ��ж�
				// �����ж�˫��
				if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK
						+ InputEvent.BUTTON3_DOWN_MASK) {
					System.out.println("˫������");
					doublePress = true;
					leftPress = false;
					rightPress = false;
				} else if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
					System.out.println("�������");
					doublePress = false;
					leftPress = true;
					rightPress = false;
				} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
					System.out.println("�Ҽ�����");
					doublePress = false;
					leftPress = false;
					rightPress = true;
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// ����뿪
				// System.out.println("mouseExited�뿪");
				jLabel.setBorder(BorderFactory.createLineBorder(Color.blue));
				jLabel.setIcon(iconStart);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// ������
				// System.out.println("mouseEntered����");
				// �л��߿����ɫ
				jLabel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				// ������ʽ��������
				jLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
				jLabel.setIcon(iconStop);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// ��굥��(���º���겻���ƶ�,���²��ͷŵ���������)
				// System.out.println("mouseClicked���");

			}
		});

		// ��¼���켣:һ��ʵ�ֻ���ʱʹ��
		// jLabel.addMouseMotionListener(new MouseMotionListener() {
		//			
		// @Override
		// public void mouseMoved(MouseEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("�����������ƶ�");
		// }
		//			
		// @Override
		// public void mouseDragged(MouseEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("���������ϰ��²��ƶ�mouseDragged");
		// }
		// });

	}

	public static void main(String[] args) {
		new TestMoseListenerJFrame();
	}

}
