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
	// 继承目的是重复利用JFrame的特性
	// 新增自己的成员

	public Test03MyFrame() {
		init();

		// 为窗体设置图标
		ImageIcon imageIcon = new ImageIcon("image/icon.gif");
		// 图像
		Image image = imageIcon.getImage();
		this.setIconImage(image);

		this.setTitle("边框Border效果");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		// 边框Border / BorderFactory 静态方法创建各式各样的边框
		// 边线边框
		Border lineBorder = BorderFactory.createLineBorder(Color.BLUE);
		//标题边框
		Border titleBorder =BorderFactory.createTitledBorder("选择性别");
		//空边框
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 5, 20);
		//沉下去斜边边框
		Border bevelBorder = BorderFactory.createLoweredBevelBorder();
		//组合边框
		Border compoundBorder = BorderFactory.createCompoundBorder(emptyBorder, bevelBorder);
		JPanel jPanel = new JPanel();
		//设置空边框
		jPanel.setBorder(compoundBorder);

		// 单行文本框
		JTextField jTextField = new JTextField("文本框", 8);
		// 设置一个边框
		jTextField.setBorder(lineBorder);
		jPanel.add(jTextField);

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
		panelSex.add(new JLabel("性别:"));
		panelSex.add(jRadioButtonMan);
		panelSex.add(jRadioButtonWoMan);
		//设置标题边框
		panelSex.setBorder(titleBorder);
		
		jPanel.add(panelSex);

		this.add(jPanel);

	}

	public static void main(String[] args) {
		new Test03MyFrame();
	}

}
