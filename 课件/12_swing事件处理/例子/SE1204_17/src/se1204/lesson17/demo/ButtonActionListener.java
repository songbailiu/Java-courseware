package se1204.lesson17.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonActionListener implements ActionListener {
	//��ô������
	//������ͨ�����캯�����ݵ�����������
	TestActionListener2_JFrame frame;
	public ButtonActionListener(TestActionListener2_JFrame frame) {
		this.frame = frame;
//		frame = new TestActionListener2_JFrame();
	}

	public void actionPerformed(ActionEvent e) {
		//����һ������
		//frame = new TestActionListener2_JFrame();//error
		
		Object source = e.getSource();
		JButton button = (JButton)source;
		System.out.println("�������"+button.getText());
		//ͨ����������þ���ؼ�
		if(source==frame.button){
			//ͨ�������ð�ť  ���text
			String text = frame.button.getText();
			frame.textField.setText(text);		
			
		}else if(source==frame.buttonCancel){
			//�����ȡ����ť
			frame.textField.setText("");
			//����һ����Ϣ��ʾ��
			//JOptionPane.showMessageDialog(frame,"�������"+button.getText() );
			String mes = JOptionPane.showInputDialog("������Ϣ");
			System.out.println("mes="+mes);
			
		}else if(source.equals(frame.buttonClose)){
			//�ж��¼�Դ�ǹرհ�ť������
			System.out.println("��������ǹرմ��ڵİ�ť");
			
			
			
			
			
			frame.dispose();
			
			
		}
		
	}

}
