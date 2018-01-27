package gok.lesson17;

import java.awt.Dimension;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test02ItemListenerFrame extends JFrame {
	// ItemListener 选项改变事件
	// 两个或者多个下拉框的级联业务

	JTextField textField = new JTextField(8);

	public Test02ItemListenerFrame() {
		init();
		this.setTitle("ItemListener");
		this.setSize(new Dimension(400, 300));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		String[] items = new String[] { "初中", "高中", "大学" };
		final JComboBox<String> comboBox = new JComboBox<String>(items);
		panel.add(comboBox);

		panel.add(textField);
		this.add(panel);

		// 注册监听
		comboBox.addItemListener(new ItemListener() {

			// 在用户已选定或取消选定某项时调用。
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("选项改变了");
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("选中...");
					// 获得当前选中项
					// Object item = e.getItem();
					// 根据组件 获得选中的值
					Object item = comboBox.getSelectedItem();

					System.out.println("item=" + item);
					textField.setText(item.toString());

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("取消选中...");
				}

			}
		});

	}

	public static void main(String[] args) {
		new Test02ItemListenerFrame();
	}

}
