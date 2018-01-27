package lesson04;

public class Test01 {

	public static void main(String[] args) {
		//数组：是相同数据类型的有顺序的数据集合,是一种复合数据类型【引用数据类型】
		//可以通过数组变量名[整型下标] 来访问数组中的每一个元素
		
		//数组的初始化：1、静态初始化；2、动态初始化
		//1、静态初始化:声明与赋值必须是同一条语句
		int[] arr = {1,2,44,55,6};
		char[] arrChar = {'a','b','c'};
		boolean[] arrBoolean = {true,false,false};
		double[] arrDouble = {1,2,33.0};
		
		int[] arr2 ;
//		arr2 = {1,2,3,4,5};//error 不允许静态赋值语句与声明语句分开写
		
		
		//2、动态初始化:new 关键字创建一个数组对象，堆区分配一个新的内存区域来存放数据
		int[] arr3 = new int[2];//arr3 里面允许放2个int数据,默认值{0,0}
		arr3[0] = 99;//整型下标访问数组的元素,重新赋值
		arr3[1] = 110;
		
		//2.2 带指定值的动态初始化
		int[] arr4 = new int[]{33,22,44};//后面的[不能写数字]
		
		//数组的长度：数组的元素的个数  数组名.length
		int length =arr4.length;
		System.out.println("length="+length);
		System.out.println("arr4.length="+arr4.length);
		
		//允许通过整型的下标访问数组:0开始，到数组的长度-1
		System.out.println("arr4[0]="+arr4[0]);//33
		System.out.println("arr4[1]="+arr4[1]);//22
		System.out.println("arr4[2]="+arr4[2]);//44
		
		//error:java.lang.ArrayIndexOutOfBoundsException: 3
		//数组索引越界异常
//		System.out.println("arr4[3]="+arr4[3]);//error		
		
		//循环 迭代数组
//		System.out.println("==========循环 迭代数组=============");
//		for (int i = 0; i < arr4.length; i++) {
//			System.out.println("arr4["+i+"]="+arr4[i]);
//		}
		
		
		
		
		
		
		
		
		
	}

}
