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
 * 测试绘图工具类
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
		this.setTitle("绘图");
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

				// 实现绘制图像，字符串，
				// 先绘制背景图片
				Image background = new ImageIcon("image/tt.jpg").getImage();
				g.drawImage(background, 0, 0, this);
				// 绘制矩形
				// g.drawRect(20, 40, 80, 40);
				// //绘制字符串
				// Font font = new Font("宋体", Font.BOLD, 36);
				// g.setFont(font);
				// g.setColor(Color.PINK);
				// g.drawString("小强，哈哈", 100, 200);

				// 绘制小图标
				// Image imageChess = new
				// ImageIcon("image/build1/1.png").getImage();
				// g.drawImage(imageChess, 0, 0, this);
				// Image imageChess2= new
				// ImageIcon("image/build1/2.png").getImage();
				// g.drawImage(imageChess2, 48, 0, this);
				// 思考:连连看游戏的 分布棋盘的算法8*10 数组
				// 20种图片 每一种图片对应数组中的4位置(不重复)
				// int[][] arr = new int[8][10];
				// 判断重复条件 arr[i][j] == 0
				
				
				//简单实现数组中的20种图片绘制到界面上
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
