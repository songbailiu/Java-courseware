public class Test01
{


	public static void main(String[] args){
		int i = 5;
		//++前置  变量自身先递增1 再参加运算
		//++后置  变量先参加运算，再自身递增1
		System.out.println("++i="+(++i));//6  i=i+1
		System.out.println("i="+i);//6
		System.out.println("i++="+i++);//6 i++ ==>i 完之后i=i+1
		System.out.println("i="+i);//7 

		//--前置  变量自身先递减1 再参加运算
		//--后置  变量先参加运算，再自身递减1
		int b = 7;
		System.out.println("--b="+(--b));//6
		System.out.println("b="+b);//6
		System.out.println("b--="+b--);//6
		System.out.println("b="+b);//5

		i = 5;
		//			6	6	6	  7     6   6   6     5	
		int sum = ++i + i + i++ + i + --i + i + i-- + i; 
		System.out.println("sum="+sum);
		//参加运算的两个数为整数的时候，商取整数部分
		System.out.println("div="+22/4);//5

		//int a = int b = int c = 10;//error
		int a,f,c;//逗号
		a = f = c = 10;
		int d = 10,e = 30;
		

		


	
	
	}
}