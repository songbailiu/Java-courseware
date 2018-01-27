package gok.lesson16;

import java.awt.BorderLayout;
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test05BorderLayout extends JFrame {
	//�߽粼�� BorderLayout  ����������Ĭ�ϲ���
	//���������� ��������ÿһ����λ
	//�м��ö���Ŀռ�

	public Test05BorderLayout() {
		init();

		this.setTitle("�߽粼��");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		JButton buttonWest = new JButton("����");
		JButton buttonEast = new JButton("����");
		JButton buttonSouth = new JButton("�ϱ�");
		JButton buttonNorth = new JButton("����");
		//�����������ѡ��С ���ı䷽λ�Ŀ����
		//buttonNorth.setPreferredSize(new Dimension(150, 100));
		JButton buttonCenter = new JButton("�м䰴ť");
		
		//��������ʱ�����ָ����λ
		this.add("West",buttonWest);
		this.add(buttonEast,BorderLayout.EAST);
		this.add(buttonSouth,BorderLayout.SOUTH);
		this.add(buttonNorth,BorderLayout.NORTH);
		this.add(buttonCenter);//Ĭ�� ���м�

	}

	public static void main(String[] args) {
		new Test05BorderLayout();
	}

}
