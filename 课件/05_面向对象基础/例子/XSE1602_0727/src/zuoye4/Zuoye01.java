package zuoye4;

import java.util.Arrays;

public class Zuoye01 {

	public static void main(String[] args) {
		//����һ��һά����, �����һά����������Ԫ��ֵ,����������Ԫ��ֵ
		//6,3,2,6,3,8,0,67,3,2,43,54,65,76,45,87,89,76,54,23,54,43,542,45
		int[] arr = {6,3,2,6,3,8,0,67,3,2,43,54,65,76,45,87,89,76,54,23,54,43,542,45};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+",");
			if(max <= arr[i]){
				max = arr[i];
			}
		}
		
		System.out.println("\n max="+max);
		
		//ʵ����������� java.util.Arrays ������
		Arrays.sort(arr);
		//�鿴�����е�Ԫ��
		System.out.println(Arrays.toString(arr));
		
		
	}

}
