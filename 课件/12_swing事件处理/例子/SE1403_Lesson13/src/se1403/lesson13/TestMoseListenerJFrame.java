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

		this.setTitle("鼠标Mouse事件");
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

			// 定义双键按下的boolean的状态值:相互排斥效果
			boolean doublePress = false;
			boolean leftPress = false;
			boolean rightPress = false;

			@Override
			public void mouseReleased(MouseEvent e) {
				// 鼠标释放
				// System.out.println("mouseReleased释放");

				// 左右键判断
				// 双键释放 判断标志
				if (doublePress) {
					System.out.println("双键释放");
					doublePress = false;
				} else if (leftPress) {
					System.out.println("左键释放");
					leftPress = false;
				} else if (rightPress) {
					System.out.println("右键释放");
					rightPress = false;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 鼠标按下
				// System.out.print("mousePressed按下");

				// 获得事件触发的坐标，相对事件源[组件上]来讲
				// int x = e.getX();
				// int y = e.getY();
				//				
				// System.out.println(",坐标为:"+x+","+y);
				// Point point = e.getPoint();
				// System.out.println("point坐标为:"+point.x+","+point.y);

				// 左右键判断
				// 优先判断双键
				if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK
						+ InputEvent.BUTTON3_DOWN_MASK) {
					System.out.println("双键按下");
					doublePress = true;
					leftPress = false;
					rightPress = false;
				} else if (e.getModifiers() == InputEvent.BUTTON1_MASK) {
					System.out.println("左键按下");
					doublePress = false;
					leftPress = true;
					rightPress = false;
				} else if (e.getModifiers() == InputEvent.BUTTON3_MASK) {
					System.out.println("右键按下");
					doublePress = false;
					leftPress = false;
					rightPress = true;
				}

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// 鼠标离开
				// System.out.println("mouseExited离开");
				jLabel.setBorder(BorderFactory.createLineBorder(Color.blue));
				jLabel.setIcon(iconStart);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// 鼠标进入
				// System.out.println("mouseEntered进入");
				// 切换边框的颜色
				jLabel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				// 鼠标的样式换成手型
				jLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
				jLabel.setIcon(iconStop);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// 鼠标单击(按下后鼠标不能移动,按下并释放的整个过程)
				// System.out.println("mouseClicked点击");

			}
		});

		// 记录鼠标轨迹:一般实现画板时使用
		// jLabel.addMouseMotionListener(new MouseMotionListener() {
		//			
		// @Override
		// public void mouseMoved(MouseEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("鼠标在组件上移动");
		// }
		//			
		// @Override
		// public void mouseDragged(MouseEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("鼠标在组件上按下并移动mouseDragged");
		// }
		// });

	}

	public static void main(String[] args) {
		new TestMoseListenerJFrame();
	}

}
