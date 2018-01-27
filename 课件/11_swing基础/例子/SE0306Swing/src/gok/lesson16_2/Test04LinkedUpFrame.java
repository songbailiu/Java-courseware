package gok.lesson16_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

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

public class Test04LinkedUpFrame extends JFrame {
	Image imageBackground = new ImageIcon("image/bg/bg1.jpg").getImage();
	// 20 种图片
	Image[] images = new Image[20];
	int[][] map = new int[8][10];
	// 边界宽度 与高度
	int marginWidth = 110;
	int marginHeight = 100;

	public Test04LinkedUpFrame() {
		initMap();
		init();
		this.setTitle("连连看棋盘");
		this.setSize(new Dimension(700, 600));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {

		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				System.out.println("paint.....");
				super.paint(g);
				g.drawImage(imageBackground, 0, 0, this);
				g.setColor(Color.green);

				// 绘制棋盘
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map[i].length; j++) {
						// 下标与坐标对应关系
						// x = j*48;y = i*48;
						g.drawImage(images[map[i][j] - 1],
								j * 48 + marginWidth, i * 48 + marginHeight,
								null);
						g.drawRect(j * 48 + marginWidth, i * 48 + marginHeight,
								48, 48);
					}
				}

			}

		};

		this.add(panel);

	}

	/**
	 * 初始化棋盘方法
	 */
	public void initMap() {
		for (int i = 0; i < images.length; i++) {
			ImageIcon imageIcon = new ImageIcon("image/build1/" + (i + 1)
					+ ".png");
			images[i] = imageIcon.getImage();
		}

		Random random = new Random();
		for (int i = 1; i <= 20; i++) {
			int count = 0;
			while (count < 4) {
				int x = random.nextInt(8);
				int y = random.nextInt(10);
				if (map[x][y] == 0) {// 判断重复 x,y第一次生成 对应元素0
					map[x][y] = i;
					count++;
				}
			}
		}

		System.out.println("随机分布棋盘后......");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test04LinkedUpFrame();
	}

}
