public class Test03
{


	public static void main(String[] args){
		//逻辑运算符  操作数一定是boolean类型  
		//短路与会忽略右边的表达式,当左边的表达式为false，右边的不参加运算
		//&&并且 两边为真才为真,	
		
		int a = 9,b = 10;
		//boolean and1 = a>=9 && b++ > 10;//false
		//System.out.println("and1="+and1);
		//System.out.println("b="+b);//11
		//boolean and2 = a>9 && b++ > 10;//
		//System.out.println("and2="+and2);
		//System.out.println("b="+b);//10

		//& 非短路与(不管左边是否为真，右边一定会参加运算)
		/*boolean not_and = a>9 & b++ > 10;//
		System.out.println("not_and="+not_and);
		System.out.println("b="+b);//10*/

		//|| 短路或  当左边的表达式为true 右边表达式不参加运算
		/*boolean or  = 9==9 || ++b>10;
		System.out.println("or="+or);//true
		System.out.println("b="+b);//10*/

		//|非短路或 不管左边的表达式是否为真，右边都会参加运算
		/*boolean not_or  = a==9 | ++b>10;
		System.out.println("not_or="+not_or);//true
		System.out.println("b="+b);//11*/
		
		//!取反
		boolean not = !(a>b);
		System.out.println("not="+not);




		
		


	
	
	}
}