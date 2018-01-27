package lesson04;

public class Test02 {

	public static void main(String[] args) {
		// 动态创建数组后，数组中的元素会获得默认值
		// 整型数组所有元素为0;
		// 浮点型数组所有元素为0.0;
		// 布尔型数组所有元素为false;
		// 字符型默认初始值为空字符,\u0000 相当于' '
		// 类类型数组所有元素为null;

		System.out.println("=====int 默认值 0===========");
		int[] arrInt = new int[3];// {0,0,0}
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		System.out.println("=====char 默认值 ' '  \u0000===========");
		char[] arrChar = new char[3];// {' ',' ',' '}
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("arrChar[" + i + "]=" + arrChar[i] + "||");
		}

		System.out.println("=====浮点型 默认值 0.0===========");
		double[] arrDouble = new double[3];// {0.0,0.0,0.0}
		for (int i = 0; i < arrDouble.length; i++) {
			System.out.println("arrDouble[" + i + "]=" + arrDouble[i]);
		}

		System.out.println("=====boolean 默认值 false===========");
		boolean[] arrBoolean = new boolean[3];// { false, false, false}
		for (int i = 0; i < arrBoolean.length; i++) {
			System.out.println("arrBoolean[" + i + "]=" + arrBoolean[i]);
		}

		System.out.println("=====复合数据类型 默认值 null===========");
		String[] arrString = new String[3];// { null, null, null}
		for (int i = 0; i < arrString.length; i++) {
			System.out.println("arrString[" + i + "]=" + arrString[i]);
		}

	}

}
