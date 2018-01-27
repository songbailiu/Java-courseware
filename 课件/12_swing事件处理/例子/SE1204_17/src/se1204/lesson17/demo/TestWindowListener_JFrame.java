package se1204.lesson17.demo;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestWindowListener_JFrame extends JFrame {
	// 窗口事件针对的顶层容器 JFrame或者JDialog
	public TestWindowListener_JFrame() {

		this.setTitle("WindowListener示例");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setVisible(true);

		/*
		 * this.addWindowListener(new WindowListener(){
		 * 
		 * public void windowActivated(WindowEvent e) { //
		 * windowActivated(WindowEvent e)将 Window 设置为活动 Window 时调用。
		 * System.out.println("windowActivated"); }
		 * 
		 * public void windowClosed(WindowEvent e) { // 因对窗口调用 dispose 而将其关闭时调用
		 * System.out.println("windowClosed 已经关闭"); }
		 * 
		 * public void windowClosing(WindowEvent e) { // 用户试图从窗口的系统菜单中关闭窗口时调用。
		 * //重要方法 关闭相关资源 关闭数据库连接等动作 System.out.println("windowClosing 正在关闭");
		 * //销毁了窗口 TestWindowListener_JFrame.this.dispose(); //退出应用程序
		 * System.exit(0);
		 *  }
		 * 
		 * public void windowDeactivated(WindowEvent e) { // 当 Window 不再是活动
		 * Window 时调用 System.out.println("windowDeactivated");
		 *  }
		 * 
		 * public void windowDeiconified(WindowEvent e) { // 窗口从最小化状态变为正常状态时调用。
		 * System.out.println("windowDeiconified");
		 *  }
		 * 
		 * public void windowIconified(WindowEvent e) { // 窗口从正常状态变为最小化状态时调用。
		 * System.out.println("windowIconified");
		 *  }
		 * 
		 * public void windowOpened(WindowEvent e) { // 窗口首次变为可见时调用。
		 * System.out.println("windowOpened");
		 * 
		 * }});
		 */

		// /使用适配器:是实现接口的抽象类 我们可以选择性的实现抽象父类的方法中的方法
		// this.addWindowListener(new WindowAdapter(){
		//			
		//			
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // 重要方法 关闭相关资源 关闭数据库连接等动作
		// System.out.println("windowClosing 正在关闭");
		// //销毁了窗口
		// TestWindowListener_JFrame.this.dispose();
		// //退出应用程序
		// System.exit(0);
		// }
		// });
				
		this.addWindowListener(new MyAdapt());

	}

	public static void main(String[] args) {
		new TestWindowListener_JFrame();
	}

	class MyAdapt extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing 正在关闭");
			// //销毁了窗口
			TestWindowListener_JFrame.this.dispose();
			// //退出应用程序
			System.exit(0);
		}

	}

}
