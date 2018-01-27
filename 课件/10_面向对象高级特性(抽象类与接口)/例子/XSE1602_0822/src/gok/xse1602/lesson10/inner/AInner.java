package gok.xse1602.lesson10.inner;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AInner {
	public static void main(String args[]) {
		JFrame frame = new JFrame("匿名内部类测试窗口");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("窗口正在关闭中.....");
				System.exit(0);//0安全退出应用程序
			}
		});
		frame.setSize(400, 200);
		//屏幕居中....
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
