
public class Test03 {

	public static void main(String[] args) {
		//算术表达式、关系表达式、逻辑表达式、函数表达式、赋值表达式、逗号表达式
		//优先级:算术 高于 关系 高于 逻辑 高于赋值  高于 逗号
		int a=10,b=10,c=100;
		
		double d = Math.sqrt(16)+10;//函数表达式  4.0
		System.out.println("d="+d);
		System.out.println("打印函数,输出语句");
		
		//结合方向：左结合  大多数都是左结合，从左边开始计算
		//右结合： 从右边开始计算
		int sum = a+b+c;//右边的值赋值给左边的变量sum
		
		
//		算术运算符
		//+,-,*,/,%
		//++,--
		
		int div = 10/3;//整数相除，结果取整数 3
		int mod = 10%3;//% 求余  1
		//++,--
		//++   自身递增1
		//前置 ++  ++i   先自身加1 再参与运算
		//后置++  i++  先参与运算再自身加1
		//前置 --  --i   先自身减1 再参与运算
		//后置--  i--  先参与运算再自身减1
		
		int i = 5;
		System.out.println(++i);//6
		System.out.println(i);//6
		System.out.println(i++);//i=6  i++ 表示i本身 6 
		System.out.println(i);//7
		System.out.println(--i);//6
		System.out.println(i--);//6
		System.out.println(i);//5
		
		//变态版             5   6    7  7   6    6  6   5
		int res = (i++)+i+(++i)+i+(--i)+i+(i--)+i;
		System.out.println(res);
		
		
		
		//赋值运算符  与复合赋值运算符
		int x,y,z;
		x = y = z=10;
		
		//下面的写法
		//int k =  o =  ko = 10;//error
		
		//复合赋值写法+=,-=,/=,*=,%=
		x += 5;// x = x+5;//10+5
		
		
		
		

	}

}
