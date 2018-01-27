package gok.lesson17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/*
 * 外部类方式 实现接口
 */
public class Test01_3ActionListener implements ActionListener {
	Test01ActionListenerFrame frame;

	public Test01_3ActionListener(Test01ActionListenerFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("3---外部监听类.....");
		Object source = e.getSource();

		// 当前监听器监听了多个组件时 ，如何判断 到底是哪个组件触发了事件
		// 方式一：根据组件的文本值 判断 [组件上的文本值 不能随意改变]
		// if(source instanceof JButton){
		// JButton button = (JButton) source;
		// String text = button.getText();
		// if("设置".equals(text)){
		// System.out.println("您 点击了 设置按钮");
		// }else{
		// System.out.println("您 点击了 不是  设置按钮");
		// }
		// }

		// 方式二： 根据窗体对象中的成员 判断对象是否一致
		if (source == frame.button) {
			System.out.println("您点击了是  按钮");
			frame.textField.setText(frame.button.getText());
			
		} else if (source == frame.buttonSet) {
			System.out.println("您点击了是  设置");
			//赋值给文本框
			frame.textField.setText(frame.buttonSet.getText());
		}

	}

}
