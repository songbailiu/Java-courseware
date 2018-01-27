package gok.se1604.inner;

import gok.se1604.lesson10.chou.Fruit;

public class Outer {
	// 内部类:定义在类的内部的类称为内部类, 可以直接访问外围类相关成员
	// 分为两大类：类体中内部类 和方法体中的内部类
	// 一、类体中的内部类：相当于类体中的成员变量，可以在类的内部和外部使用
	// 命名格式：外围类类名$内部类类名.class
	// 静态内部类 与实例内部类
	// 静态内部类:static修饰，只能直接访问外围类静态的成员
	// 实例内部类：可以访问外围类所有的成员
	
	//二、方法体中的内部类：只能在定义它的方法中或者代码段中使用，不能在外部使用
	//分类：有名字的内部类 与匿名内部类

	static int staticVar = 100;
	int var = 10;

	public void test() {
		// 使用内部类
		// 静态内部类
		StaticInner staticInner = new StaticInner();
		staticInner.test01();

		// 实例内部类 对象.new 类名()
		// Inner inner = new Inner();
		Inner inner = this.new Inner();
		inner.test02();
		
		
		
		
		final int i = 100;
		
		//方法中的内部类:只能在定义它的方法中或者代码段中使用，不能在外部使用，不能使用权限修饰符
		//Outer$1FunInnerClass.class
		class FunInnerClass{
			
			public void test03() {
				System.out.println("test03():"+staticVar);
				System.out.println("test03():"+var);
				//方法中的内部类使用局部变量  该变量必须final
				System.out.println("test03():"+i);
			}
			
		}

	}

	// 静态内部类  Outer$StaticInner.class
	public static class StaticInner {

		public void test01() {
			System.out.println("test01() .." + staticVar);
			// System.out.println(var);//error
		}

	}

	// 实例内部类:可以直接访问外围类的所有的成员
	//Outer$Inner.class
	public class Inner {
		public void test02() {
			System.out.println("test02() .." + staticVar);
			System.out.println("test02() .." + var);
		}
	}

	public static void main(String[] args) {

		// 使用内部类
		// 静态内部类
//		StaticInner staticInner = new StaticInner();
//		staticInner.test01();
//
//		// 实例内部类 外部类对象.new 类名()
//		Outer outer = new Outer();
//		Inner inner = outer.new Inner();
//		inner.test02();
		
		
		//匿名内部类:Outer$1.class
		Object o = new Object(){//定义了一个没有名字的类 并继承自Object父类
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "匿名内部类";
			}
		};
		System.out.println(o);
		
		
		//写了一个匿名内部类 并继承自Fruit重写 eatFun()
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
