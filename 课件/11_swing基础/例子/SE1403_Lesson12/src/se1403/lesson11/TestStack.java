package se1403.lesson11;

import java.util.Stack; //��̬���� ����.����������෽��
import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class TestStack {
	// ��̬����
	// �ɱ����
	// ö������ enum

	// �ɱ����:������ʽ������:printƥ��0�����������String
	// �ɱ���������ڲ����б�����һ��
	static void print(String... strings) {
		System.out.println("print(String... strings)...");
		// ��������
		for (String s : strings) {
			System.out.println(s);
		}
	}

	// �����о�ȷƥ��Ĳ���
	static void print() {
		System.out.println("print()...");
	}

	static void stack() {

		// Stack ��Vector�����࣬ջ:�Ƚ����,��Ԫ��ѹ��ջ��
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= 5; i++) {
			stack.push(i);// ѹ��ջ��
		}

		// System.out.println(stack);
		// �鿴ջ��Ԫ�أ����Ƴ�
		int peek = stack.peek();
		System.out.println("peek=" + peek);
		// �鿴ջ��Ԫ�أ����Ƴ�
		// int pop = stack.pop();
		// System.out.println("pop="+pop);
		// System.out.println(stack);

		// ����ѭ���Ƴ�ջ��Ԫ��
		while (stack.isEmpty() == false) {
			System.out.println(stack.pop());
		}

		System.out.println(stack);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ʹ�þ�̬����ĳ�Ա
		// System.out.println(Math.E);
		// System.out.println(PI);
		// System.out.println(abs(-12));

		// ���Կɱ����
		// print();// ���þ�ȷƥ��ķ���
		// print("abc");
		// print("abc", "def");

		// ö�����ͣ���һ���µ�������������:�൱�ڳ���
		// ʹ��ö������Enum�ؼ��ֶ���
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
