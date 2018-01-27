package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class TestWindowListenerJFrame extends JFrame {
	// 事件源: JFrame,JDialog 等组件

	public TestWindowListenerJFrame() {
		init();

		this.setTitle("Window事件");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {

		// this.addWindowListener(new WindowListener() {
		//			
		// @Override
		// public void windowOpened(WindowEvent e) {
		// //窗口首次变为可见时调用。
		// System.out.println("windowOpened窗口首次变为可见时调用。");
		//				
		// }
		//			
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // 窗口从正常状态变为最小化状态时调用。
		// System.out.println("windowIconified 窗口从正常状态变为最小化状态时调用。");
		//				
		// }
		//			
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // 窗口从最小化状态变为正常状态时调用。
		// System.out.println("windowDeiconified窗口从最小化状态变为正常状态时调用。");
		//				
		// }
		//			
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // 当 Window 不再是活动 Window 时调用
		// System.out.println("windowDeactivated当 Window 不再是活动 Window 时调用");
		// }
		//			
		// @Override
		// public void windowClosing(WindowEvent e) {
		// //视图关闭窗口时触发该事件
		// System.out.println("windowClosing....");
		//				
		// //手动销毁窗口
		// TestWindowListenerJFrame.this.dispose();
		// //退出应用程序:关闭除了窗口之外的其他资源
		// System.exit(0);
		//				
		// }
		//			
		// @Override
		// public void windowClosed(WindowEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("windowClosed..已经关闭..");
		// }
		//			
		// @Override
		// public void windowActivated(WindowEvent e) {
		// //将 Window 设置为活动 Window 时调用
		// System.out.println("windowActivated将 Window 设置为活动 Window 时调用");
		// }
		// });

		// 使用适配器:抽象类，简单处理过接口中的很多方法，我们可以选择性实现相关方法，而不需要全部实现
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// 重点实现该方法
				// 视图关闭窗口时触发该事件
				System.out.println("windowClosing....");

				// //手动销毁窗口
				TestWindowListenerJFrame.this.dispose();
				// 退出应用程序:关闭除了窗口之外的其他资源
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new TestWindowListenerJFrame();
	}

}
