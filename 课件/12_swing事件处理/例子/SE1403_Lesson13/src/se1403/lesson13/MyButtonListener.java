package se1403.lesson13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {
	// �ⲿ�������У���λ�ô����϶���ĳ�Ա?���ݲ���
	TestActionListenerJFrame frame;

	public MyButtonListener(TestActionListenerJFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// this.frame = new TestActionListenerJFrame();//error ÿ�ζ������µĴ���
		System.out.println("3-ActionEvent������MyButtonListener----");
		// ��ʽ��:��ť�����ȫ�ֱ���[����ɴ���ĳ�Ա]
		Object source = e.getSource();
		if (source == frame.button) {
			System.out.println("������˰�ť");

		} else if (source == frame.buttonSet) {
			System.out.println("�����������");
			//ʵ���ϱ������������ʾ
			boolean visible = frame.panelSourth.isVisible();
			if(visible){
				frame.buttonSet.setText("չ��");
				frame.panelSourth.setVisible(false);
				frame.setSize(400, 220);
				
			}else{
				frame.buttonSet.setText("����");
				frame.panelSourth.setVisible(true);
				frame.setSize(400, 300);
			}
			
			
			
			
			
		}
	}

}
