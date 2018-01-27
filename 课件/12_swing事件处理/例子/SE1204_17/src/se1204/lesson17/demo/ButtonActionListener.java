package se1204.lesson17.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonActionListener implements ActionListener {
	//获得窗体对象
	//主窗体通过构造函数传递到监听器的中
	TestActionListener2_JFrame frame;
	public ButtonActionListener(TestActionListener2_JFrame frame) {
		this.frame = frame;
//		frame = new TestActionListener2_JFrame();
	}

	public void actionPerformed(ActionEvent e) {
		//创建一个窗体
		//frame = new TestActionListener2_JFrame();//error
		
		Object source = e.getSource();
		JButton button = (JButton)source;
		System.out.println("您点击了"+button.getText());
		//通过窗体来获得具体控件
		if(source==frame.button){
			//通过窗体获得按钮  获得text
			String text = frame.button.getText();
			frame.textField.setText(text);		
			
		}else if(source==frame.buttonCancel){
			//点击是取消按钮
			frame.textField.setText("");
			//弹出一个消息提示框
			//JOptionPane.showMessageDialog(frame,"您点击了"+button.getText() );
			String mes = JOptionPane.showInputDialog("输入信息");
			System.out.println("mes="+mes);
			
		}else if(source.equals(frame.buttonClose)){
			//判断事件源是关闭按钮触发的
			System.out.println("您点击的是关闭窗口的按钮");
			
			
			
			
			
			frame.dispose();
			
			
		}
		
	}

}
