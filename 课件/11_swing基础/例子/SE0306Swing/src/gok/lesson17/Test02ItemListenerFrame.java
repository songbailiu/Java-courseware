package gok.lesson17;

import java.awt.Dimension;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test02ItemListenerFrame extends JFrame {
	// ItemListener ѡ��ı��¼�
	// �������߶��������ļ���ҵ��

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
		String[] items = new String[] { "����", "����", "��ѧ" };
		final JComboBox<String> comboBox = new JComboBox<String>(items);
		panel.add(comboBox);

		panel.add(textField);
		this.add(panel);

		// ע�����
		comboBox.addItemListener(new ItemListener() {

			// ���û���ѡ����ȡ��ѡ��ĳ��ʱ���á�
			@Override
			public void itemStateChanged(ItemEvent e) {
				// System.out.println("ѡ��ı���");
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("ѡ��...");
					// ��õ�ǰѡ����
					// Object item = e.getItem();
					// ������� ���ѡ�е�ֵ
					Object item = comboBox.getSelectedItem();

					System.out.println("item=" + item);
					textField.setText(item.toString());

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					System.out.println("ȡ��ѡ��...");
				}

			}
		});

	}

	public static void main(String[] args) {
		new Test02ItemListenerFrame();
	}

}
