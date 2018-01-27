package gok.xse1602.lesson10.inner;

import gok.xse1602.lesson10.chou.Fruit;

public class Outer {
	// �ⲿ�� �����ж�������Ϊ�ڲ���:�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա
	// һ�������������е��ڲ���[����ȫ�ֱ���]
	// ���������ڷ�������(�����)���ڲ���[���ɾֲ�����]

	// ʵ������
	int intVar = 10;
	static int staticVar = 20;

	public void test01() {
		System.out.println("Outer  test01()...");

		final int i = 10;

		// �����������е��ڲ���:ֻ�ܶ����ڴ������,ֻ���ڴ������ʹ��
		// �ֲ����� �����Լӷ���Ȩ��,���Լӵ����η� final ����abstract
		// ��ʽ��Outer$1FunInnerClass.class
		// �����ֵ��ڲ��� �� �����ڲ���
		class FunInnerClass {

			public void test04() {
				System.out.println("�������е��ڲ��� test04()...");
				System.out.println(intVar);
				System.out.println(staticVar);

				// �����е��ڲ��� ���ʾֲ����� ���ֲ����������final����
				System.out.println(i);
			}

		}

		FunInnerClass funInnerClass = new FunInnerClass();
		funInnerClass.test04();

	}

	// һ�������������е��ڲ���[����ȫ�ֱ���]
	// ��Ϊ����̬�ڲ��� ��ʵ���ڲ���
	// ������ʽ����Χ����$�ڲ�������.class
	// 1.1��̬�ڲ��ֻࣺ��ֱ�ӷ����ⲿ��� ��̬��Ա
	// Outer$StaticInner.class
	static class StaticInner {
		public void test02() {
			System.out.println("Outer.StaticInner  test02()...");
			System.out.println(staticVar);
			// System.out.println(intVar);//error
		}
	}

	// 1.2ʵ���ڲ��ࣺ����ֱ�ӷ����ⲿ������г�Ա
	// Outer$Inner.class
	class Inner {
		public void test03() {
			System.out.println("Outer.Inner  test03()...");
			System.out.println(staticVar);
			System.out.println(intVar);
			System.out.println(Outer.this.intVar);

		}

	}

	public static void main(String[] args) {
		// �þ�̬�ڲ���
		StaticInner staticInner = new StaticInner();
		staticInner.test02();

		// ʵ���ڲ��� �ⲿ�����.new ����
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.test03();

		// �����ڲ���:���ù��췽����ʵ��
		// д��һ�������ڲ��� ���̳��� Object
		// Outer$1.class
		Object o = new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "���������ڲ���";
			}

		};
		System.out.println("o=" + o);

		// �����ڲ��� ���̳���Fruit
		//Outer$2.class
		Fruit fruit = new Fruit() {
			@Override
			public void eatFun() {
				System.out.println("�������ڲ��෽ʽʵ�ֳ��󷽷�");
			}
		};

		fruit.eatFun();

	}

}
