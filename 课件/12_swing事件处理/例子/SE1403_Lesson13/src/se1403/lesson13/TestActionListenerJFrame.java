package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestActionListenerJFrame extends JFrame {
	JButton button = new JButton("��ť");
	JButton buttonSet = new JButton("����");
	
	JPanel panelSourth = new JPanel();

	public TestActionListenerJFrame() {
		init();
		
		this.add(panelSourth,BorderLayout.SOUTH);
		panelSourth.setBackground(Color.GREEN);
		panelSourth.setPreferredSize(new Dimension(400, 80));
		this.setTitle("actionEVENT��ť����¼�");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {
		JPanel panel = new JPanel();

		panel.add(button);

		panel.add(buttonSet);
		this.add(panel);

		// �¼�����
		// 1��дһ���¼������� ʵ����(�ڲ��ࡢ�����ڲ��ࡢ�ⲿ��)
		// 2�������ע�������
		// һ�����ע���˶��������:����ʱ�䣺�����˳���෴[ջ���ص㣺�Ƚ����]
		// button.addActionListener(new MyActionListener());
		// button.addActionListener(new ActionListener() {
		//			
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.out.println("2-ActionEvent  �����ڲ���----");
		//				
		// }
		// });
		// button.addActionListener(new MyButtonListener());

		// һ�����������Լ���������
		// MyActionListener actionListener = new MyActionListener();
		// button.addActionListener(actionListener);
		// buttonSet.addActionListener(actionListener);

		// ���Դ���������ʱ�򴫵ݲ���(�������)
		MyButtonListener buttonListener = new MyButtonListener(this);
		button.addActionListener(buttonListener);
		buttonSet.addActionListener(buttonListener);
	}

	public static void main(String[] args) {
		new TestActionListenerJFrame();
	}

	// �ڲ��� ʵ�ּ�����
	class MyActionListener implements ActionListener {

		// �ص��ķ�ʽ���ø÷��������¼�ActionEvent
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("1-ActionEvent������----");
			// �����¼�����¼�Դ Ϊ���ע����������Դ
			Object source = e.getSource();
			// System.out.println("source="+source);
			JButton button = (JButton) source;
			String text = button.getText();
			System.out.println("text=" + text);

			// // ���ð�ť���ı�ֵ
			// // button.setText("��ʼ");
			// if ("��ʼ".equals(text)) {
			// button.setText("ֹͣ");
			// } else {
			// button.setText("��ʼ");
			// }

			// �����жϵ�������һ����������¼�
			// ��ʽһ:�������������ı�ֵ�жϴ����¼����¼�Դ������˭?
			// if("��ť".equals(text)){
			// System.out.println("������˰�ť");
			// }else{
			// System.out.println("�����������");
			// }

			// ��ʽ��:��ť�����ȫ�ֱ���[����ɴ���ĳ�Ա]
			if (source == TestActionListenerJFrame.this.button) {
				System.out.println("������˰�ť");

			} else if (source == buttonSet) {
				System.out.println("�����������");
			}

		}

	}

}
