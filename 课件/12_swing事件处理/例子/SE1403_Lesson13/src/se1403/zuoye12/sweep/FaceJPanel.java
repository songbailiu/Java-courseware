package se1403.zuoye12.sweep;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FaceJPanel extends JPanel {
	
	Icon iconD0 = new ImageIcon("image/d0.gif");
	Icon iconD1 = new ImageIcon("image/d1.gif");
	Icon iconSmile = new ImageIcon("image/face0.gif");
	JLabel labelCountG = new JLabel(iconD0);
	JLabel labelCountS = new JLabel(iconD1);
	JLabel labelCountB = new JLabel(iconD0);

	JLabel labelFace = new JLabel(iconSmile);

	// 显示时间
	JLabel labelTimeG = new JLabel(iconD0);
	JLabel labelTimeS = new JLabel(iconD0);
	JLabel labelTimeB = new JLabel(iconD0);

	public FaceJPanel() {
		init();

	}

	private void init() {
		BoxLayout boxLayout = new BoxLayout(this, BoxLayout.LINE_AXIS);
		this.setLayout(boxLayout);

		this.add(labelCountB);
		this.add(labelCountS);
		this.add(labelCountG);
		this.add(Box.createHorizontalGlue());
		this.add(labelFace);
		this.add(Box.createHorizontalGlue());
		this.add(labelTimeB);
		this.add(labelTimeS);

		this.add(labelTimeG);
		
		//边框
		Border borderBelvel = BorderFactory.createLoweredBevelBorder();
		Border borderEmpty = BorderFactory.createEmptyBorder(5, 5, 3, 5);
		Border borderCom = BorderFactory.createCompoundBorder(borderEmpty, borderBelvel);
		this.setBorder(borderCom);
		
		//设置背景颜色
		this.setBackground(Color.lightGray);
	}

}
