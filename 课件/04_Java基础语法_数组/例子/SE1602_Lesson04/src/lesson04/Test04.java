package lesson04;

public class Test04 {

	public static void main(String[] args) {
		// ��ά���飺����ÿһ��Ԫ�ض���һά����
		// ��ʼ������̬�붯̬��ʼ��
		int[][] arr1 = { { 11, 22 }, { 33, 44, 55 } };
		System.out.println("arr1=" + arr1);// [[I@659e0bfd
		// 2����̬��ʼ��:
		// 2.1
		int[][] arr2 = new int[2][3];
		// 2.2
		// ֻ������ ��ά���飬����ÿһ��һά����û�д��� ����null
		int[][] arr3 = new int[2][];// {null,null}
		arr3[0] = new int[2];
		arr3[1] = new int[4];
		// 2.3 ��ָ��ֵ�Ķ�̬��ʼ��
		int[][] arr4 = new int[][] { { 1 }, { 1, 1 }, { 1, 2, 2, 1 } };

		// �ص�ǿ�� 2.2 д��
		int[][] arr = new int[2][];// {null,null}
		System.out.println("arr=" + arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = new int[i + 1];
			System.out.println("2----arr[i]=" + arr[i]);
			// �ܽ�:arr[0] = new int[1];//{0}
			// arr[1] = new int[2];//{0,0}
		}

		System.out.println("arr[0][0]=" + arr[0][0]);
		System.out.println("arr[1][0]=" + arr[1][0]);
		System.out.println("arr[1][1]=" + arr[1][1]);

		// ��ָ��ֵ�Ķ�̬��ʼ
		int[][] arr5 = new int[][] { { 11, 22 }, { 33, 44, 55 } };
		// arr5 �Ƕ�ά�����ʱ��,arr5.length ��ʾ��ǰ��ά����ĳ��ȡ���ά�����е�һά����ĸ�����
		System.out.println("arr5.length=" + arr5.length);// 2
		// arr5��ά�����еĵ�һ��һά����ĳ���
		System.out.println("arr5[0].length=" + arr5[0].length);
		// arr5��ά�����еĵ�2��һά����ĳ���
		System.out.println("arr5[1].length=" + arr5[1].length);
		// ��ά����ĵ�1��һά����ĵ�1��Ԫ��
		System.out.println("arr5[0][0]=" + arr5[0][0]);
		// ��1��һά����ĵ�2��Ԫ��
		System.out.println("arr5[0][1]=" + arr5[0][1]);
		// ��ά����ĵ�2��һά����ĵ�һ��Ԫ��
		System.out.println("arr5[1][0]=" + arr5[1][0]);
		// ��2��һά����ĵ�2��Ԫ��
		System.out.println("arr5[1][1]=" + arr5[1][1]);
		// ��2��һά����ĵ�3��Ԫ��
		System.out.println("arr5[1][2]=" + arr5[1][2]);

		// ѭ������
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print("arr5[" + i + "][" + j + "]=" + arr5[i][j]
						+ ",");
			}
			System.out.println();
		}

	}

}
