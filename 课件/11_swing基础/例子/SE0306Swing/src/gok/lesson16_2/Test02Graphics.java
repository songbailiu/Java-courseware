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
		this.setTitle("绘制图像");
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
				//绘制背景图  最前面绘制，不然会盖掉其他的小图标
				g.drawImage(imageIconBackground.getImage(), 0, 0, null);

				
				
				g.setColor(new Color(200, 100, 150));
				// Graphics 类是所有图形上下文的抽象基类，允许应用程序在组件（已经在各种设备上实现）以及闭屏图像上进行绘制。
				// 绘制直线
				g.drawLine(20, 20, 80, 80);
				// 绘制矩形
				g.drawRect(80, 80, 40, 50);
				g.setColor(new Color(20, 100, 150));
				g.fillRect(80, 80, 40, 50);
				// 绘制圆形[根据不同的距离 绘制圆形的弧度]
				g.drawOval(50, 130, 50, 50);
				// 绘制字符串
				g.drawString("小强", 65, 155);

				// 绘制图标
				g.drawImage(imageIcon.getImage(), 180, 30, null);
				
			}

		};

		this.add(panel);

	}

	public static void main(String[] args) {
		new Test02Graphics();
	}

}
