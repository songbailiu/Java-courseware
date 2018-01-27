package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestActionListenerJFrame extends JFrame {
	JButton button = new JButton("按钮");
	JButton buttonSet = new JButton("设置");
	
	JPanel panelSourth = new JPanel();

	public TestActionListenerJFrame() {
		init();
		
		this.add(panelSourth,BorderLayout.SOUTH);
		panelSourth.setBackground(Color.GREEN);
		panelSourth.setPreferredSize(new Dimension(400, 80));
		this.setTitle("actionEVENT按钮点击事件");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {
		JPanel panel = new JPanel();

		panel.add(button);

		panel.add(buttonSet);
		this.add(panel);

		// 事件处理
		// 1、写一个事件监听器 实现类(内部类、匿名内部类、外部类)
		// 2、给组件注册监听器
		// 一个组件注册了多个监听器:触发时间：与添加顺序相反[栈的特点：先进后出]
		// button.addActionListener(new MyActionListener());
		// button.addActionListener(new ActionListener() {
		//			
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.out.println("2-ActionEvent  匿名内部类----");
		//				
		// }
		// });
		// button.addActionListener(new MyButtonListener());

		// 一个监听器可以监听多个组件
		// MyActionListener actionListener = new MyActionListener();
		// button.addActionListener(actionListener);
		// buttonSet.addActionListener(actionListener);

		// 测试创建监听器时候传递参数(窗体对象)
		MyButtonListener buttonListener = new MyButtonListener(this);
		button.addActionListener(buttonListener);
		buttonSet.addActionListener(buttonListener);
	}

	public static void main(String[] args) {
		new TestActionListenerJFrame();
	}

	// 内部类 实现监听器
	class MyActionListener implements ActionListener {

		// 回调的方式调用该方法处理事件ActionEvent
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("1-ActionEvent触发了----");
			// 根据事件获得事件源 为组件注册监听的组件源
			Object source = e.getSource();
			// System.out.println("source="+source);
			JButton button = (JButton) source;
			String text = button.getText();
			System.out.println("text=" + text);

			// // 设置按钮的文本值
			// // button.setText("开始");
			// if ("开始".equals(text)) {
			// button.setText("停止");
			// } else {
			// button.setText("开始");
			// }

			// 问题判断到底是哪一个组件触发事件
			// 方式一:根据组件上面的文本值判断触发事件的事件源到底是谁?
			// if("按钮".equals(text)){
			// System.out.println("您点击了按钮");
			// }else{
			// System.out.println("您点击了设置");
			// }

			// 方式二:按钮定义成全局变量[定义成窗体的成员]
			if (source == TestActionListenerJFrame.this.button) {
				System.out.println("您点击了按钮");

			} else if (source == buttonSet) {
				System.out.println("您点击了设置");
			}

		}

	}

}
