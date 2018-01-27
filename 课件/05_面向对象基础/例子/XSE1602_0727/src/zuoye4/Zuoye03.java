package zuoye4;

public class Zuoye03 {

	public static void main(String[] args) {
		// 有一个二维数组，找出该二维数组的鞍点，
		// 即该位置上的元素在该行上最大，在该列上最小。也可能没有鞍点
		// 21,32,31,32,65,76,45
		// 1, 4, 2, 8, 5, 3, 1
		// 54,23,87,54,34,23,54
		// 98,23,3,54,24,54,98
		// 19,32,34,65,34,432,2
		int[][] arr = { { 21, 32, 31, 32, 65, 76, 45 },
				{ 1, 4, 2, 8, 5, 3, 1 }, { 54, 23, 87, 54, 34, 23, 54 },
				{ 98, 23, 3, 54, 24, 54, 98 }, { 19, 32, 34, 65, 34, 432, 2 } };
		// 行上最大 记录第二维的下标 col
		// 列上最小 0,5; 1,5; 2,5; 3,5; 4,5
		int max = 0, min = 0, col = 0;
		for (int i = 0; i < arr.length; i++) {
			max = arr[i][0];//每一行的第一个元素
			for (int j = 0; j < arr[i].length; j++) {
				if(max<=arr[i][j]){
					max = arr[i][j];
					col = j;//记录列上的下标
				}
			}
			//找最小值
			min = arr[0][col];//取每一列的第一个值
			for (int k = 0; k < arr.length; k++) {
				if(min>=arr[k][col]){
					min = arr[k][col];
				}
			}			
			if(max==min){
				System.out.println("找到鞍点:"+max);
			}			
		}

	}

}
