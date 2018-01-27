package gok.lesson16;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Test01JFrame {

	public static void main(String[] args) {
		// JFrame窗口
		// JFrame类的特性:
		// 默认不可视;
		// 默认宽高为0;
		// JFrame与JFrame不能相互嵌套
		// 默认布局是边界布局(边框布局)
		JFrame jFrame = new JFrame("java第一个窗口");
		// 设置 窗口的标题
		jFrame.setTitle("java SWING窗口");
		// 设置宽与高
		jFrame.setSize(400, 500);
		// 设置居中显示 位置
		// 相对于左上角的水平与纵向坐标
		// jFrame.setLocation(100, 50);
		// 相对居中位置 参照容器来设置 放空null 参照屏幕来居中
		jFrame.setLocationRelativeTo(null);
		// 设置X关闭模式 EXIT_ON_CLOSE 退出应用程序
		// static int DISPOSE_ON_CLOSE 移除窗口的默认窗口关闭操作。
		// static int DO_NOTHING_ON_CLOSE 无操作默认窗口关闭操作。
		// static int EXIT_ON_CLOSE 退出应用程序默认窗口关闭操作。
		// static int HIDE_ON_CLOSE[默认] 隐藏窗口的默认窗口关闭操作

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置不可改变大小[可选]
		// jFrame.setResizable(false);

		// 顶层容器的布局都是边框布局 BorderLayout
		JButton jButton1 = new JButton("按钮1");
		jFrame.add(jButton1);
		JButton jButtonNorth = new JButton("按钮2北边");
		jFrame.add(jButtonNorth, BorderLayout.NORTH);
		JButton jButtonSouth = new JButton("按钮3南边");
		jFrame.add(jButtonSouth, BorderLayout.SOUTH);
		// 设置可视化[建议最后面 设置该属性]
		jFrame.setVisible(true);

		// 对话框JDialog 依附于JFrame 一种对话框窗口
		// JDialog(JFrame f,String s);
		// JDialog具有和JFrame一样的特性;
		// JDialog分两种: 有模,无模;

		 JDialog jDialog = new JDialog(jFrame, "对话框");
		 jDialog.setSize(new Dimension(200, 250));
		 jDialog.setLocationRelativeTo(jFrame);
		 //对话框的关闭模式不能设置退出应用程序的常量值
		 //只能Hide,DISPOSE,DO_NOTHING_ON_CLOSE
		 //jDialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//error
		 //设置有模式[锁住当前的主界面]
		 jDialog.setModal(true);
		 jDialog.setVisible(true);
		 System.out.println("main方法结束....");
		 //当模式对话框可视化之后 打印语句没有出来，因为模式对话框会强制占用程序的执行权
		 //直到对话框销毁后才会释放程序的执行权
		 //才能执行 打印语句
		 
		 //避免 在对话框显示之后 做相关的业务处理，因为执行不到

	}

}
