package lesson04;

public class Test05 {

	public static void main(String[] args) {
		// 创建数组
		int[] arr = new int[2];
		//了解面向对象  new 创建对象
		String s = new String("abc");
		String s2 = new String("abc");
		System.out.println(s==s2);//false
		//String是比较特殊，因为重新实现toString方法，导致对象不同的时候，字面值也相同
		System.out.println("s="+s);//abc 按照 字符串的字面值输出
		System.out.println("s2="+s2);//abc
		
		
		Test05 o = new Test05();
		//全类名@十六进制的数字
		//o=lesson04.Test05@659e0bfd
		System.out.println("o="+o);
		
	}

}
