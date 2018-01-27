package gok.lesson17;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test03WindowListenerFrame extends JFrame {
	// windowListener ������Ҫ�����Ƕ�������JFrame��JDialog��

	public Test03WindowListenerFrame() {
		init();
		this.setTitle("windowListener");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {

		// this.addWindowListener(new WindowListener() {
		//
		// @Override
		// public void windowOpened(WindowEvent e) {
		// // �����״α�Ϊ�ɼ�ʱ���á�
		// System.out.println("windowOpened �����״α�Ϊ�ɼ�ʱ���á� ");
		// }
		//
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // ���ڴ�����״̬��Ϊ��С��״̬ʱ���á�
		// System.out.println("windowIconified ���ڴ�����״̬��Ϊ��С��״̬ʱ���á�");
		// }
		//
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // ���ڴ���С��״̬��Ϊ����״̬ʱ���á�
		// System.out.println("  windowDeiconified   ���ڴ���С��״̬��Ϊ����״̬ʱ���á� ");
		// }
		//
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // �� Window �����ǻ Window ʱ���á�
		// System.out
		// .println("windowDeactivated �� Window �����ǻ Window ʱ���á�");
		// }
		//
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // �û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á�
		// System.out.println("windowClosing");
		// // �������� ҵ�� ....
		// // Test03WindowListenerFrame.this.dispose();
		// System.exit(0);// ��ȫ�˳�Ӧ�ó���
		//
		// }
		//
		// @Override
		// public void windowClosed(WindowEvent e) {
		// // ��Դ��ڵ��� dispose ������ر�ʱ���á�
		// System.out.println("windowClosed....");
		// }
		//
		// @Override
		// public void windowActivated(WindowEvent e) {
		// // �� Window ����Ϊ� Window ʱ���á�
		// System.out
		// .println("windowActivated �� Window ����Ϊ� Window ʱ���á� ");
		//
		// }
		// });

		// ʹ��������:ѡ������д��صķ���
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				// // �������� ҵ�� ....
				// // Test03WindowListenerFrame.this.dispose();
				System.exit(0);// ��ȫ�˳�Ӧ�ó���
			}
		});
	}

	public static void main(String[] args) {
		new Test03WindowListenerFrame();
	}

}
