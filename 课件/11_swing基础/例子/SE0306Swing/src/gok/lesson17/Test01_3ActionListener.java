package gok.lesson17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/*
 * �ⲿ�෽ʽ ʵ�ֽӿ�
 */
public class Test01_3ActionListener implements ActionListener {
	Test01ActionListenerFrame frame;

	public Test01_3ActionListener(Test01ActionListenerFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("3---�ⲿ������.....");
		Object source = e.getSource();

		// ��ǰ�����������˶�����ʱ ������ж� �������ĸ�����������¼�
		// ��ʽһ������������ı�ֵ �ж� [����ϵ��ı�ֵ ��������ı�]
		// if(source instanceof JButton){
		// JButton button = (JButton) source;
		// String text = button.getText();
		// if("����".equals(text)){
		// System.out.println("�� ����� ���ð�ť");
		// }else{
		// System.out.println("�� ����� ����  ���ð�ť");
		// }
		// }

		// ��ʽ���� ���ݴ�������еĳ�Ա �ж϶����Ƿ�һ��
		if (source == frame.button) {
			System.out.println("���������  ��ť");
			frame.textField.setText(frame.button.getText());
			
		} else if (source == frame.buttonSet) {
			System.out.println("���������  ����");
			//��ֵ���ı���
			frame.textField.setText(frame.buttonSet.getText());
		}

	}

}
