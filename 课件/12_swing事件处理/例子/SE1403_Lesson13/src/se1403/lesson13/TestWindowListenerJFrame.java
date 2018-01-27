package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class TestWindowListenerJFrame extends JFrame {
	// �¼�Դ: JFrame,JDialog �����

	public TestWindowListenerJFrame() {
		init();

		this.setTitle("Window�¼�");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {

		// this.addWindowListener(new WindowListener() {
		//			
		// @Override
		// public void windowOpened(WindowEvent e) {
		// //�����״α�Ϊ�ɼ�ʱ���á�
		// System.out.println("windowOpened�����״α�Ϊ�ɼ�ʱ���á�");
		//				
		// }
		//			
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // ���ڴ�����״̬��Ϊ��С��״̬ʱ���á�
		// System.out.println("windowIconified ���ڴ�����״̬��Ϊ��С��״̬ʱ���á�");
		//				
		// }
		//			
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // ���ڴ���С��״̬��Ϊ����״̬ʱ���á�
		// System.out.println("windowDeiconified���ڴ���С��״̬��Ϊ����״̬ʱ���á�");
		//				
		// }
		//			
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // �� Window �����ǻ Window ʱ����
		// System.out.println("windowDeactivated�� Window �����ǻ Window ʱ����");
		// }
		//			
		// @Override
		// public void windowClosing(WindowEvent e) {
		// //��ͼ�رմ���ʱ�������¼�
		// System.out.println("windowClosing....");
		//				
		// //�ֶ����ٴ���
		// TestWindowListenerJFrame.this.dispose();
		// //�˳�Ӧ�ó���:�رճ��˴���֮���������Դ
		// System.exit(0);
		//				
		// }
		//			
		// @Override
		// public void windowClosed(WindowEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("windowClosed..�Ѿ��ر�..");
		// }
		//			
		// @Override
		// public void windowActivated(WindowEvent e) {
		// //�� Window ����Ϊ� Window ʱ����
		// System.out.println("windowActivated�� Window ����Ϊ� Window ʱ����");
		// }
		// });

		// ʹ��������:�����࣬�򵥴�����ӿ��еĺܶ෽�������ǿ���ѡ����ʵ����ط�����������Ҫȫ��ʵ��
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// �ص�ʵ�ָ÷���
				// ��ͼ�رմ���ʱ�������¼�
				System.out.println("windowClosing....");

				// //�ֶ����ٴ���
				TestWindowListenerJFrame.this.dispose();
				// �˳�Ӧ�ó���:�رճ��˴���֮���������Դ
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new TestWindowListenerJFrame();
	}

}
