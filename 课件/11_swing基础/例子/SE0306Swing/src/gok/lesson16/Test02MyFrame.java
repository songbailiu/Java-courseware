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
	// 继承目的是重复利用JFrame的特性
	// 新增自己的成员

	public Test02MyFrame() {
		init();
		
		//为窗体设置图标
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		//图像
		Image image = imageIcon.getImage();
		this.setIconImage(image);
		
		
		this.setTitle("我的窗口");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		// JPanel容器特性:
		// 需加入(顶层容器JFrame/JDialog)才可见
		// 默认可见;
		// 默认布局: FlowLayout;
		// JPanel与JPanel可相互嵌套;

		// 流式布局FLowLayout
		// 调用组件的最佳尺寸的方法构建大小getPreferredSize()，可以调用组件的setPreferredSize(w,h)
		// 从上到下，从左到右，水平居中方式展示组件
		// 一行不够，自动换到第二行排列

		JPanel jPanel = new JPanel();
		// jPanel.setBackground(Color.blue);

		// 组件 --》 中间面板 --》 窗口
		// 按钮
		JButton button = new JButton("按钮");
		JButton button2 = new JButton("JButton按钮");
		jPanel.add(button);
		jPanel.add(button2);
		// 设置按钮的最佳尺寸的方法
		button.setPreferredSize(new Dimension(100, 30));
		// 设置禁用
		button.setEnabled(false);

		// 设置前景色
		// 构造自己的颜色
		// r,g,b 0-255
		Color color = new Color(50, 151, 200);
		button2.setForeground(color);

		// 单行文本框
		JTextField jTextField = new JTextField("文本框", 8);
		// jTextField.setPreferredSize(new Dimension(120, 30));
		jPanel.add(jTextField);

		// 标签：显示文字或者图片
		JLabel jLabel = new JLabel("标签:用户名:");
		jPanel.add(jLabel);

		// 面板可以嵌套
		JPanel panelPass = new JPanel();
		panelPass.add(new JLabel("用户密码:"));
		JPasswordField jPasswordField = new JPasswordField("888888", 10);
		// Font font = new Font("宋体", Font.BOLD, 16);
		// jPasswordField.setFont(font);
		// 设置显示字符
		// jPasswordField.setEchoChar('*');
		jPasswordField.setEchoChar('●');
		panelPass.add(jPasswordField);
		jPanel.add(panelPass);

		// 获得密码框上面的文本值 char[] --> String
		String pass = String.valueOf(jPasswordField.getPassword());
		System.out.println("pass=" + pass);

		// 多行文本框
		JTextArea jTextArea = new JTextArea("哈哈\n我可以输入多行值\n嘿嘿", 10, 20);
		// 设置文本域自动换行
		jTextArea.setLineWrap(true);
		// 显示滚动 必须把组件添加到滚动面板 滚动面板添加大面板中
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		jPanel.add(jScrollPane);

		// 单选按钮
		JRadioButton jRadioButtonMan = new JRadioButton("男");
		// 设置选中
		jRadioButtonMan.setSelected(true);
		JRadioButton jRadioButtonWoMan = new JRadioButton("女");
		// 实现单选效果 把需要互斥的组件添加到 按钮组
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButtonMan);
		buttonGroup.add(jRadioButtonWoMan);
		JPanel panelSex = new JPanel();
		panelSex.add(jRadioButtonMan);
		panelSex.add(jRadioButtonWoMan);
		jPanel.add(panelSex);

		// 复选框
		JCheckBox jCheckBox = new JCheckBox("同意本协议");
		// 设置选中
		jCheckBox.setSelected(true);
		jPanel.add(jCheckBox);

		// 下拉列表框
		String[] items = { "小学", "初中", "高中" };
		JComboBox<String> jComboBox = new JComboBox<String>(items);
		// 设置可以编辑
		jComboBox.setEditable(true);
		jPanel.add(jComboBox);

		// 设置图标
		// 路径 相对于从工程名开始
		Icon icon = new ImageIcon("image/face0.gif");
		JLabel jLabel2 = new JLabel(icon);
		jPanel.add(jLabel2);
		this.add(jPanel);

	}

	public static void main(String[] args) {
		new Test02MyFrame();
	}

}
