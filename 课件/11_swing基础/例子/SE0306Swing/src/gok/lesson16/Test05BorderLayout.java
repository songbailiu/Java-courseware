package gok.lesson16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test05BorderLayout extends JFrame {
	//边界布局 BorderLayout  顶层容器的默认布局
	//东南西北中 组件会充满每一个方位
	//中间获得额外的空间

	public Test05BorderLayout() {
		init();

		this.setTitle("边界布局");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		JButton buttonWest = new JButton("西边");
		JButton buttonEast = new JButton("东边");
		JButton buttonSouth = new JButton("南边");
		JButton buttonNorth = new JButton("北边");
		//设置组件的首选大小 来改变方位的宽与高
		//buttonNorth.setPreferredSize(new Dimension(150, 100));
		JButton buttonCenter = new JButton("中间按钮");
		
		//添加组件的时候必须指定方位
		this.add("West",buttonWest);
		this.add(buttonEast,BorderLayout.EAST);
		this.add(buttonSouth,BorderLayout.SOUTH);
		this.add(buttonNorth,BorderLayout.NORTH);
		this.add(buttonCenter);//默认 在中间

	}

	public static void main(String[] args) {
		new Test05BorderLayout();
	}

}
