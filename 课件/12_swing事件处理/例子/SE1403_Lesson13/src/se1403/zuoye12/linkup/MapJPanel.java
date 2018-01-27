package se1403.zuoye12.linkup;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 棋盘面板
 * 
 * @author admin
 * 
 */
public class MapJPanel extends JPanel {
	Image imageBackground = new ImageIcon("image/bg/bg5.jpg").getImage();
	Image[] chessImages = new Image[20];// 0-->1
	{
		for (int i = 0; i < chessImages.length; i++) {
			chessImages[i] = new ImageIcon("image/build1/" + (i + 1) + ".png")
					.getImage();
		}
	}
	// 棋盘数组
	Chess[][] map = new Chess[8][10];

	public MapJPanel() {
		initMap();
	}

	public void initMap() {
		// // 连连看游戏的分布棋盘的算法8*10 数组
		// 20种图片 每一种图片对应数组中的4位置(不重复)
		// int[][] arr = new int[8][10];
		// 判断重复条件 arr[i][j] == 0
		Random random = new Random();
		for (int i = 0; i < chessImages.length; i++) {
			int count = 0;
			while (count < 4) {
				int x = random.nextInt(8);
				int y = random.nextInt(10);
				if (map[x][y] == null) {
					map[x][y] = new Chess(i + 1);
					count++;
				}
			}
		}

		// 打印棋子对应的数字
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j].getStatus() + "\t");
			}
			System.out.println();
		}

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		// 棋盘绘制到界面上
		g.drawImage(imageBackground, 0, 0, this);

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				g.drawImage(chessImages[map[i][j].getStatus() - 1], j * 48
						+ Param.marginWidth, i * 48 + Param.marginHeight, this);
				g.drawRect(j * 48 + Param.marginWidth, i * 48
						+ Param.marginHeight, 48, 48);
			}
		}

	}

}
