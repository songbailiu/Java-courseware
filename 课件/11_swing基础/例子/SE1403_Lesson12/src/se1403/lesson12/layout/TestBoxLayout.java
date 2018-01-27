package se1403.lesson12.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestBoxLayout extends JFrame {
	// 盒式布局BoxLayout：一行或者一列展示组件
	// Box默认就是盒式布局

	public TestBoxLayout() {
		init();
		testBox();
		this.setTitle("盒式布局");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		// BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.LINE_AXIS);
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxLayout);
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				JButton button = new JButton("按钮" + i + "," + j);
				panel.add(button);
			}
		}
		this.add(panel);
	}

	private void testBox() {
		// Box静态方法创建横向或者纵向的Box
		Box box = Box.createHorizontalBox();
		ImageIcon icon = new ImageIcon("image/d0.gif");
		ImageIcon iconFace = new ImageIcon("image/face0.gif");
		JLabel label = new JLabel(icon);
		JLabel buttonFace = new JLabel(iconFace);
		JLabel label2 = new JLabel(icon);

		// 左边间距 占位空间距离
		box.add(Box.createHorizontalStrut(10));
		box.add(label);
		// 弹簧
		box.add(Box.createHorizontalGlue());
		box.add(buttonFace);
		// 弹簧
		box.add(Box.createHorizontalGlue());
		box.add(label2);

		this.add(box, BorderLayout.NORTH);

	}

	public static void main(String[] args) {
		new TestBoxLayout();
	}

}
