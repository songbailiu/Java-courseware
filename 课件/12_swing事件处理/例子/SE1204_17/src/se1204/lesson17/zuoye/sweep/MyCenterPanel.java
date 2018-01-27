package se1204.lesson17.zuoye.sweep;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * 雷区面板
 * 
 * @author Administrator
 * 
 */
public class MyCenterPanel extends JPanel {
	private JLabel[][] labels = new JLabel[9][9];

	public MyCenterPanel() {
		this.setLayout(new GridLayout(9, 9));
		init();
	}

	private void init() {
		Icon iconBlank = new ImageIcon("image/blank.gif");
		for (int i = 0; i < labels.length; i++) {
			for (int j = 0; j < labels[i].length; j++) {
				labels[i][j] = new JLabel(iconBlank);
				this.add(labels[i][j]);
			}
		}
		
		Border borderEmpty = BorderFactory.createEmptyBorder(3, 5, 5, 5);
		Border borderLowerBevel = BorderFactory.createLoweredBevelBorder();
		Border borderCompound = BorderFactory.createCompoundBorder(borderEmpty, borderLowerBevel);
		this.setBorder(borderCompound);
//		设置背景颜色
		this.setBackground(Color.lightGray);

	}

}
