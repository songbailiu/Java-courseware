package gok.lesson16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

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

public class Test06GridLayout extends JFrame {
	// 网格布局GridLayout 按照指定的行与列把容器进行分割，每一格子平均获得空间
	// 排列的方式：从上到下，从左到右

	public Test06GridLayout() {
		init();

		this.setTitle("网格布局");
		this.setSize(new Dimension(300, 250));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//自动调整大小
		this.pack();
	}

	private void init() {
		GridLayout gridLayout = new GridLayout(9, 9);
		JPanel panel = new JPanel();
		panel.setLayout(gridLayout);

		// 创建图标
		Icon iconBlank = new ImageIcon("image/blank.gif");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// JButton button = new JButton(i + "-" + j);
				// button.setMargin(new Insets(0, 0, 0, 0));
				// panel.add(button);

				JLabel label = new JLabel(iconBlank);
				panel.add(label);
			}
		}

		this.add(panel);

	}

	public static void main(String[] args) {
		new Test06GridLayout();
	}

}
