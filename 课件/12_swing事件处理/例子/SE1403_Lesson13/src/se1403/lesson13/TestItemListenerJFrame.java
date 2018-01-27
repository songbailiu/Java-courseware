package se1403.lesson13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestItemListenerJFrame extends JFrame {
	JComboBox comboBox = new JComboBox(new String[] { "初中", "高中", "大学" });
	JTextField field = new JTextField(10);

	public TestItemListenerJFrame() {
		init();

		this.setTitle("Item事件");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void init() {

		comboBox.setPreferredSize(new Dimension(100, 25));

		JPanel panel = new JPanel();
		panel.add(comboBox);
		panel.add(field);
		this.add(panel);

		// ItemEvent
		comboBox.addItemListener(new ItemListener() {

			// 用户选中或者取消选项都会执行该方法
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("选项改变了........");
				// 获得状态值
				if (e.getStateChange() == ItemEvent.SELECTED) {
					// System.out.println("选中 ......");
					// 获得下拉框的选中的值
					String item = comboBox.getSelectedItem().toString();
					System.out.println("选中的值为:" + item);

					field.setText(item);

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("取消选中 ......");
				}

			}
		});

	}

	public static void main(String[] args) {
		new TestItemListenerJFrame();
	}

}
