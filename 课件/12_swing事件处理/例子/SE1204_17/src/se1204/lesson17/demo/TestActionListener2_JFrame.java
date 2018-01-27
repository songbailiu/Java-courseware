package se1204.lesson17.demo;

import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestActionListener2_JFrame extends JFrame {
	// 按钮和文本框属于窗体的属性

	JButton button = new JButton("按钮");

	JButton buttonCancel = new JButton("取消");

	JButton buttonClose = new JButton("关闭窗口");

	JTextField textField = new JTextField(8);

	public TestActionListener2_JFrame() {
		init();
		this.setTitle("ActionListener示例");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {

		// //文本框

		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(textField);
		panel.add(buttonCancel);
		panel.add(buttonClose);

		ButtonActionListener listener = new ButtonActionListener(this);
		button.addActionListener(listener);
		buttonCancel.addActionListener(listener);
		buttonClose.addActionListener(listener);

		this.add(panel);

	}

	// 写类实现具体事件类型的监听接口
	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// 处理事件的回调方法
			System.out.println("action事件触发啦....");

			// 通过事件获得事件源
			Object source = e.getSource();
			if (source instanceof JButton) {
				JButton button = (JButton) source;
				String text = button.getText();
				System.out.println("text=" + text);
				if ("按钮".equals(text)) {
					button.setText("哈哈");

				} else {
					button.setText("按钮");

				}

				// button.setText("哈哈");

			}

		}

	}

	public static void main(String[] args) {
		new TestActionListener2_JFrame();
	}

}
