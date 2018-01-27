public class Test05 {

	public static void main(String[] args) {
		// 逻辑运算符 操作数必须是 boolean
		// &&(短路与) 两边同时为true，则结果为true
		// 短路现象：当左边的值为false，则右边不参与运算
		// &(非短路与):两边同时为true，则结果为true
		// 不管左边是否为false，右边总要参与运算
		int a = 4, b = 5;
		boolean and = a > 4 && ++b > 5;
		System.out.println("and=" + and);// false
		System.out.println("b=" + b);// 5
		
		
		boolean and2 = a > 4 & ++b > 5;//右边参与运算啦
		System.out.println("and2=" + and2);//false
		System.out.println("b=" + b);// 6
		
		
		// ||(短路或) 有一边的值为true，则结果为true
		// 短路现象：当左边为true，则右边不参与运算
		//| 非短路或：有一边的值为true，则结果为true
		//不管左边是否为true，右边总要参与运算
		int c = 9,d = 10;
		boolean or = c>=9 || ++d >10;
		System.out.println("or="+or);//true
		System.out.println("d="+d);//10
		
		boolean or2 = c>=9 | ++d >10;//右边参与运算啦
		System.out.println("or2="+or2);//true
		System.out.println("d="+d);//11
		
		// 非 ! 非真即假
		boolean not = !or2;
		System.out.println("not="+not);
		boolean not2= !(c>9);
		System.out.println("not2="+not2);
		

	}

}
