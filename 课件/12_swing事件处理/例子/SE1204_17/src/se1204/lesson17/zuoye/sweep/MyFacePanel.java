package se1204.lesson17.zuoye.sweep;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * 表情面板
 * @author Administrator
 *
 */
public class MyFacePanel extends JPanel {
	Icon icon0 = new ImageIcon("image/d0.gif");

	Icon icon1 = new ImageIcon("image/d1.gif");

	Icon iconFace0 = new ImageIcon("image/face0.gif");

	private JLabel labelBombB = new JLabel(icon0);// 0

	private JLabel labelBombS = new JLabel(icon1);// 1

	private JLabel labelBombG = new JLabel(icon0);// 0

	private JLabel faceLabel = new JLabel(iconFace0);

	private JLabel labelTimeB = new JLabel(icon0);// 0

	private JLabel labelTimeS = new JLabel(icon0);// 0

	private JLabel labelTimeG = new JLabel(icon0);// 0

	public MyFacePanel() {
		this.setLayout(new BorderLayout());
		init();
		
	}

	private void init() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		panel.add(labelBombB);
		panel.add(labelBombS);
		panel.add(labelBombG);

		panel.add(Box.createHorizontalGlue());
		panel.add(faceLabel);
		panel.add(Box.createHorizontalGlue());
		panel.add(labelTimeB);
		panel.add(labelTimeS);
		panel.add(labelTimeG);
		panel.setBackground(Color.lightGray);
		
		panel.setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
		
		this.add(panel);
		
		//设置边框
		Border borderEmpty = BorderFactory.createEmptyBorder(5, 5, 3, 5);
		Border borderLowerBevel = BorderFactory.createLoweredBevelBorder();
		Border borderCompound = BorderFactory.createCompoundBorder(borderEmpty, borderLowerBevel);
		
		
		this.setBorder(borderCompound);
		//设置背景颜色
		this.setBackground(Color.lightGray);
	}

}
