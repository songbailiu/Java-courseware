package lesson04;

public class Test02 {

	public static void main(String[] args) {
		// ��̬��������������е�Ԫ�ػ���Ĭ��ֵ
		// ������������Ԫ��Ϊ0;
		// ��������������Ԫ��Ϊ0.0;
		// ��������������Ԫ��Ϊfalse;
		// �ַ���Ĭ�ϳ�ʼֵΪ���ַ�,\u0000 �൱��' '
		// ��������������Ԫ��Ϊnull;

		System.out.println("=====int Ĭ��ֵ 0===========");
		int[] arrInt = new int[3];// {0,0,0}
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("arrInt[" + i + "]=" + arrInt[i]);
		}

		System.out.println("=====char Ĭ��ֵ ' '  \u0000===========");
		char[] arrChar = new char[3];// {' ',' ',' '}
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("arrChar[" + i + "]=" + arrChar[i] + "||");
		}

		System.out.println("=====������ Ĭ��ֵ 0.0===========");
		double[] arrDouble = new double[3];// {0.0,0.0,0.0}
		for (int i = 0; i < arrDouble.length; i++) {
			System.out.println("arrDouble[" + i + "]=" + arrDouble[i]);
		}

		System.out.println("=====boolean Ĭ��ֵ false===========");
		boolean[] arrBoolean = new boolean[3];// { false, false, false}
		for (int i = 0; i < arrBoolean.length; i++) {
			System.out.println("arrBoolean[" + i + "]=" + arrBoolean[i]);
		}

		System.out.println("=====������������ Ĭ��ֵ null===========");
		String[] arrString = new String[3];// { null, null, null}
		for (int i = 0; i < arrString.length; i++) {
			System.out.println("arrString[" + i + "]=" + arrString[i]);
		}

	}

}
