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
	JComboBox comboBox = new JComboBox(new String[] { "����", "����", "��ѧ" });
	JTextField field = new JTextField(10);

	public TestItemListenerJFrame() {
		init();

		this.setTitle("Item�¼�");
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

			// �û�ѡ�л���ȡ��ѡ���ִ�и÷���
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("ѡ��ı���........");
				// ���״ֵ̬
				if (e.getStateChange() == ItemEvent.SELECTED) {
					// System.out.println("ѡ�� ......");
					// ����������ѡ�е�ֵ
					String item = comboBox.getSelectedItem().toString();
					System.out.println("ѡ�е�ֵΪ:" + item);

					field.setText(item);

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("ȡ��ѡ�� ......");
				}

			}
		});

	}

	public static void main(String[] args) {
		new TestItemListenerJFrame();
	}

}
