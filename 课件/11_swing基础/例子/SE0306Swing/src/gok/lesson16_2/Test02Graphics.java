package gok.lesson16_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test02Graphics extends JFrame {

	public Test02Graphics() {
		init();
		this.setTitle("����ͼ��");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		final ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		final ImageIcon imageIconBackground = new ImageIcon("image/tt.jpg");

		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				System.out.println("paint.....");
				super.paint(g);
				//���Ʊ���ͼ  ��ǰ����ƣ���Ȼ��ǵ�������Сͼ��
				g.drawImage(imageIconBackground.getImage(), 0, 0, null);

				
				
				g.setColor(new Color(200, 100, 150));
				// Graphics ��������ͼ�������ĵĳ�����࣬����Ӧ�ó�����������Ѿ��ڸ����豸��ʵ�֣��Լ�����ͼ���Ͻ��л��ơ�
				// ����ֱ��
				g.drawLine(20, 20, 80, 80);
				// ���ƾ���
				g.drawRect(80, 80, 40, 50);
				g.setColor(new Color(20, 100, 150));
				g.fillRect(80, 80, 40, 50);
				// ����Բ��[���ݲ�ͬ�ľ��� ����Բ�εĻ���]
				g.drawOval(50, 130, 50, 50);
				// �����ַ���
				g.drawString("Сǿ", 65, 155);

				// ����ͼ��
				g.drawImage(imageIcon.getImage(), 180, 30, null);
				
			}

		};

		this.add(panel);

	}

	public static void main(String[] args) {
		new Test02Graphics();
	}

}
