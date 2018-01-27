package gok.lesson17;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test01ActionListenerFrame extends JFrame {
	// ActionListener ���� ��ť ���²��ͷţ��˵� ����¼��ȵ�
	
	
	//�������� ��Ա����  �����ǵ�ǰ����ʵ��������
	JButton button = new JButton("��ť");
	JButton buttonSet = new JButton("����");
	JTextField textField = new JTextField(8);
	
	
	public Test01ActionListenerFrame() {
		init();
		this.setTitle("ActionListener");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		
		panel.add(button);
		
		panel.add(buttonSet);
		panel.add(textField);
		this.add(panel);

		// ��ťָ��Action����
		// ʵ��ʵ��������Ϊ:
		// �ҵ��¼�Դ; (�簴ť�����)
		// ��������������;(��ʵ����Ӧ�ӿڵ���)
		// Ϊ�¼�Դע�����������;
		
		//д��ʵ�ּ������ӿڷ�ʽ���ڲ��ࡢ�����ڲ��ࡢ�ⲿ�඼����ʵ��
		//һ���������ע������������һ��������Ҳ���Լ���������
		button.addActionListener(new MyButtonListener());
		// �����ڲ���ʵ�ּ������ӿ�
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("2 --- �����ڲ���ʵ�ּ���");
			}
		});
		
		
		//���ݲ������ѵ�ǰ�Ĵ������this��Ϊ�������ݵ���������
		Test01_3ActionListener listener = new Test01_3ActionListener(this);
		button.addActionListener(listener);
		
		//�ܽ�:��һ�����ͬʱע���˶���������󣬼�����ִ��˳��  �� ע���˳���෴[ջ�Ĺ��� �Ƚ����]
		//listener���������������2����ť
		buttonSet.addActionListener(listener);
	
	}

	public static void main(String[] args) {
		new Test01ActionListenerFrame();
	}

	// �ڲ��� ʵ�ּ������ӿ�
	class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// ��ť�����¼��� ִ�еķ���
			System.out.println("1 -- �ڲ��� ʵ��  ��ť������� ������Action�¼�....");
			// �����¼��������¼�Դ����[���]
			Object source = e.getSource();
			// System.out.println("source="+source);
			// ���� ��JButton
			JButton button = (JButton) source;
			String text = button.getText();
			if ("��ʼ".equals(text)) {
				button.setText("ֹͣ");
			} else {
				button.setText("��ʼ");
			}

			// Test01ActionListenerFrame.this.setTitle("����,��ʹ");
		}

	}

}
