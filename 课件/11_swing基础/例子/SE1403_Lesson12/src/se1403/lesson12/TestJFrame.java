package se1403.lesson12;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JFrame类的特性:
		// 默认不可视;
		// 默认宽高为0;
		// JFrame与JFrame不能相互嵌套

		JFrame jFrame = new JFrame("java第一个窗口");
		// 设置宽与高
		jFrame.setSize(400, 500);
		// 设置居中屏幕显示
		jFrame.setLocationRelativeTo(null);
		// 指定具体坐标显示
		// jFrame.setLocation(100, 20);

		// 默认的关闭模式：隐藏//HIDE_ON_CLOSE
		// DO_NOTHING_ON_CLOSE 啥都不干
		// //DISPOSE_ON_CLOSE 销毁窗口
		// EXIT_ON_CLOSE 退出应用程序
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 设置不可改变大小[可选]
		jFrame.setResizable(false);

		// 设置可视化
		jFrame.setVisible(true);

		// 常用构造方法: JDialog(JFrame f,String s);
		// JDialog具有和JFrame一样的特性;
		// JDialog分两种: 有模,无模;
		// 依附于窗体
		JDialog jDialog = new JDialog(jFrame, "java第一个Dialog");
		// 设置宽与高
		jDialog.setSize(200, 300);
		// 设置居中屏幕显示
		jDialog.setLocationRelativeTo(jFrame);
		// 指定具体坐标显示
		// jFrame.setLocation(100, 20);
		// 默认的关闭模式：隐藏//HIDE_ON_CLOSE
		// DO_NOTHING_ON_CLOSE 啥都不干
		// //DISPOSE_ON_CLOSE 销毁窗口
		jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 设置不可改变大小[可选]
		jDialog.setResizable(false);
		// 设置模式[重点]//锁住父窗口
		jDialog.setModal(true);
		// 设置可视化
		jDialog.setVisible(true);

		// 模式对话框:暂用程序执行权，线程执行权,后续代码全部被暂停，直到对话框销毁后才会执行

		System.out.println("main结束......");
		// 总结：只有对话框销毁，才会执行上一句话

	}

}
