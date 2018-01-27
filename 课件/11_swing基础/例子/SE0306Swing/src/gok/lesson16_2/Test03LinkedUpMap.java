package gok.lesson16_2;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Test03LinkedUpMap {

	public static void main(String[] args) {
		// 20种 1..20 .png
		Image[] images = new Image[20];
		for (int i = 0; i < images.length; i++) {
			ImageIcon imageIcon = new ImageIcon("image/build1/" + (i + 1)
					+ ".png");
			images[i] = imageIcon.getImage();
		}

		// 1个数字 对应4个数组下标
		int[][] arr = new int[8][10];
		Random random = new Random();
		for (int i = 1; i <= 20; i++) {
			int count = 0;
			while (count < 4) {
				int x = random.nextInt(8);
				int y = random.nextInt(10);
				if (arr[x][y] == 0) {// 判断重复 x,y第一次生成 对应元素0
					arr[x][y] = i;
					count++;
				}
			}
		}

		System.out.println("随机分布棋盘后......");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		//数组下标i，j  与 绘制图像的x,y规律

	}

}
