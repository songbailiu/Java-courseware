package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.UIManager;

public class SwingTimer extends JFrame {
	// 间隔多少毫秒执行actionListener接口中的方法一次
	Timer timer = new Timer(1000, new TimerListener());
	int count = 0;
	JLabel labelTime = new JLabel("显示时间:");
	JButton buttonStart = new JButton("开始");
	JButton buttonStop = new JButton("停止");
	JTextArea jTextArea = new JTextArea();
	TimerProgressBar timerProgressBar = new TimerProgressBar(100);

	public SwingTimer() {
		init();
		// TODO Auto-generated constructor stub
		// 启动计时器
		// timer.start();

		this.setTitle("SWING计时器");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {

		ButtonListener buttonListener = new ButtonListener();

		buttonStart.addActionListener(buttonListener);
		buttonStop.addActionListener(buttonListener);
		buttonStop.setEnabled(false);
		JPanel panel = new JPanel();
		panel.add(buttonStart);
		panel.add(buttonStop);
		panel.add(labelTime);
		labelTime.setPreferredSize(new Dimension(150, 25));
		labelTime.setForeground(Color.red);

		this.add(panel, BorderLayout.NORTH);

		// 中间滚动面板
		jTextArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(jTextArea);

		this.add(scrollPane);
		
		
		//窗体南边
		JPanel panelSouth = new JPanel();
		timerProgressBar.setPreferredSize(new Dimension(200, 22));
		panelSouth.add(timerProgressBar);
		this.add(panelSouth, BorderLayout.SOUTH);
	}

	// SWING 的Timer 需要指定一个监听器
	class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 间隔指定时候都会调用该方法一次
			count++;
			// System.out.println("计时器...."+count);
			labelTime.setText("显示时间:" + count + "秒");
			setTitle("SWING计时器[" + count + "秒]");
			jTextArea.append(count + "秒\n");
		}

	}

	// 按钮监听
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonStart) {
				// 开始
				timer.start();
				buttonStop.setEnabled(true);
				buttonStart.setEnabled(false);
				count = 0;
				jTextArea.setText("");
				timerProgressBar.start();
			} else {
				// 停止
				timer.stop();
				buttonStop.setEnabled(false);
				buttonStart.setEnabled(true);
				timerProgressBar.stop();

			}
		}

	}

	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new SwingTimer();
		
		
		//课堂作业  完成具有计时器功能的进度条
	}

}
