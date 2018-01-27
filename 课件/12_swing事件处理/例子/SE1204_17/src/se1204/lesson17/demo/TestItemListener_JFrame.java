package se1204.lesson17.demo;

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

public class TestItemListener_JFrame extends JFrame {
	public TestItemListener_JFrame() {
		init();
		this.setTitle("ItemListenerʾ��");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		final JTextField textField = new JTextField(8);
		final JComboBox comboBox = new JComboBox(new String[] { "����", "����", "��ѧ" });
		//ѡ���¼� ��Ե���ѡ�����
		comboBox.addItemListener(new ItemListener() {

			// ���û���ѡ����ȡ��ѡ��ĳ��ʱ���á�
			public void itemStateChanged(ItemEvent e) {
				//System.out.println("ѡ���¼��ı�...");
				//ItemEvent.getStateChange() 
		        //  ����״̬���ĵ����ͣ���ѡ������ȡ��ѡ������
				System.out.println(e.getStateChange());
				if(e.getStateChange()==1){
					
					//�����ڲ�����ʹ�þֲ� ����ֲ�������Ҫfinal
					String selectValue = comboBox.getSelectedItem().toString();
					
					System.out.println("ѡ��:"+selectValue);
					textField.setText(selectValue);
					
					
				} else if(e.getStateChange()==2){
					//System.out.println("ȡ��");
					
				}
				
				

			}
		});

		panel.add(comboBox);
		panel.add(textField);

		this.add(panel);

	}

	public static void main(String[] args) {
		new TestItemListener_JFrame();
	}

}
