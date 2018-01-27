package gok.se1604.inner;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AInner {
	public static void main(String args[]) {
		JFrame frame = new JFrame("匿名内部类测试窗口");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("closing......");
				System.exit(0);//安全退出一样程序
			}
		});
		frame.setSize(500, 400);
		//居中显示
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
