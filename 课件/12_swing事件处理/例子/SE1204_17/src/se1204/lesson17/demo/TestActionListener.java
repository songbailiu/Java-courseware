package se1204.lesson17.demo;


import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestActionListener extends JFrame {
	public TestActionListener() {
		init();
		this.setTitle("ActionListenerʾ��");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {
		JButton button = new JButton("��ť");
//		//�ı���
		JTextField textField = new JTextField(8);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(textField);
		//ʵ�ּ����Ĳ���
		//1��д�����¼��Ķ�Ӧ�����ӿڵ�ʵ����
		//2��Ϊ��Ӧ�����ע�����  addXXXListener(XXXListenerʵ��);
		//3���ڽӿ�ʵ����Ļص������д����¼�
		
		//ʵ�ּ�������������ַ�ʽ:�����ڲ��࣬�ڲ��࣬�ⲿ��
		
		//ע�������(���������¼�)
		button.addActionListener(new MyActionListener());
//		//�����ڲ���ʵ�ּ�����
//		button.addActionListener(new ActionListener(){
//
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("-------------------");
//				
//			}});
		
//		button.addActionListener(new ButtonActionListener());
		
		
		this.add(panel);
		
		
	}

	public static void main(String[] args) {
		new TestActionListener();
	}
	
	//д��ʵ�־����¼����͵ļ����ӿ�
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// �����¼��Ļص�����
			System.out.println("action�¼�������....");
			
			//ͨ���¼�����¼�Դ
			Object source = e.getSource();
			if(source instanceof JButton){
				JButton button = (JButton)source;
				String text = button.getText();
				System.out.println("text="+text);
				if("��ť".equals(text)){
					button.setText("����");
					
				}else{
					button.setText("��ť");
					
				}
				
				
//				button.setText("����");
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
