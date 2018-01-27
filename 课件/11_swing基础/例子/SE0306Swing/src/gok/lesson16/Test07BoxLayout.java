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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test07BoxLayout extends JFrame {
	//盒式布局 BoxLayout 一行或者一列进行排列
	//对应容器是Box  但是Box不能设置背景颜色
	
	
	

	public Test07BoxLayout() {
		init();

		this.setTitle("盒式布局");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//自动调整大小
//		this.pack();
	}

	private void init() {
		//窗体的中间   JPanel 指定盒式布局
		JPanel panel = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxLayout);
		for (int i = 1; i <=8; i++) {
			JButton button = new JButton("按钮"+i);
			panel.add(button);
		}
		
		this.add(panel);
		
		
		//窗体北边  加入一个box
		Box box = Box.createHorizontalBox();
		Icon iconD0= new ImageIcon("image/d0.gif");
		Icon iconFace0= new ImageIcon("image/face0.gif");
		
		//7个标签
		JLabel labelCount1 = new JLabel(iconD0);
		JLabel labelCount2 = new JLabel(iconD0);
		JLabel labelCount3 = new JLabel(iconD0);
		
		JLabel labelFace = new JLabel(iconFace0);
		
		JLabel labelTime1 = new JLabel(iconD0);
		JLabel labelTime2 = new JLabel(iconD0);
		JLabel labelTime3 = new JLabel(iconD0);
		
		box.add(Box.createHorizontalStrut(10));
		box.add(labelCount1);
		box.add(labelCount2);
		box.add(labelCount3);
		//横向的弹簧
		box.add(Box.createHorizontalGlue());
		box.add(labelFace);
		//横向的弹簧
		box.add(Box.createHorizontalGlue());
		box.add(labelTime1);
		box.add(labelTime2);
		box.add(labelTime3);
		box.add(Box.createHorizontalStrut(10));
		
		//加入到窗体的北边
		this.add(box,BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new Test07BoxLayout();
	}

}
