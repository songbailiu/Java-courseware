package se1403.zuoye12.sweep;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BombPanel extends JPanel {
	Icon iconBlank = new ImageIcon("image/blank.gif");
	JLabel[][] lables = new JLabel[9][9];

	public BombPanel() {
		this.setLayout(new GridLayout(9, 9));
		init();
	}

	private void init() {
		for (int i = 0; i < lables.length; i++) {
			for (int j = 0; j < lables[i].length; j++) {
				lables[i][j] = new JLabel(iconBlank);
				this.add(lables[i][j]);
			}
		}
		
		
		//±ß¿ò
		Border borderBelvel = BorderFactory.createLoweredBevelBorder();
		Border borderEmpty = BorderFactory.createEmptyBorder(2, 5, 5, 5);
		Border borderCom = BorderFactory.createCompoundBorder(borderEmpty, borderBelvel);
		this.setBorder(borderCom);
		
		//ÉèÖÃ±³¾°ÑÕÉ«
		this.setBackground(Color.lightGray);

	}

}
