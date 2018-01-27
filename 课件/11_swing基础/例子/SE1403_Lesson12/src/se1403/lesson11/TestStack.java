package se1403.lesson11;

import java.util.Stack; //静态导入 类名.类变量或者类方法
import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class TestStack {
	// 静态导入
	// 可变参数
	// 枚举类型 enum

	// 可变参数:特殊形式的重载:print匹配0个到多个参数String
	// 可变参数必须在参数列表的最后一列
	static void print(String... strings) {
		System.out.println("print(String... strings)...");
		// 当作数组
		for (String s : strings) {
			System.out.println(s);
		}
	}

	// 假设有精确匹配的参数
	static void print() {
		System.out.println("print()...");
	}

	static void stack() {

		// Stack 是Vector的子类，栈:先进后出,把元素压入栈顶
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= 5; i++) {
			stack.push(i);// 压入栈顶
		}

		// System.out.println(stack);
		// 查看栈顶元素，不移除
		int peek = stack.peek();
		System.out.println("peek=" + peek);
		// 查看栈顶元素，并移除
		// int pop = stack.pop();
		// System.out.println("pop="+pop);
		// System.out.println(stack);

		// 利用循环移除栈顶元素
		while (stack.isEmpty() == false) {
			System.out.println(stack.pop());
		}

		System.out.println(stack);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 使用静态导入的成员
		// System.out.println(Math.E);
		// System.out.println(PI);
		// System.out.println(abs(-12));

		// 测试可变参数
		// print();// 调用精确匹配的方法
		// print("abc");
		// print("abc", "def");

		// 枚举类型，是一种新的面向对象的类型:相当于常量
		// 使用枚举类型Enum关键字定义
		MyWeek myWeek = MyWeek.one;
		System.out.println(myWeek);

		switch (myWeek) {
		case one:
			System.out.println("one.......");
			break;
		case two:

			break;
		case three:

			break;
		case four:

			break;

		default:
			break;
		}
	}

}
