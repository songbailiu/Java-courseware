package gok.xse1602.lesson10.inner;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class AInner {
	public static void main(String args[]) {
		JFrame frame = new JFrame("�����ڲ�����Դ���");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("�������ڹر���.....");
				System.exit(0);//0��ȫ�˳�Ӧ�ó���
			}
		});
		frame.setSize(400, 200);
		//��Ļ����....
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
