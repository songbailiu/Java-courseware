package se1204.lesson17.demo;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestActionListener2_JFrame extends JFrame {
	// ��ť���ı������ڴ��������

	JButton button = new JButton("��ť");

	JButton buttonCancel = new JButton("ȡ��");

	JButton buttonClose = new JButton("�رմ���");

	JTextField textField = new JTextField(8);

	public TestActionListener2_JFrame() {
		init();
		this.setTitle("ActionListenerʾ��");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {

		// //�ı���

		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(textField);
		panel.add(buttonCancel);
		panel.add(buttonClose);

		ButtonActionListener listener = new ButtonActionListener(this);
		button.addActionListener(listener);
		buttonCancel.addActionListener(listener);
		buttonClose.addActionListener(listener);

		this.add(panel);

	}

	// д��ʵ�־����¼����͵ļ����ӿ�
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// �����¼��Ļص�����
			System.out.println("action�¼�������....");

			// ͨ���¼�����¼�Դ
			Object source = e.getSource();
			if (source instanceof JButton) {
				JButton button = (JButton) source;
				String text = button.getText();
				System.out.println("text=" + text);
				if ("��ť".equals(text)) {
					button.setText("����");

				} else {
					button.setText("��ť");

				}

				// button.setText("����");

			}

		}

	}

	public static void main(String[] args) {
		new TestActionListener2_JFrame();
	}

}
