package lesson04;

public class Test01 {

	public static void main(String[] args) {
		//���飺����ͬ�������͵���˳������ݼ���,��һ�ָ����������͡������������͡�
		//����ͨ�����������[�����±�] �����������е�ÿһ��Ԫ��
		
		//����ĳ�ʼ����1����̬��ʼ����2����̬��ʼ��
		//1����̬��ʼ��:�����븳ֵ������ͬһ�����
		int[] arr = {1,2,44,55,6};
		char[] arrChar = {'a','b','c'};
		boolean[] arrBoolean = {true,false,false};
		double[] arrDouble = {1,2,33.0};
		
		int[] arr2 ;
//		arr2 = {1,2,3,4,5};//error ������̬��ֵ������������ֿ�д
		
		
		//2����̬��ʼ��:new �ؼ��ִ���һ��������󣬶�������һ���µ��ڴ��������������
		int[] arr3 = new int[2];//arr3 ���������2��int����,Ĭ��ֵ{0,0}
		arr3[0] = 99;//�����±���������Ԫ��,���¸�ֵ
		arr3[1] = 110;
		
		//2.2 ��ָ��ֵ�Ķ�̬��ʼ��
		int[] arr4 = new int[]{33,22,44};//�����[����д����]
		
		//����ĳ��ȣ������Ԫ�صĸ���  ������.length
		int length =arr4.length;
		System.out.println("length="+length);
		System.out.println("arr4.length="+arr4.length);
		
		//����ͨ�����͵��±��������:0��ʼ��������ĳ���-1
		System.out.println("arr4[0]="+arr4[0]);//33
		System.out.println("arr4[1]="+arr4[1]);//22
		System.out.println("arr4[2]="+arr4[2]);//44
		
		//error:java.lang.ArrayIndexOutOfBoundsException: 3
		//��������Խ���쳣
//		System.out.println("arr4[3]="+arr4[3]);//error		
		
		//ѭ�� ��������
//		System.out.println("==========ѭ�� ��������=============");
//		for (int i = 0; i < arr4.length; i++) {
//			System.out.println("arr4["+i+"]="+arr4[i]);
//		}
		
		
		
		
		
		
		
		
		
	}

}
