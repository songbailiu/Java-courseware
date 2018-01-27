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
	// 鼠标事件主要针对的鼠标的动作触发的事件 左键，右键 双击、单击、滚轮
	Icon iconStart = new ImageIcon("image/serverstart.gif");

	Icon iconStop = new ImageIcon("image/serverstop.gif");

	public TestMouseListener_JFrame() {
		init();

		this.setTitle("MouseListener示例");
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
				// 鼠标在组件上 按下并且释放全过程 不能移开
				// System.out.println("点击");

			}

			public void mouseEntered(MouseEvent e) {
				// 鼠标进入
				// System.out.println("鼠标进入");
				label.setIcon(iconStop);

			}

			public void mouseExited(MouseEvent e) {
				// 鼠标离开
				// System.out.println("鼠标离开");
				label.setIcon(iconStart);

			}

			public void mousePressed(MouseEvent e) {
				// 鼠标按下
				// System.out.println("鼠标按下");
				// 判断左右键 双键
				// 先判断双键 再判断单键
				if (e.getModifiersEx() == (InputEvent.BUTTON1_DOWN_MASK + InputEvent.BUTTON3_DOWN_MASK)) {
					System.out.println("双键按下...");
					isDoublePress = true;
					isLeftPress = false;

				} else if (e.getModifiers() == InputEvent.BUTTON1_MASK) {

					System.out.println("左键按下");
					isLeftPress = true;
					isDoublePress = false;

				} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
					System.out.println("右键按下");
				}

			}

			public void mouseReleased(MouseEvent e) {
				// 鼠标释放
				// System.out.println("鼠标释放");
				// 判断左右键 双键
				if (isDoublePress) {
					System.out.println("双键释放...");
					isDoublePress = false;

				} else {
					if (isLeftPress) {
						isLeftPress = false;
						System.out.println("左键释放");
						
					} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
						System.out.println("右键释放");
					}
				}

			}
		});

	}

	public static void main(String[] args) {
		new TestMouseListener_JFrame();
	}

}
