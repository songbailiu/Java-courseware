package se1403.lesson12.layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestGridLayout extends JFrame {
	//���񲼾�GridLayout:���ϵ��£������ң�ÿһ����λƽ������
	
	public TestGridLayout() {
		init();
		this.setTitle("���񲼾�");
		this.setSize(new Dimension(500, 450));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�Զ�������С
		this.pack();
		this.setVisible(true);
		
	}
	
	private void init(){
		JPanel panel = new JPanel();
		GridLayout gridLayout = new GridLayout(9, 10);
		panel.setLayout(gridLayout);
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=10; j++) {
//				JButton button = new JButton("��ť"+i+","+j);
//				//�������ֵ��߽�ľ���
//				button.setMargin(new Insets(0, 0, 0, 0));
//				panel.add(button);
				JLabel label = new JLabel(new ImageIcon("image/blank.gif"));
				panel.add(label);
			}
		}
		this.add(panel);
			
		
		
	}
	
	public static void main(String[] args) {
		new TestGridLayout();
	}

}
