package gok.xse1602.zuoye09;

public class Zuoye01 {

	public static void main(String[] args) {
		A a1 = new A();//ȫA ���з��� 
		//A.show(A);  A.show(D)
		
		//a2��B�����ת�Ͷ���: A.show(D)//�̳еõ���
		//B.show(A)//��д��õ�
		A a2 = new B();
		
		//�ܹ������ķ��� B���еķ���
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
	//��������
	public String show(B obj) {
		return ("B and B");
	}

	//��д
	public String show(A obj) {
		return ("B and A");
	}
	//�̳еõ����� A.show(D)
}

class C extends B {
}

class D extends B {
}
