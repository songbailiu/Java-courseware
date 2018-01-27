package se1204.lesson17.zuoye;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestCalculator extends JFrame {
	public TestCalculator() {
		init();
		this.setTitle("������");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setVisible(true);

	}

	private void init() {
		// ���山��
		JPanel panelNorth = new JPanel();
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 25));
		panelNorth.add(textField);

		this.add(panelNorth, BorderLayout.NORTH);

		// �м����
		JPanel panelCenter = new JPanel(new BorderLayout());
		JPanel panelCenterNorth = new JPanel();
		JPanel panelCenterCenter = new JPanel(new GridLayout(4, 5, 1, 1));

		// �м䱱��
		JLabel label = new JLabel();
		label.setPreferredSize(new Dimension(20, 20));
		label.setBorder(BorderFactory.createLineBorder(Color.lightGray));
		JButton buttonBack = new JButton("BackSpace");
		JButton buttonCE = new JButton("CE");
		JButton buttonC = new JButton("C");
		panelCenterNorth.add(label);
		panelCenterNorth.add(buttonBack);
		panelCenterNorth.add(buttonCE);
		panelCenterNorth.add(buttonC);

		// �м��м�
		String[][] arr = new String[][] { { "7", "8", "9", "/", "sqrt" },
				{ "4", "5", "6", "*", "%" }, { "1", "2", "3", "-", "1/x" },
				{ "0", "+/-", ".", "+", "=" } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				JButton button = new JButton(arr[i][j]);
				button.setMargin(new Insets(0, 0, 0, 0));
				panelCenterCenter.add(button);

			}

		}

		panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
		panelCenter.add(panelCenterCenter);

		panelCenter.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		this.add(panelCenter);

	}

	public static void main(String[] args) {
		new TestCalculator();
	}

}
