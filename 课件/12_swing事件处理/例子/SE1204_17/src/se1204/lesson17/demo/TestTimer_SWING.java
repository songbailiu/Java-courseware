package se1204.lesson17.demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestTimer_SWING extends JFrame {
	private JButton buttonStart = new JButton("��ʼ");

	private JButton buttonStop = new JButton("ֹͣ");

	private JTextArea textArea = new JTextArea();

	// SWING������ļ�ʱ����Ҫ������
	// ������ٺ���ָ�� ����������Ĵ���
	// һ��ִ��һ��
	private Timer timer = new Timer(1000, new MyTimeListener());

	int count = 0;

	public TestTimer_SWING() {
		init();

		this.setTitle("��ʱ��ʾ��");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setVisible(true);

	}

	private void init() {
		JPanel panelNorth = new JPanel();
		panelNorth.add(buttonStart);
		panelNorth.add(buttonStop);

		MyButtonListener buttonListener = new MyButtonListener();
		buttonStart.addActionListener(buttonListener);
		buttonStop.addActionListener(buttonListener);
		textArea.setEditable(false);
		this.add(panelNorth, BorderLayout.NORTH);
		this.add(new JScrollPane(textArea), BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new TestTimer_SWING();
	}

	class MyTimeListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("��ʱ��������....");
			count++;

			textArea.append(count + "��\n");

		}
	}

	class MyButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonStart) {
				timer.start();
			} else if (e.getSource() == buttonStop) {
				timer.stop();
				count = 0;
				textArea.setText(null);
			}

		}

	}

}
