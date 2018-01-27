package gok.se1604.inner;

import gok.se1604.lesson10.chou.Fruit;

public class Outer {
	// �ڲ���:����������ڲ������Ϊ�ڲ���, ����ֱ�ӷ�����Χ����س�Ա
	// ��Ϊ�����ࣺ�������ڲ��� �ͷ������е��ڲ���
	// һ�������е��ڲ��ࣺ�൱�������еĳ�Ա����������������ڲ����ⲿʹ��
	// ������ʽ����Χ������$�ڲ�������.class
	// ��̬�ڲ��� ��ʵ���ڲ���
	// ��̬�ڲ���:static���Σ�ֻ��ֱ�ӷ�����Χ�ྲ̬�ĳ�Ա
	// ʵ���ڲ��ࣺ���Է�����Χ�����еĳ�Ա
	
	//�����������е��ڲ��ֻࣺ���ڶ������ķ����л��ߴ������ʹ�ã��������ⲿʹ��
	//���ࣺ�����ֵ��ڲ��� �������ڲ���

	static int staticVar = 100;
	int var = 10;

	public void test() {
		// ʹ���ڲ���
		// ��̬�ڲ���
		StaticInner staticInner = new StaticInner();
		staticInner.test01();

		// ʵ���ڲ��� ����.new ����()
		// Inner inner = new Inner();
		Inner inner = this.new Inner();
		inner.test02();
		
		
		
		
		final int i = 100;
		
		//�����е��ڲ���:ֻ���ڶ������ķ����л��ߴ������ʹ�ã��������ⲿʹ�ã�����ʹ��Ȩ�����η�
		//Outer$1FunInnerClass.class
		class FunInnerClass{
			
			public void test03() {
				System.out.println("test03():"+staticVar);
				System.out.println("test03():"+var);
				//�����е��ڲ���ʹ�þֲ�����  �ñ�������final
				System.out.println("test03():"+i);
			}
			
		}

	}

	// ��̬�ڲ���  Outer$StaticInner.class
	public static class StaticInner {

		public void test01() {
			System.out.println("test01() .." + staticVar);
			// System.out.println(var);//error
		}

	}

	// ʵ���ڲ���:����ֱ�ӷ�����Χ������еĳ�Ա
	//Outer$Inner.class
	public class Inner {
		public void test02() {
			System.out.println("test02() .." + staticVar);
			System.out.println("test02() .." + var);
		}
	}

	public static void main(String[] args) {

		// ʹ���ڲ���
		// ��̬�ڲ���
//		StaticInner staticInner = new StaticInner();
//		staticInner.test01();
//
//		// ʵ���ڲ��� �ⲿ�����.new ����()
//		Outer outer = new Outer();
//		Inner inner = outer.new Inner();
//		inner.test02();
		
		
		//�����ڲ���:Outer$1.class
		Object o = new Object(){//������һ��û�����ֵ��� ���̳���Object����
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "�����ڲ���";
			}
		};
		System.out.println(o);
		
		
		//д��һ�������ڲ��� ���̳���Fruit��д eatFun()
		//Outer$2.class
		Fruit fruit = new Fruit() {
			
			@Override
			public void eatFun() {
				System.out.println("eatFun().....");
				
			}
		};
		fruit.eatFun();
		
		

	}

}
