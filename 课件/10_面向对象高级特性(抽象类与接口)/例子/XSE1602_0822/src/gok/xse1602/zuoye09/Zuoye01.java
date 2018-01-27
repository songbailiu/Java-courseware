package gok.xse1602.zuoye09;

public class Zuoye01 {

	public static void main(String[] args) {
		A a1 = new A();//全A 类中方法 
		//A.show(A);  A.show(D)
		
		//a2是B类的上转型对象: A.show(D)//继承得到的
		//B.show(A)//重写后得到
		A a2 = new B();
		
		//能够操作的方法 B类中的方法
		//B.show(B),B.show(A),A.show(d)
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println("1 " + a1.show(b));//A.show(A)
		System.out.println("2 " + a1.show(c));//A.show(A)
		System.out.println("3 " + a1.show(d));//A.show(D)
		System.out.println("4 " + a2.show(b));//B.show(A)
		System.out.println("5 " + a2.show(c));//B.show(A)
		System.out.println("6 " + a2.show(d));//A.show(D)
		System.out.println("7 " + b.show(b));//B.show(B)
		System.out.println("8 " + b.show(c));//B.show(B)
		System.out.println("9 " + b.show(d));//A.show(d)

	}

}

class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
}

class B extends A {
	//新增方法
	public String show(B obj) {
		return ("B and B");
	}

	//重写
	public String show(A obj) {
		return ("B and A");
	}
	//继承得到方法 A.show(D)
}

class C extends B {
}

class D extends B {
}
