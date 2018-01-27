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
	// ���ʱ��1000 ��λ����,������
	// �������ʱ��ִ�� �������ķ���
	Timer timer = new Timer(1000, new TimerActionListener());
	int i = 0;
	JLabel label = new JLabel("��ʱ��:");
	JButton buttonStart = new JButton("��ʼ");
	JButton buttonStop = new JButton("ֹͣ");

	JTextArea textArea = new JTextArea();

	public Test05SwingTimer() {
		init();
		this.setTitle("SWING Timer��ʱ��");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		// ������ʱ��
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
		//����ֹͣ��ť
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
	 * Ϊ��ʱ�� ����
	 * 
	 * @author admin
	 * 
	 */
	class TimerActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// ��ʱ�� ִ�е� �������
			i++;
			System.out.println("��ʱ��....." + i);
			label.setText("��ʱ��:" + i + "��");
			textArea.append(i + "��\n");
		}
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonStart) {
				// ������ʱ��
				timer.start();
				buttonStart.setEnabled(false);
				buttonStop.setEnabled(true);
				
				//�ı����������
				textArea.setText("");
			} else {
				// ֹͣ��ʱ��
				timer.stop();
				buttonStart.setEnabled(true);
				buttonStop.setEnabled(false);
				i = 0;

			}

		}

	}

}
