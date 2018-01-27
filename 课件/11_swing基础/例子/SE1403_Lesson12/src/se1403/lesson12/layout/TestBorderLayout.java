package se1403.lesson12.layout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestBorderLayout extends JFrame {
	//边界布局：东南西北中五个方位显示组件，中间是默认
	//添加组件时必须指定方位,每一个组件会充满该方位
	//顶层容器默认布局就是边界布局,JFrame,JDialog,JWindow
	
	public TestBorderLayout() {
		init();
		this.setTitle("边界布局BorderLayout");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void init(){
		JButton jButtonEast = new JButton("按钮东边");		
		JButton jButtonWest = new JButton("按钮西边");		
		JLabel jLabel = new JLabel("南边标签");
		JTextField textField = new JTextField("北边文本框");
		JButton jButtonCenter = new JButton("按钮中间");
		
		//add(方位,组件);  首字母大写
		this.add("East", jButtonEast);
		//add(组件，方位)
		this.add(jButtonWest, BorderLayout.WEST);
		this.add(jLabel, BorderLayout.SOUTH);
		this.add(textField, BorderLayout.NORTH);
		this.add(jButtonCenter);
		
	}
	
	public static void main(String[] args) {
		new TestBorderLayout();
	}

}
