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
		//图片
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		//图像
		Image image = imageIcon.getImage();
		//窗体设置图像
		this.setIconImage(image);
		this.setTitle("我的窗体");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		// 思路:控件 --》 面板 --》窗体
		// JPanel容器特性:
		// 需加入(顶层容器JFrame\JDialog)才可见
		// 默认可见;
		
		// JPanel与JPanel可相互嵌套;
		// 默认布局: FlowLayout;
		//从上到下，从左到右，居中显示组件，当一行放不下后，自动换行
		//调用组件的getPreferredSize()构建大小
		//流式布局上面的组件通过setPreferredSize设置宽与高有效

		JPanel jPanel = new JPanel();
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		jPanel.setLayout(flowLayout);
		// jPanel.setBackground(Color.white);
		this.add(jPanel);

		// SWing按钮
		JButton jButton = new JButton("按钮");
		//是否启用
		jButton.setEnabled(false);
		jButton.setForeground(Color.GREEN);
		jPanel.add(jButton);
		// awt的控件与Swing的控件不要混合使用
		// Button button = new Button("AWT按钮");
		// jPanel.add(button);

		// 标签:文字或者图片
		JLabel jLabel = new JLabel("标签:显示文字或者图片");
		//图片Icon接口ImageIcon实现类
		Icon icon = new ImageIcon("image/face0.gif");
		jLabel.setIcon(icon);
		jPanel.add(jLabel);

		// 文本框
		JTextField jTextField = new JTextField("单行文本框");
		//设置不可编辑
		jTextField.setEditable(false);
		jPanel.add(jTextField);
		System.out.println(jTextField.getText());
		// 流式布局：设置组件的宽与高
		jTextField.setPreferredSize(new Dimension(200, 30));
		// 字体
		Font font = new Font("隶书", Font.ITALIC, 16);
		jTextField.setFont(font);

		// 密码框
		JPasswordField jPasswordField = new JPasswordField("888888", 10);
		jPanel.add(jPasswordField);
		// 显示字符
		// jPasswordField.setEchoChar('*');
		jPasswordField.setEchoChar('●');
		// 获得密码框的值
		String pass = String.valueOf(jPasswordField.getPassword());
		System.out.println(pass);

		// 文本域:多行文本输入框
		JTextArea jTextArea = new JTextArea("多行文本框\n哈哈\n吃饭去", 10, 20);
		// 自动换行
		jTextArea.setLineWrap(true);
		// 显示滚动效果，滚动面板
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jPanel.add(jScrollPane);

		// 单选按钮
		JRadioButton jRadioButtonMan = new JRadioButton("男");
		jRadioButtonMan.setSelected(true);// 默认选中
		JRadioButton jRadioButtonWoMan = new JRadioButton("女");
		// 设置互斥效果 ButtonGroup组件:设置多个组件互斥效果
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButtonMan);
		buttonGroup.add(jRadioButtonWoMan);
		JPanel panelSex = new JPanel();
		panelSex.add(new JLabel("性别:"));
		panelSex.add(jRadioButtonMan);
		panelSex.add(jRadioButtonWoMan);
		//r,g,b
//		Color color = new Color(255, 0, 0);
		Color color = new Color(255, 200, 200);
		panelSex.setBackground(color);
		jPanel.add(panelSex);

		// 复选框
		JCheckBox jCheckBox = new JCheckBox("同意本协议");
		jPanel.add(jCheckBox);
		
		//下拉列表框
		JComboBox jComboBox = new JComboBox(new String[]{"初中","高中","大学"});
		//设置可以编辑
		jComboBox.setEditable(true);
		jComboBox.setPreferredSize(new Dimension(150, 22));
		jComboBox.setSelectedIndex(1);
		
		String item = jComboBox.getSelectedItem().toString();
		System.out.println("item="+item);
		jPanel.add(jComboBox);
		
		//边框
		//边线
		Border borderLine = BorderFactory.createLineBorder(Color.blue);
		Border borderTitle = BorderFactory.createTitledBorder("选择性别");
		//斜边边框
		Border borderLoweredBevel = BorderFactory.createLoweredBevelBorder();
		Border borderRaiseBevel = BorderFactory.createRaisedBevelBorder();
		Border borderBevel = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		//空边框
		Border borderEmpty1 = BorderFactory.createEmptyBorder();
		//top,left,bottom,right
		Border borderEmpty = BorderFactory.createEmptyBorder(50,10,10,10);
		//组合边框
		Border borderComp = BorderFactory.createCompoundBorder(borderEmpty, borderRaiseBevel);
		
		jPanel.setBorder(borderComp);
		panelSex.setBorder(borderBevel);
		
		
		

	}

	public static void main(String[] args) {
		new MyJFrame();
	}

}
