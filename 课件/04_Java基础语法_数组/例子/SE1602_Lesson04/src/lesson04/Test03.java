package lesson04;


/**
 * 分析数据内存结构
 * @author admin
 *
 */
public class Test03 {

	public static void main(String[] args) {
		// 数组在java中被当做对象处理，是复合数据类型，考虑内存引用，地址
		// 默认值 null 对象为空，对象不存在,不占有内存空间
		// int[] arr = null;
		// //java.lang.NullPointerException 空指针异常
		// //对象为null，被访问了其中的数据时 ，出现异常，错误
		// //System.out.println("arr.length=" + arr.length);
		// // System.out.println(arr[0]);//NullPointerException
		//
		// //当我们为数组分配内存空间 就是创建出来后,就不会出现空指针异常
		// System.out.println("arr="+arr);
		// arr = new int[2];
		// //[I@659e0bfd 逻辑地址 java 描述对象的逻辑字符串
		// System.out.println("new之后 arr="+arr);
		// char[] arrChar = new char[2];
		// //[C@2a139a55
		// System.out.println("new之后 arrChar="+arrChar);
		// //[数据类型@哈希值的十六进制的字符串描述

		// 重点探讨 对象的内存 分布
		int[] arr1 = new int[2];// {0,0}
		int[] arr2 = new int[2];// {0,0}
		System.out.println("arr1=" + arr1);// [I@659e0bfd
		System.out.println("arr2=" + arr2);// [I@2a139a55
		System.out.println(arr1 == arr2);// false
		// arr1 与arr2 是在内存中是不同的对象,指向了不同的内存区域，所以不相等
		// 所以改变arr2 中的数据不会影响arr1
		arr2[0] = 99;
		System.out.println("arr1[0]=" + arr1[0]);// 0
		System.out.println("arr2[0]=" + arr2[0]);// 99

		// 如何让arr1 与 arr2 对象== 返回 true?
		arr1 = arr2;//arr1 指向arr2 的物理内存空间
		System.out.println("arr1=" + arr1);
		System.out.println("arr2=" + arr2);
		System.out.println(arr1 == arr2);// true

	}

}
