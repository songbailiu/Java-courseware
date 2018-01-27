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
	//空布局   给容器的布局放null
	//给每一个被添加的组件设置  setLocation(),setSize()
	//setBounds(x,y,w,h);

	public Test04NullLayout() {
		init();

		this.setTitle("空布局 实现登录界面");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		//把窗体 布局放null
		this.setLayout(null);		

		JLabel labelName = new JLabel("用户名:");
		labelName.setBounds(50, 40, 50, 25);
		this.add(labelName);		
		// 单行文本框
		JTextField jTextField = new JTextField("文本框");
		jTextField.setBounds(110, 40, 150, 25);
		this.add(jTextField);
		
		
		JLabel labelPass = new JLabel("密   码:");
		labelPass.setBounds(50, 75, 50, 25);
		this.add(labelPass);		
		// 单行文本框
		JTextField textFieldPass = new JTextField("******");
		textFieldPass.setBounds(110, 75, 150, 25);
		this.add(textFieldPass);
		
		//登录按钮
		JButton buttonLogin = new JButton("登   录");
		buttonLogin.setBounds(70, 110, 80, 25);
		this.add(buttonLogin);
		
		JButton buttonCancel = new JButton("取   消");
		buttonCancel.setBounds(170, 110, 80, 25);
		this.add(buttonCancel);

	}

	public static void main(String[] args) {
		new Test04NullLayout();
	}

}
