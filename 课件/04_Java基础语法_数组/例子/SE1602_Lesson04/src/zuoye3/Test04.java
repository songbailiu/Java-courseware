package zuoye3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//用循环的思路求出2345678倒序后的数字(不能用数组)，输出该数字
		
		//动态输入  Scanner  import java.util.Scanner;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		//获得控制台的输入的int值
		int n = scan.nextInt();
		
//		int n = 2345678;
		
		//2345678   0
		//234567	8
		//23456		87   8*10+7
		//2345		876  87*10+6
		//234		8765
		//23		87654
		//2			876543
		//0			8765432
		
		//算法一：算术运算符实现倒序
		//t是倒序后的数字
		int t = 0;
		int oldNum = n;		
		while(n!=0){
			int g = n%10;//7
			t = t*10+g;//80+7
			n = n/10;//23456			
		}
		System.out.println(oldNum +" 倒序后-->"+t);
		
		
		//算法二:java 字符串工具类实现(了解)
		//int --> String
		String str = oldNum+"";//"2345678"
		//String --> StringBuffer
		StringBuffer sb = new StringBuffer(str);
		//倒序  这个方法 只有StringBuffer才有
		sb.reverse();//"8765432"
		//StringBuffer--> String 
		String newStr = sb.toString();
		//String --> int 
		int newNum = Integer.parseInt(newStr);
		
		System.out.println(oldNum +" 倒序后-->"+newNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
