package gok.xse1602.lesson10.inner;

import gok.xse1602.lesson10.chou.Fruit;

public class Outer {
	// 外部类 类体中定义的类称为内部类:内部类可以直接访问外部类的成员
	// 一、定义在类体中的内部类[理解成全局变量]
	// 二、定义在方法体中(代码段)的内部类[理解成局部变量]

	// 实例变量
	int intVar = 10;
	static int staticVar = 20;

	public void test01() {
		System.out.println("Outer  test01()...");

		final int i = 10;

		// 二、方法体中的内部类:只能定义在代码段中,只能在代码段中使用
		// 局部变量 不可以加访问权限,可以加的修饰符 final 或者abstract
		// 格式：Outer$1FunInnerClass.class
		// 有名字的内部类 与 匿名内部类
		class FunInnerClass {

			public void test04() {
				System.out.println("方法体中的内部类 test04()...");
				System.out.println(intVar);
				System.out.println(staticVar);

				// 方法中的内部类 访问局部变量 ，局部变量必须加final修饰
				System.out.println(i);
			}

		}

		FunInnerClass funInnerClass = new FunInnerClass();
		funInnerClass.test04();

	}

	// 一、定义在类体中的内部类[理解成全局变量]
	// 分为：静态内部类 和实例内部类
	// 命名格式：外围类名$内部类名字.class
	// 1.1静态内部类：只能直接访问外部类的 静态成员
	// Outer$StaticInner.class
	static class StaticInner {
		public void test02() {
			System.out.println("Outer.StaticInner  test02()...");
			System.out.println(staticVar);
			// System.out.println(intVar);//error
		}
	}

	// 1.2实例内部类：可以直接访问外部类的所有成员
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
		// 用静态内部类
		StaticInner staticInner = new StaticInner();
		staticInner.test02();

		// 实例内部类 外部类对象.new 类名
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.test03();

		// 匿名内部类:调用构造方法并实现
		// 写了一个匿名内部类 并继承自 Object
		// Outer$1.class
		Object o = new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "我是匿名内部类";
			}

		};
		System.out.println("o=" + o);

		// 匿名内部类 并继承自Fruit
		//Outer$2.class
		Fruit fruit = new Fruit() {
			@Override
			public void eatFun() {
				System.out.println("用匿名内部类方式实现抽象方法");
			}
		};

		fruit.eatFun();

	}

}
