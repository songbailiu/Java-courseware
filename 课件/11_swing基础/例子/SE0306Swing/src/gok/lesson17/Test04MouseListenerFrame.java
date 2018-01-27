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
	// MouseListener 鼠标事件：进入，移出，按下，释放，点击
	// 适配器MouseAdapter

	Icon iconStart = new ImageIcon("image/serverstart.gif");
	Icon iconStop = new ImageIcon("image/serverstop.gif");

	// 更好处理双键释放 动作 互斥的设计
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

		// 添加鼠标事件
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// 释放
				// System.out.println("鼠标释放mouseReleased");
				// 判断鼠标 左右键 [按下的时候记录状态，释放直接根据状态值判断]

				if (doublePress) {
					// 双键按下
					System.out.println("双键 释放");
					doublePress = false;
				} else if (leftPress) {
					// 左键 按下
					System.out.println("左键  释放");
					leftPress = false;

				} else if (rightPress) {
					// 右键 按下
					System.out.println("右键 释放");
					rightPress = false;
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 按下
				// System.out.println("鼠标按下mousePressed");
				// 获得 鼠标点击组件的 x与y坐标
				// Point point = e.getPoint();
				// System.out.println("point="+point);
				// int x = e.getX();
				// int y = e.getY();
				// System.out.println("坐标为:"+x+","+y);

				// 判断鼠标按下 优先判断 左右键
				if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK
						+ InputEvent.BUTTON3_DOWN_MASK) {
					// 双键按下
					System.out.println("双键按下");
					doublePress = true;
					leftPress = false;
					rightPress = false;
				} else if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
					// 左键 按下
					System.out.println("左键  按下");
					doublePress = false;
					leftPress = true;
					rightPress = false;

				} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
					// 右键 按下
					System.out.println("右键 按下");
					doublePress = false;
					leftPress = false;
					rightPress = true;
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// 鼠标移出
				System.out.println("鼠标移出mouseExited");
				label.setIcon(iconStart);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// 进入
				System.out.println("鼠标进入mouseEntered");

				// 切换图片变成停止图片
				label.setIcon(iconStop);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// 点击：按下并释放 鼠标不能移动
				System.out.println("鼠标点击mouseClicked");
			}
		});

		// 监听鼠标的运动轨迹 MouseMotionListener
		label.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				//
				int x = e.getX();
				int y = e.getY();
				System.out.println("鼠标移动mouseMoved..." + x + "," + y);

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("鼠标按下并拖动  mouseDragged...");
			}
		});

	}

	public static void main(String[] args) {
		new Test04MouseListenerFrame();
	}

}
