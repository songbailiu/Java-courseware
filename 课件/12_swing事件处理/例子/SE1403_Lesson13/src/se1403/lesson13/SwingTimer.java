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
	// ������ٺ���ִ��actionListener�ӿ��еķ���һ��
	Timer timer = new Timer(1000, new TimerListener());
	int count = 0;
	JLabel labelTime = new JLabel("��ʾʱ��:");
	JButton buttonStart = new JButton("��ʼ");
	JButton buttonStop = new JButton("ֹͣ");
	JTextArea jTextArea = new JTextArea();
	TimerProgressBar timerProgressBar = new TimerProgressBar(100);

	public SwingTimer() {
		init();
		// TODO Auto-generated constructor stub
		// ������ʱ��
		// timer.start();

		this.setTitle("SWING��ʱ��");
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

		// �м�������
		jTextArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(jTextArea);

		this.add(scrollPane);
		
		
		//�����ϱ�
		JPanel panelSouth = new JPanel();
		timerProgressBar.setPreferredSize(new Dimension(200, 22));
		panelSouth.add(timerProgressBar);
		this.add(panelSouth, BorderLayout.SOUTH);
	}

	// SWING ��Timer ��Ҫָ��һ��������
	class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// ���ָ��ʱ�򶼻���ø÷���һ��
			count++;
			// System.out.println("��ʱ��...."+count);
			labelTime.setText("��ʾʱ��:" + count + "��");
			setTitle("SWING��ʱ��[" + count + "��]");
			jTextArea.append(count + "��\n");
		}

	}

	// ��ť����
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonStart) {
				// ��ʼ
				timer.start();
				buttonStop.setEnabled(true);
				buttonStart.setEnabled(false);
				count = 0;
				jTextArea.setText("");
				timerProgressBar.start();
			} else {
				// ֹͣ
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
		
		
		//������ҵ  ��ɾ��м�ʱ�����ܵĽ�����
	}

}
