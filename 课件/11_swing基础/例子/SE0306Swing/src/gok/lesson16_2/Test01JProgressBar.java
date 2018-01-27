package gok.lesson16_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test01JProgressBar extends JFrame {
	// ���������
	JProgressBar progressBar = new JProgressBar(0, 100);
	int v = 0;

	public Test01JProgressBar() {
		init();

		this.setTitle("���������");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		while (v < 100) {
			v++;
			progressBar.setValue(v);
			// ��ǰ�̵߳ȴ�1��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void init() {
		JPanel panel = new JPanel();

		// ����������

		// ���õ�ǰ����
		progressBar.setValue(v);
		// �Ƿ���ʾ��ǰ���ȵİٷֱ�
		progressBar.setStringPainted(true);
		// ���ý���������ɫ
		progressBar.setForeground(Color.GREEN);
		progressBar.setPreferredSize(new Dimension(200, 20));

		panel.add(progressBar);

		this.add(panel);

		// ������������ ����Եĸı� ��ǰvalue
		// Thread thread = new Thread(){
		// @Override
		// public void run() {
		// //
		// //int value = progressBar.getValue();
		// while(v<100){
		// v++;
		// progressBar.setValue(v);
		// //��ǰ�̵߳ȴ�1��
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }
		// };
		//
		// thread.start();

	}

	public static void main(String[] args) {
		new Test01JProgressBar();
	}

}
