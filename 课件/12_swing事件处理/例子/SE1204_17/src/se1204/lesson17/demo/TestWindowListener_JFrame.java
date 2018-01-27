package se1204.lesson17.demo;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestWindowListener_JFrame extends JFrame {
	// �����¼���ԵĶ������� JFrame����JDialog
	public TestWindowListener_JFrame() {

		this.setTitle("WindowListenerʾ��");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setVisible(true);

		/*
		 * this.addWindowListener(new WindowListener(){
		 * 
		 * public void windowActivated(WindowEvent e) { //
		 * windowActivated(WindowEvent e)�� Window ����Ϊ� Window ʱ���á�
		 * System.out.println("windowActivated"); }
		 * 
		 * public void windowClosed(WindowEvent e) { // ��Դ��ڵ��� dispose ������ر�ʱ����
		 * System.out.println("windowClosed �Ѿ��ر�"); }
		 * 
		 * public void windowClosing(WindowEvent e) { // �û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á�
		 * //��Ҫ���� �ر������Դ �ر����ݿ����ӵȶ��� System.out.println("windowClosing ���ڹر�");
		 * //�����˴��� TestWindowListener_JFrame.this.dispose(); //�˳�Ӧ�ó���
		 * System.exit(0);
		 *  }
		 * 
		 * public void windowDeactivated(WindowEvent e) { // �� Window �����ǻ
		 * Window ʱ���� System.out.println("windowDeactivated");
		 *  }
		 * 
		 * public void windowDeiconified(WindowEvent e) { // ���ڴ���С��״̬��Ϊ����״̬ʱ���á�
		 * System.out.println("windowDeiconified");
		 *  }
		 * 
		 * public void windowIconified(WindowEvent e) { // ���ڴ�����״̬��Ϊ��С��״̬ʱ���á�
		 * System.out.println("windowIconified");
		 *  }
		 * 
		 * public void windowOpened(WindowEvent e) { // �����״α�Ϊ�ɼ�ʱ���á�
		 * System.out.println("windowOpened");
		 * 
		 * }});
		 */

		// /ʹ��������:��ʵ�ֽӿڵĳ����� ���ǿ���ѡ���Ե�ʵ�ֳ�����ķ����еķ���
		// this.addWindowListener(new WindowAdapter(){
		//			
		//			
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // ��Ҫ���� �ر������Դ �ر����ݿ����ӵȶ���
		// System.out.println("windowClosing ���ڹر�");
		// //�����˴���
		// TestWindowListener_JFrame.this.dispose();
		// //�˳�Ӧ�ó���
		// System.exit(0);
		// }
		// });
				
		this.addWindowListener(new MyAdapt());

	}

	public static void main(String[] args) {
		new TestWindowListener_JFrame();
	}

	class MyAdapt extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing ���ڹر�");
			// //�����˴���
			TestWindowListener_JFrame.this.dispose();
			// //�˳�Ӧ�ó���
			System.exit(0);
		}

	}

}
