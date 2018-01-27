public class Test04 {

	public static void main(String[] args) {
		// 关系运算符 表达式的返回值是boolean
		// >,>=,<,<= 要求数字才能比较大小
		// == , != 要求 等号两边的数据类型一致(兼容)
		int a = 9, b = 10, c = 10;
		boolean gt = a > b;// false
		boolean ge = c >= 10;// true

		// == ,!= 两边的类型要兼容
		boolean eq = a == b;// false
		boolean eq2 = a == 9.0;// 隐式转换 a=9 --> 9.0
		System.out.println("eq2=" + eq2);

		boolean neq = a != b;
		System.out.println("neq=" + neq);

		char char1 = ':';
		System.out.println(char1 + " --> " + (int) char1);

		boolean eq3 = 58 == char1;//char --> int
		System.out.println("eq3=" + eq3);// true
		
		//复合数据类型，类类型 也可以使用== 与!= 
		String s1 = "abc";//常量区
		String s2 = "abc";//常量区
		String s3 = new String("abc");//堆区 新开辟 
		boolean eq4 = s1 == s2;
		System.out.println("eq4="+eq4);//true
		boolean eq5 = s1 == s3;
		System.out.println("eq5="+eq5);//false
	}

}
