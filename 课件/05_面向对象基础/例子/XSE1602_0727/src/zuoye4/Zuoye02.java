package zuoye4;

import java.util.Scanner;

public class Zuoye02 {

	public static void main(String[] args) {
		// ������� �㷨   j==0 || i==j   1
		//���������: arr[i][j] = arr[i-1][j-1]+arr[i-1][j] 
		// 1
		// 1 1
		// 1 2 1
		// 1 3 3 1
		// 1 4 6 4 1
		// 1 5 10 10 5 1
//		int[][] arr = new int[][]{{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1},{1,5,10,10,5,1}};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		//��������ĳ���Ϊ6
		System.out.println("����������:");
		int n = new Scanner(System.in).nextInt();
		int[][] arr = new int[n][];//{null,null,null,null,null,null}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) {
				if(j==0 || i==j){
					arr[i][j] = 1;
				}else{
					//������������Ͻ� + �Ϸ���Ԫ��֮��
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j] ;
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}	
		
	}

}
