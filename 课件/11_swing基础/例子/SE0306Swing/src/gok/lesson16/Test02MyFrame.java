package gok.lesson16;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

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

public class Test02MyFrame extends JFrame {
	// �̳�Ŀ�����ظ�����JFrame������
	// �����Լ��ĳ�Ա

	public Test02MyFrame() {
		init();
		
		//Ϊ��������ͼ��
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		//ͼ��
		Image image = imageIcon.getImage();
		this.setIconImage(image);
		
		
		this.setTitle("�ҵĴ���");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		// JPanel��������:
		// �����(��������JFrame/JDialog)�ſɼ�
		// Ĭ�Ͽɼ�;
		// Ĭ�ϲ���: FlowLayout;
		// JPanel��JPanel���໥Ƕ��;

		// ��ʽ����FLowLayout
		// �����������ѳߴ�ķ���������СgetPreferredSize()�����Ե��������setPreferredSize(w,h)
		// ���ϵ��£������ң�ˮƽ���з�ʽչʾ���
		// һ�в������Զ������ڶ�������

		JPanel jPanel = new JPanel();
		// jPanel.setBackground(Color.blue);

		// ��� --�� �м���� --�� ����
		// ��ť
		JButton button = new JButton("��ť");
		JButton button2 = new JButton("JButton��ť");
		jPanel.add(button);
		jPanel.add(button2);
		// ���ð�ť����ѳߴ�ķ���
		button.setPreferredSize(new Dimension(100, 30));
		// ���ý���
		button.setEnabled(false);

		// ����ǰ��ɫ
		// �����Լ�����ɫ
		// r,g,b 0-255
		Color color = new Color(50, 151, 200);
		button2.setForeground(color);

		// �����ı���
		JTextField jTextField = new JTextField("�ı���", 8);
		// jTextField.setPreferredSize(new Dimension(120, 30));
		jPanel.add(jTextField);

		// ��ǩ����ʾ���ֻ���ͼƬ
		JLabel jLabel = new JLabel("��ǩ:�û���:");
		jPanel.add(jLabel);

		// ������Ƕ��
		JPanel panelPass = new JPanel();
		panelPass.add(new JLabel("�û�����:"));
		JPasswordField jPasswordField = new JPasswordField("888888", 10);
		// Font font = new Font("����", Font.BOLD, 16);
		// jPasswordField.setFont(font);
		// ������ʾ�ַ�
		// jPasswordField.setEchoChar('*');
		jPasswordField.setEchoChar('��');
		panelPass.add(jPasswordField);
		jPanel.add(panelPass);

		// ��������������ı�ֵ char[] --> String
		String pass = String.valueOf(jPasswordField.getPassword());
		System.out.println("pass=" + pass);

		// �����ı���
		JTextArea jTextArea = new JTextArea("����\n�ҿ����������ֵ\n�ٺ�", 10, 20);
		// �����ı����Զ�����
		jTextArea.setLineWrap(true);
		// ��ʾ���� ����������ӵ�������� ���������Ӵ������
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jPanel.add(jScrollPane);

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
		panelSex.add(jRadioButtonMan);
		panelSex.add(jRadioButtonWoMan);
		jPanel.add(panelSex);

		// ��ѡ��
		JCheckBox jCheckBox = new JCheckBox("ͬ�ⱾЭ��");
		// ����ѡ��
		jCheckBox.setSelected(true);
		jPanel.add(jCheckBox);

		// �����б��
		String[] items = { "Сѧ", "����", "����" };
		JComboBox<String> jComboBox = new JComboBox<String>(items);
		// ���ÿ��Ա༭
		jComboBox.setEditable(true);
		jPanel.add(jComboBox);

		// ����ͼ��
		// ·�� ����ڴӹ�������ʼ
		Icon icon = new ImageIcon("image/face0.gif");
		JLabel jLabel2 = new JLabel(icon);
		jPanel.add(jLabel2);
		this.add(jPanel);

	}

	public static void main(String[] args) {
		new Test02MyFrame();
	}

}
