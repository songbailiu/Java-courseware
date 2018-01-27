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

public class Test03MyFrame extends JFrame {
	// �̳�Ŀ�����ظ�����JFrame������
	// �����Լ��ĳ�Ա

	public Test03MyFrame() {
		init();

		// Ϊ��������ͼ��
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		// ͼ��
		Image image = imageIcon.getImage();
		this.setIconImage(image);

		this.setTitle("�߿�BorderЧ��");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		// �߿�Border / BorderFactory ��̬����������ʽ�����ı߿�
		// ���߱߿�
		Border lineBorder = BorderFactory.createLineBorder(Color.BLUE);
		//����߿�
		Border titleBorder =BorderFactory.createTitledBorder("ѡ���Ա�");
		//�ձ߿�
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 5, 20);
		//����ȥб�߱߿�
		Border bevelBorder = BorderFactory.createLoweredBevelBorder();
		//��ϱ߿�
		Border compoundBorder = BorderFactory.createCompoundBorder(emptyBorder, bevelBorder);
		JPanel jPanel = new JPanel();
		//���ÿձ߿�
		jPanel.setBorder(compoundBorder);

		// �����ı���
		JTextField jTextField = new JTextField("�ı���", 8);
		// ����һ���߿�
		jTextField.setBorder(lineBorder);
		jPanel.add(jTextField);

		// ��ѡ��ť
		JRadioButton jRadioButtonMan = new JRadioButton("��");
		// ����ѡ��
		jRadioButtonMan.setSelected(true);
		JRadioButton jRadioButtonWoMan = new JRadioButton("Ů");
		// ʵ�ֵ�ѡЧ�� ����Ҫ����������ӵ� ��ť��
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButtonMan);
		buttonGroup.add(jRadioButtonWoMan);
		JPanel panelSex = new JPanel();
		panelSex.add(new JLabel("�Ա�:"));
		panelSex.add(jRadioButtonMan);
		panelSex.add(jRadioButtonWoMan);
		//���ñ���߿�
		panelSex.setBorder(titleBorder);
		
		jPanel.add(panelSex);

		this.add(jPanel);

	}

	public static void main(String[] args) {
		new Test03MyFrame();
	}

}
