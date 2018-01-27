package se1204.lesson17.demo;


import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestActionListener extends JFrame {
	public TestActionListener() {
		init();
		this.setTitle("ActionListener示例");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {
		JButton button = new JButton("按钮");
//		//文本框
		JTextField textField = new JTextField(8);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(textField);
		//实现监听的步骤
		//1、写具体事件的对应监听接口的实现类
		//2、为对应的组件注册监听  addXXXListener(XXXListener实例);
		//3、在接口实现类的回调方法中处理事件
		
		//实现监听处理类的三种方式:匿名内部类，内部类，外部类
		
		//注册监听器(处理具体的事件)
		button.addActionListener(new MyActionListener());
//		//匿名内部类实现监听器
//		button.addActionListener(new ActionListener(){
//
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("-------------------");
//				
//			}});
		
//		button.addActionListener(new ButtonActionListener());
		
		
		this.add(panel);
		
		
	}

	public static void main(String[] args) {
		new TestActionListener();
	}
	
	//写类实现具体事件类型的监听接口
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// 处理事件的回调方法
			System.out.println("action事件触发啦....");
			
			//通过事件获得事件源
			Object source = e.getSource();
			if(source instanceof JButton){
				JButton button = (JButton)source;
				String text = button.getText();
				System.out.println("text="+text);
				if("按钮".equals(text)){
					button.setText("哈哈");
					
				}else{
					button.setText("按钮");
					
				}
				
				
//				button.setText("哈哈");
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
