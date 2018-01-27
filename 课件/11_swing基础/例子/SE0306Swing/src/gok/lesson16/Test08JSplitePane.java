package gok.lesson16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test08JSplitePane extends JFrame {
	// �ָ����

	public Test08JSplitePane() {
		init();

		this.setTitle("�ָ����");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// �Զ�������С
		// this.pack();
	}

	private void init() {

		JPanel panel1 = new JPanel();
		panel1.add(new JButton("��ť1"));

		JPanel panel2 = new JPanel();
		panel2.add(new JButton("��ť1"));

		// ����ˮƷ�ָ�Ҳ��������ָ�
		JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				panel1, panel2);
		//���÷ָ���λ��
		jSplitPane.setDividerLocation(150);
		this.add(jSplitPane);

	}

	public static void main(String[] args) {
		new Test08JSplitePane();
	}

}
