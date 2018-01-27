package se1403.lesson12.layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * ���Ի�ͼ������
 * 
 * @author admin
 * 
 */
public class TestGraphics extends JFrame {

	static Image[] images = new Image[20];
	static {
		for (int i = 0; i < images.length; i++) {
			images[i] = new ImageIcon("image/build1/" + (i + 1) + ".png")
					.getImage();
		}

	}

	public TestGraphics() {
		init();
		this.setTitle("��ͼ");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {
		JPanel panel = new JPanel() {

			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				super.paint(g);

				// ʵ�ֻ���ͼ���ַ�����
				// �Ȼ��Ʊ���ͼƬ
				Image background = new ImageIcon("image/tt.jpg").getImage();
				g.drawImage(background, 0, 0, this);
				// ���ƾ���
				// g.drawRect(20, 40, 80, 40);
				// //�����ַ���
				// Font font = new Font("����", Font.BOLD, 36);
				// g.setFont(font);
				// g.setColor(Color.PINK);
				// g.drawString("Сǿ������", 100, 200);

				// ����Сͼ��
				// Image imageChess = new
				// ImageIcon("image/build1/1.png").getImage();
				// g.drawImage(imageChess, 0, 0, this);
				// Image imageChess2= new
				// ImageIcon("image/build1/2.png").getImage();
				// g.drawImage(imageChess2, 48, 0, this);
				// ˼��:��������Ϸ�� �ֲ����̵��㷨8*10 ����
				// 20��ͼƬ ÿһ��ͼƬ��Ӧ�����е�4λ��(���ظ�)
				// int[][] arr = new int[8][10];
				// �ж��ظ����� arr[i][j] == 0
				
				
				//��ʵ�������е�20��ͼƬ���Ƶ�������
				for (int i = 0; i < images.length; i++) {
					if (i < 8) {
						g.drawImage(images[i], 48 * i, 0, this);
					} else if (i < 16) {
						g.drawImage(images[i], 48 * (i - 8), 48, this);

					} else {
						g.drawImage(images[i], 48 * (i - 16), 48*2, this);
					}
				}
			}
		};

		this.add(panel);

	}

	public static void main(String[] args) {
		new TestGraphics();
	}

}
