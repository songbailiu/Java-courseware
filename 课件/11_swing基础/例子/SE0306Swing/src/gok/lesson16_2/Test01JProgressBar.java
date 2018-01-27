package gok.lesson16_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test01JProgressBar extends JFrame {
	// 进度条组件
	JProgressBar progressBar = new JProgressBar(0, 100);
	int v = 0;

	public Test01JProgressBar() {
		init();

		this.setTitle("进度条组件");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		while (v < 100) {
			v++;
			progressBar.setValue(v);
			// 当前线程等待1秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void init() {
		JPanel panel = new JPanel();

		// 创建进度条

		// 设置当前进度
		progressBar.setValue(v);
		// 是否显示当前进度的百分比
		progressBar.setStringPainted(true);
		// 设置进度条的颜色
		progressBar.setForeground(Color.GREEN);
		progressBar.setPreferredSize(new Dimension(200, 20));

		panel.add(progressBar);

		this.add(panel);

		// 进度条动起来 间隔性的改变 当前value
		// Thread thread = new Thread(){
		// @Override
		// public void run() {
		// //
		// //int value = progressBar.getValue();
		// while(v<100){
		// v++;
		// progressBar.setValue(v);
		// //当前线程等待1秒
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }
		// };
		//
		// thread.start();

	}

	public static void main(String[] args) {
		new Test01JProgressBar();
	}

}
