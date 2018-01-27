package gok.lesson16;

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

public class Test04NullLayout extends JFrame {
	//�ղ���   �������Ĳ��ַ�null
	//��ÿһ������ӵ��������  setLocation(),setSize()
	//setBounds(x,y,w,h);

	public Test04NullLayout() {
		init();

		this.setTitle("�ղ��� ʵ�ֵ�¼����");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		//�Ѵ��� ���ַ�null
		this.setLayout(null);		

		JLabel labelName = new JLabel("�û���:");
		labelName.setBounds(50, 40, 50, 25);
		this.add(labelName);		
		// �����ı���
		JTextField jTextField = new JTextField("�ı���");
		jTextField.setBounds(110, 40, 150, 25);
		this.add(jTextField);
		
		
		JLabel labelPass = new JLabel("��   ��:");
		labelPass.setBounds(50, 75, 50, 25);
		this.add(labelPass);		
		// �����ı���
		JTextField textFieldPass = new JTextField("******");
		textFieldPass.setBounds(110, 75, 150, 25);
		this.add(textFieldPass);
		
		//��¼��ť
		JButton buttonLogin = new JButton("��   ¼");
		buttonLogin.setBounds(70, 110, 80, 25);
		this.add(buttonLogin);
		
		JButton buttonCancel = new JButton("ȡ   ��");
		buttonCancel.setBounds(170, 110, 80, 25);
		this.add(buttonCancel);

	}

	public static void main(String[] args) {
		new Test04NullLayout();
	}

}
