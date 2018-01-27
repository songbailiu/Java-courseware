package gok.lesson17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Test05SwingTimer extends JFrame {
	// 间隔时间1000 单位毫秒,监听器
	// 间隔多少时间执行 监听器的方法
	Timer timer = new Timer(1000, new TimerActionListener());
	int i = 0;
	JLabel label = new JLabel("计时器:");
	JButton buttonStart = new JButton("开始");
	JButton buttonStop = new JButton("停止");

	JTextArea textArea = new JTextArea();

	public Test05SwingTimer() {
		init();
		this.setTitle("SWING Timer定时器");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		// 启动计时器
//		timer.start();

	}

	private void init() {
		JPanel panel = new JPanel();

		label.setPreferredSize(new Dimension(150, 25));
		label.setBorder(BorderFactory.createLineBorder(Color.blue));

		panel.add(buttonStart);
		panel.add(buttonStop);
		panel.add(label);
		this.add(panel, BorderLayout.NORTH);
		//禁用停止按钮
		buttonStop.setEnabled(false);

		JScrollPane jScrollPane = new JScrollPane(textArea);
		this.add(jScrollPane);
		textArea.setEditable(false);

		ButtonListener buttonListener = new ButtonListener();
		buttonStart.addActionListener(buttonListener);
		buttonStop.addActionListener(buttonListener);
	}

	public static void main(String[] args) {
		new Test05SwingTimer();
	}

	/**
	 * 为计时器 服务
	 * 
	 * @author admin
	 * 
	 */
	class TimerActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 计时器 执行的 处理代码
			i++;
			System.out.println("计时器....." + i);
			label.setText("计时器:" + i + "秒");
			textArea.append(i + "秒\n");
		}
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonStart) {
				// 启动计时器
				timer.start();
				buttonStart.setEnabled(false);
				buttonStop.setEnabled(true);
				
				//文本域内容清空
				textArea.setText("");
			} else {
				// 停止计时器
				timer.stop();
				buttonStart.setEnabled(true);
				buttonStop.setEnabled(false);
				i = 0;

			}

		}

	}

}
