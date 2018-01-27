package se1403.lesson12.layout;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestNullLayout extends JFrame {
	
	public TestNullLayout() {
		init();
		this.setTitle("我的窗体");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void init(){
		//设置当前窗体 布局为null
		//被添加的组件必须设置setBounds(x,y,w,h)
		this.setLayout(null);
		
		JButton jButton = new JButton("按钮");
		jButton.setBounds(10, 20, 100, 22);
		
		JButton jButton2 = new JButton("设置");
		jButton2.setBounds(120, 20, 100, 22);
		this.add(jButton);
		this.add(jButton2);
		
		JLabel jLabel = new JLabel("用户名:");
		jLabel.setBounds(10, 50, 60, 22);
		this.add(jLabel);
		
		JTextField textField = new JTextField("admin");
		textField.setBounds(70, 50, 100, 22);
		this.add(textField);
		
	}
	
	public static void main(String[] args) {
		new TestNullLayout();
	}

}
