package gok.lesson17;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test03WindowListenerFrame extends JFrame {
	// windowListener 监听主要对象是顶层容器JFrame，JDialog等

	public Test03WindowListenerFrame() {
		init();
		this.setTitle("windowListener");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {

		// this.addWindowListener(new WindowListener() {
		//
		// @Override
		// public void windowOpened(WindowEvent e) {
		// // 窗口首次变为可见时调用。
		// System.out.println("windowOpened 窗口首次变为可见时调用。 ");
		// }
		//
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // 窗口从正常状态变为最小化状态时调用。
		// System.out.println("windowIconified 窗口从正常状态变为最小化状态时调用。");
		// }
		//
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // 窗口从最小化状态变为正常状态时调用。
		// System.out.println("  windowDeiconified   窗口从最小化状态变为正常状态时调用。 ");
		// }
		//
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // 当 Window 不再是活动 Window 时调用。
		// System.out
		// .println("windowDeactivated 当 Window 不再是活动 Window 时调用。");
		// }
		//
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // 用户试图从窗口的系统菜单中关闭窗口时调用。
		// System.out.println("windowClosing");
		// // 经常处理 业务 ....
		// // Test03WindowListenerFrame.this.dispose();
		// System.exit(0);// 安全退出应用程序
		//
		// }
		//
		// @Override
		// public void windowClosed(WindowEvent e) {
		// // 因对窗口调用 dispose 而将其关闭时调用。
		// System.out.println("windowClosed....");
		// }
		//
		// @Override
		// public void windowActivated(WindowEvent e) {
		// // 将 Window 设置为活动 Window 时调用。
		// System.out
		// .println("windowActivated 将 Window 设置为活动 Window 时调用。 ");
		//
		// }
		// });

		// 使用适配器:选择性重写相关的方法
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				// // 经常处理 业务 ....
				// // Test03WindowListenerFrame.this.dispose();
				System.exit(0);// 安全退出应用程序
			}
		});
	}

	public static void main(String[] args) {
		new Test03WindowListenerFrame();
	}

}
