package se1403.lesson12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.nio.Buffer;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class MyJFrame extends JFrame {

	public MyJFrame() {
		init();
		
		//icon,ImageIcon,Image
		//ͼƬ
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		//ͼ��
		Image image = imageIcon.getImage();
		//��������ͼ��
		this.setIconImage(image);
		this.setTitle("�ҵĴ���");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		// ˼·:�ؼ� --�� ��� --������
		// JPanel��������:
		// �����(��������JFrame\JDialog)�ſɼ�
		// Ĭ�Ͽɼ�;
		
		// JPanel��JPanel���໥Ƕ��;
		// Ĭ�ϲ���: FlowLayout;
		//���ϵ��£������ң�������ʾ�������һ�зŲ��º��Զ�����
		//���������getPreferredSize()������С
		//��ʽ������������ͨ��setPreferredSize���ÿ������Ч

		JPanel jPanel = new JPanel();
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		jPanel.setLayout(flowLayout);
		// jPanel.setBackground(Color.white);
		this.add(jPanel);

		// SWing��ť
		JButton jButton = new JButton("��ť");
		//�Ƿ�����
		jButton.setEnabled(false);
		jButton.setForeground(Color.GREEN);
		jPanel.add(jButton);
		// awt�Ŀؼ���Swing�Ŀؼ���Ҫ���ʹ��
		// Button button = new Button("AWT��ť");
		// jPanel.add(button);

		// ��ǩ:���ֻ���ͼƬ
		JLabel jLabel = new JLabel("��ǩ:��ʾ���ֻ���ͼƬ");
		//ͼƬIcon�ӿ�ImageIconʵ����
		Icon icon = new ImageIcon("image/face0.gif");
		jLabel.setIcon(icon);
		jPanel.add(jLabel);

		// �ı���
		JTextField jTextField = new JTextField("�����ı���");
		//���ò��ɱ༭
		jTextField.setEditable(false);
		jPanel.add(jTextField);
		System.out.println(jTextField.getText());
		// ��ʽ���֣���������Ŀ����
		jTextField.setPreferredSize(new Dimension(200, 30));
		// ����
		Font font = new Font("����", Font.ITALIC, 16);
		jTextField.setFont(font);

		// �����
		JPasswordField jPasswordField = new JPasswordField("888888", 10);
		jPanel.add(jPasswordField);
		// ��ʾ�ַ�
		// jPasswordField.setEchoChar('*');
		jPasswordField.setEchoChar('��');
		// ���������ֵ
		String pass = String.valueOf(jPasswordField.getPassword());
		System.out.println(pass);

		// �ı���:�����ı������
		JTextArea jTextArea = new JTextArea("�����ı���\n����\n�Է�ȥ", 10, 20);
		// �Զ�����
		jTextArea.setLineWrap(true);
		// ��ʾ����Ч�����������
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jPanel.add(jScrollPane);

		// ��ѡ��ť
		JRadioButton jRadioButtonMan = new JRadioButton("��");
		jRadioButtonMan.setSelected(true);// Ĭ��ѡ��
		JRadioButton jRadioButtonWoMan = new JRadioButton("Ů");
		// ���û���Ч�� ButtonGroup���:���ö���������Ч��
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButtonMan);
		buttonGroup.add(jRadioButtonWoMan);
		JPanel panelSex = new JPanel();
		panelSex.add(new JLabel("�Ա�:"));
		panelSex.add(jRadioButtonMan);
		panelSex.add(jRadioButtonWoMan);
		//r,g,b
//		Color color = new Color(255, 0, 0);
		Color color = new Color(255, 200, 200);
		panelSex.setBackground(color);
		jPanel.add(panelSex);

		// ��ѡ��
		JCheckBox jCheckBox = new JCheckBox("ͬ�ⱾЭ��");
		jPanel.add(jCheckBox);
		
		//�����б��
		JComboBox jComboBox = new JComboBox(new String[]{"����","����","��ѧ"});
		//���ÿ��Ա༭
		jComboBox.setEditable(true);
		jComboBox.setPreferredSize(new Dimension(150, 22));
		jComboBox.setSelectedIndex(1);
		
		String item = jComboBox.getSelectedItem().toString();
		System.out.println("item="+item);
		jPanel.add(jComboBox);
		
		//�߿�
		//����
		Border borderLine = BorderFactory.createLineBorder(Color.blue);
		Border borderTitle = BorderFactory.createTitledBorder("ѡ���Ա�");
		//б�߱߿�
		Border borderLoweredBevel = BorderFactory.createLoweredBevelBorder();
		Border borderRaiseBevel = BorderFactory.createRaisedBevelBorder();
		Border borderBevel = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		//�ձ߿�
		Border borderEmpty1 = BorderFactory.createEmptyBorder();
		//top,left,bottom,right
		Border borderEmpty = BorderFactory.createEmptyBorder(50,10,10,10);
		//��ϱ߿�
		Border borderComp = BorderFactory.createCompoundBorder(borderEmpty, borderRaiseBevel);
		
		jPanel.setBorder(borderComp);
		panelSex.setBorder(borderBevel);
		
		
		

	}

	public static void main(String[] args) {
		new MyJFrame();
	}

}
