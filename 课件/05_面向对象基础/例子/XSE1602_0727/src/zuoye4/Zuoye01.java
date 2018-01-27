package zuoye4;

import java.util.Arrays;

public class Zuoye01 {

	public static void main(String[] args) {
		//定义一个一维数组, 并输出一维数组中所有元素值,并查找最大的元素值
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
		
		//实现数组的排序 java.util.Arrays 工具类
		Arrays.sort(arr);
		//查看数组中的元素
		System.out.println(Arrays.toString(arr));
		
		
	}

}
