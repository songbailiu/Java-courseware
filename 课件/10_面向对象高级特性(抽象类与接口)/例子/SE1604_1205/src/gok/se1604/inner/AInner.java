package gok.se1604.inner;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AInner {
	public static void main(String args[]) {
		JFrame frame = new JFrame("�����ڲ�����Դ���");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("closing......");
				System.exit(0);//��ȫ�˳�һ������
			}
		});
		frame.setSize(500, 400);
		//������ʾ
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
