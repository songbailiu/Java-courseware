package gok.se1604.zuoye9;

public class Zuoye04 {

	public static void main(String[] args) {
		//变量能够操作的方法 确定下来
		A a1 = new A();//A.show(A),A.show(D)
		A a2 = new B();//B.show(A),A.show(D)//继承自 父类A
		B b = new B();//B.show(B),B.show(A),A.show(D)
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
		System.out.println("9 " + b.show(d));//A.show(D)

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
	// 重载 新增的方法
	public String show(B obj) {
		return ("B and B");
	}

	// 重写
	public String show(A obj) {
		return ("B and A");
	}

	// 从A类继承过来的
	// public String show(D obj) {
	// return ("A and D");
	// }
}

class C extends B {
}

class D extends B {
}
