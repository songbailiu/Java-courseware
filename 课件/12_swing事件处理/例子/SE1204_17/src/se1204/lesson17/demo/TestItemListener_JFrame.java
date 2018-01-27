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
		this.setTitle("ItemListener示例");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {
		JPanel panel = new JPanel();
		final JTextField textField = new JTextField(8);
		final JComboBox comboBox = new JComboBox(new String[] { "初中", "高中", "大学" });
		//选项事件 针对的是选项组件
		comboBox.addItemListener(new ItemListener() {

			// 在用户已选定或取消选定某项时调用。
			public void itemStateChanged(ItemEvent e) {
				//System.out.println("选项事件改变...");
				//ItemEvent.getStateChange() 
		        //  返回状态更改的类型（已选定或已取消选定）。
				System.out.println(e.getStateChange());
				if(e.getStateChange()==1){
					
					//匿名内部类中使用局部 这个局部变量需要final
					String selectValue = comboBox.getSelectedItem().toString();
					
					System.out.println("选中:"+selectValue);
					textField.setText(selectValue);
					
					
				} else if(e.getStateChange()==2){
					//System.out.println("取消");
					
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
