package lesson04;


/**
 * ���������ڴ�ṹ
 * @author admin
 *
 */
public class Test03 {

	public static void main(String[] args) {
		// ������java�б������������Ǹ����������ͣ������ڴ����ã���ַ
		// Ĭ��ֵ null ����Ϊ�գ����󲻴���,��ռ���ڴ�ռ�
		// int[] arr = null;
		// //java.lang.NullPointerException ��ָ���쳣
		// //����Ϊnull�������������е�����ʱ �������쳣������
		// //System.out.println("arr.length=" + arr.length);
		// // System.out.println(arr[0]);//NullPointerException
		//
		// //������Ϊ��������ڴ�ռ� ���Ǵ���������,�Ͳ�����ֿ�ָ���쳣
		// System.out.println("arr="+arr);
		// arr = new int[2];
		// //[I@659e0bfd �߼���ַ java ����������߼��ַ���
		// System.out.println("new֮�� arr="+arr);
		// char[] arrChar = new char[2];
		// //[C@2a139a55
		// System.out.println("new֮�� arrChar="+arrChar);
		// //[��������@��ϣֵ��ʮ�����Ƶ��ַ�������

		// �ص�̽�� ������ڴ� �ֲ�
		int[] arr1 = new int[2];// {0,0}
		int[] arr2 = new int[2];// {0,0}
		System.out.println("arr1=" + arr1);// [I@659e0bfd
		System.out.println("arr2=" + arr2);// [I@2a139a55
		System.out.println(arr1 == arr2);// false
		// arr1 ��arr2 �����ڴ����ǲ�ͬ�Ķ���,ָ���˲�ͬ���ڴ��������Բ����
		// ���Ըı�arr2 �е����ݲ���Ӱ��arr1
		arr2[0] = 99;
		System.out.println("arr1[0]=" + arr1[0]);// 0
		System.out.println("arr2[0]=" + arr2[0]);// 99

		// �����arr1 �� arr2 ����== ���� true?
		arr1 = arr2;//arr1 ָ��arr2 �������ڴ�ռ�
		System.out.println("arr1=" + arr1);
		System.out.println("arr2=" + arr2);
		System.out.println(arr1 == arr2);// true

	}

}
