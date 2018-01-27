package lesson04;

public class Test04 {

	public static void main(String[] args) {
		// 二维数组：其中每一个元素都是一维数组
		// 初始化：静态与动态初始化
		int[][] arr1 = { { 11, 22 }, { 33, 44, 55 } };
		System.out.println("arr1=" + arr1);// [[I@659e0bfd
		// 2、动态初始化:
		// 2.1
		int[][] arr2 = new int[2][3];
		// 2.2
		// 只创建了 二维数组，里面每一个一维数组没有创建 ，是null
		int[][] arr3 = new int[2][];// {null,null}
		arr3[0] = new int[2];
		arr3[1] = new int[4];
		// 2.3 带指定值的动态初始化
		int[][] arr4 = new int[][] { { 1 }, { 1, 1 }, { 1, 2, 2, 1 } };

		// 重点强调 2.2 写法
		int[][] arr = new int[2][];// {null,null}
		System.out.println("arr=" + arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = new int[i + 1];
			System.out.println("2----arr[i]=" + arr[i]);
			// 总结:arr[0] = new int[1];//{0}
			// arr[1] = new int[2];//{0,0}
		}

		System.out.println("arr[0][0]=" + arr[0][0]);
		System.out.println("arr[1][0]=" + arr[1][0]);
		System.out.println("arr[1][1]=" + arr[1][1]);

		// 带指定值的动态初始
		int[][] arr5 = new int[][] { { 11, 22 }, { 33, 44, 55 } };
		// arr5 是二维数组的时候,arr5.length 表示当前二维数组的长度【二维数组中的一维数组的个数】
		System.out.println("arr5.length=" + arr5.length);// 2
		// arr5二维数组中的第一个一维数组的长度
		System.out.println("arr5[0].length=" + arr5[0].length);
		// arr5二维数组中的第2个一维数组的长度
		System.out.println("arr5[1].length=" + arr5[1].length);
		// 二维数组的第1个一维数组的第1个元素
		System.out.println("arr5[0][0]=" + arr5[0][0]);
		// 第1个一维数组的第2个元素
		System.out.println("arr5[0][1]=" + arr5[0][1]);
		// 二维数组的第2个一维数组的第一个元素
		System.out.println("arr5[1][0]=" + arr5[1][0]);
		// 第2个一维数组的第2个元素
		System.out.println("arr5[1][1]=" + arr5[1][1]);
		// 第2个一维数组的第3个元素
		System.out.println("arr5[1][2]=" + arr5[1][2]);

		// 循环迭代
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print("arr5[" + i + "][" + j + "]=" + arr5[i][j]
						+ ",");
			}
			System.out.println();
		}

	}

}
