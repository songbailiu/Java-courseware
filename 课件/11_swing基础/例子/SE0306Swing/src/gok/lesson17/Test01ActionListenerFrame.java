package gok.lesson17;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test01ActionListenerFrame extends JFrame {
	// ActionListener 监听 按钮 按下并释放，菜单 点击事件等等
	
	
	//组件定义成 成员变量  看着是当前窗体实例的属性
	JButton button = new JButton("按钮");
	JButton buttonSet = new JButton("设置");
	JTextField textField = new JTextField(8);
	
	
	public Test01ActionListenerFrame() {
		init();
		this.setTitle("ActionListener");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		
		panel.add(button);
		
		panel.add(buttonSet);
		panel.add(textField);
		this.add(panel);

		// 按钮指定Action监听
		// 实现实件处理步骤为:
		// 找到事件源; (如按钮等组件)
		// 创建监视器对象;(需实现相应接口的类)
		// 为事件源注册监视器对象;
		
		//写类实现监听器接口方式：内部类、匿名内部类、外部类都可以实现
		//一个组件可以注册多个监听器，一个监听器也可以监听多个组件
		button.addActionListener(new MyButtonListener());
		// 匿名内部类实现监听器接口
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("2 --- 匿名内部类实现监听");
			}
		});
		
		
		//传递参数：把当前的窗体对象this作为参数传递到监听器中
		Test01_3ActionListener listener = new Test01_3ActionListener(this);
		button.addActionListener(listener);
		
		//总结:当一个组件同时注册了多个监听器后，监听器执行顺序  与 注册的顺序相反[栈的规律 先进后出]
		//listener监听器对象监听了2个按钮
		buttonSet.addActionListener(listener);
	
	}

	public static void main(String[] args) {
		new Test01ActionListenerFrame();
	}

	// 内部类 实现监听器接口
	class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 按钮产生事件后 执行的方法
			System.out.println("1 -- 内部类 实现  按钮被点击了 产生了Action事件....");
			// 根据事件对象获得事件源对象[组件]
			Object source = e.getSource();
			// System.out.println("source="+source);
			// 下溯 成JButton
			JButton button = (JButton) source;
			String text = button.getText();
			if ("开始".equals(text)) {
				button.setText("停止");
			} else {
				button.setText("开始");
			}

			// Test01ActionListenerFrame.this.setTitle("哈哈,好痛");
		}

	}

}
