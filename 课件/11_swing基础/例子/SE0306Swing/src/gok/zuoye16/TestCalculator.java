package gok.zuoye16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class TestCalculator extends JFrame implements ActionListener {
	JTextField textField = new JTextField();
	double res = 0;
	Stack<String> nextFH = new Stack<String>();
	StringBuffer curChar = new StringBuffer();
	// +,-,*/ ���ż���
	List<String> listFH = new ArrayList<String>();
	String regexNum = "^[0-9\\.]$";
	boolean isCompute = false;

	public TestCalculator() {
		listFH.add("+");
		listFH.add("-");
		listFH.add("*");
		listFH.add("/");
		init();
		this.setTitle("������");
		this.setSize(new Dimension(250, 220));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.pack();
		this.setResizable(false);
		this.setVisible(true);

	}

	private void init() {
		// ���山��
		JPanel panelNorth = new JPanel();
		textField.setEditable(false);
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
		buttonBack.addActionListener(this);
		buttonCE.addActionListener(this);
		buttonC.addActionListener(this);

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
				button.addActionListener(this);
				panelCenterCenter.add(button);

			}

		}

		panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
		panelCenter.add(panelCenterCenter);

		panelCenter.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		this.add(panelCenter);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}

		new TestCalculator();
	}

	// �¼�����
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String text = button.getText();
		// System.out.println("text=" + text);
		if (listFH.contains(text)) {
			// ���� +-*/ ������
			if (nextFH.size() == 0) {
				nextFH.push(text);
				try {
					res = Double.parseDouble(curChar.toString());
				} catch (Exception e2) {
					
					textField.setText(curChar + "");
				}
				curChar.delete(0, curChar.length());
				
				return;
			}

			computeRes(text);
			textField.setText(res + "");
			curChar.delete(0, curChar.length());
			isCompute = true;

		} else if (text.matches(regexNum)) {
			// ���ֻ���.
			
			if(isCompute){
				curChar.delete(0, curChar.length());
			}
			System.out.println("curChar=" + curChar);
			
			if (".".equals(text)) {
				if (curChar.indexOf(".") == -1) {
					curChar.append(text);
				}
			} else {
				if ("0".equals(curChar.toString())) {
					curChar = new StringBuffer(text);
				} else {
					curChar.append(text);
				}
			}
			System.out.println("��curChar=" + curChar);

			textField.setText(curChar.toString());
			isCompute = false;
		} else if ("C".equals(text)) {
			// ������ݣ���ԭ����
			nextFH.clear();
			curChar = new StringBuffer();
			res = 0;
			textField.setText(curChar.toString());
			isCompute = false;
		} else if ("BackSpace".equals(text)) {
			// �˸��
			if (curChar.length() <= 0) {
				return;
			}
			curChar.delete(curChar.length() - 1, curChar.length());
			System.out.println(curChar);
			textField.setText(curChar.toString());
		} else if ("=".equals(text)) {
			// ��ʾ��� ��ȥ�Ƴ������
			isCompute = true;
			if (nextFH.size() == 0) {
				try {
					res = Double.parseDouble(curChar.toString());
				} catch (Exception e2) {
					curChar.append(0);
				}
				textField.setText(res + "");

				return;
			}
			computeRes("=");
			textField.setText(res + "");
		} else {
			// ������������

		}

	}

	/**
	 * ����������
	 * 
	 * @param text
	 */
	private void computeRes(String text) {

		if ("=".equals(text)) {
			String fuhao = nextFH.peek();
			System.out.println("fuhao=" + fuhao);
			double d = 0;
			try {
				d = Double.parseDouble(curChar.toString());
			} catch (Exception e) {
				d = res;
			}

			if ("+".equals(fuhao)) {
				res += d;
			} else if ("-".equals(fuhao)) {
				res -= d;
			} else if ("*".equals(fuhao)) {
				res *= d;
			} else if ("/".equals(fuhao)) {
				res /= d;
			}
		} else {
			String fuhao = nextFH.pop();
			if (isCompute == false) {
				double d = 0;
				try {
					d = Double.parseDouble(curChar.toString());
				} catch (Exception e) {
					d = 0;
				}
				if ("+".equals(fuhao)) {
					res += d;
				} else if ("-".equals(fuhao)) {
					res -= d;
				} else if ("*".equals(fuhao)) {
					res *= d;
				} else if ("/".equals(fuhao)) {
					res /= d;
				}
			}

			nextFH.push(text);
			curChar.delete(0, curChar.length());
		}

	}

}
