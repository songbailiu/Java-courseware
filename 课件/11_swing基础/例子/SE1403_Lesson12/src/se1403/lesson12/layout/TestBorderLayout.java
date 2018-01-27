package se1403.lesson12.layout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestBorderLayout extends JFrame {
	//�߽粼�֣����������������λ��ʾ������м���Ĭ��
	//������ʱ����ָ����λ,ÿһ�����������÷�λ
	//��������Ĭ�ϲ��־��Ǳ߽粼��,JFrame,JDialog,JWindow
	
	public TestBorderLayout() {
		init();
		this.setTitle("�߽粼��BorderLayout");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void init(){
		JButton jButtonEast = new JButton("��ť����");		
		JButton jButtonWest = new JButton("��ť����");		
		JLabel jLabel = new JLabel("�ϱ߱�ǩ");
		JTextField textField = new JTextField("�����ı���");
		JButton jButtonCenter = new JButton("��ť�м�");
		
		//add(��λ,���);  ����ĸ��д
		this.add("East", jButtonEast);
		//add(�������λ)
		this.add(jButtonWest, BorderLayout.WEST);
		this.add(jLabel, BorderLayout.SOUTH);
		this.add(textField, BorderLayout.NORTH);
		this.add(jButtonCenter);
		
	}
	
	public static void main(String[] args) {
		new TestBorderLayout();
	}

}
