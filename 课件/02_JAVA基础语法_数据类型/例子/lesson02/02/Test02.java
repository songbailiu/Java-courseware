public class Test02
{


	public static void main(String[] args){
		//关系运算符 的表达式返回值boolean
		//<=  >= 阐述的关系是或者的关系

		// >,<, >=,<= 运算数只能是数字
		//== !=可以是任何的类型 两个操作数应该是相关类型   

		boolean ge = 9>=9;//true
		boolean le = 8<=9;//true
		System.out.println("ge="+ge);
		System.out.println("le="+le);

		System.out.println(true==true);
		System.out.println(false==true);
		//System.out.println(8==true);//不可比较的类型：int 和 boolean
		//System.out.println(8!=true);//不可比较的类型：int 和 boolean
		System.out.println(9==9);
		System.out.println(19!=9);
		


	
	
	}
}