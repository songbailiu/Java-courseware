package se1403.lesson13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {
	// 外部监听器中，如何获得窗体上定义的成员?传递参数
	TestActionListenerJFrame frame;

	public MyButtonListener(TestActionListenerJFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// this.frame = new TestActionListenerJFrame();//error 每次都创建新的窗体
		System.out.println("3-ActionEvent触发了MyButtonListener----");
		// 方式二:按钮定义成全局变量[定义成窗体的成员]
		Object source = e.getSource();
		if (source == frame.button) {
			System.out.println("您点击了按钮");

		} else if (source == frame.buttonSet) {
			System.out.println("您点击了设置");
			//实现南边面板隐藏与显示
			boolean visible = frame.panelSourth.isVisible();
			if(visible){
				frame.buttonSet.setText("展开");
				frame.panelSourth.setVisible(false);
				frame.setSize(400, 220);
				
			}else{
				frame.buttonSet.setText("隐藏");
				frame.panelSourth.setVisible(true);
				frame.setSize(400, 300);
			}
			
			
			
			
			
		}
	}

}
