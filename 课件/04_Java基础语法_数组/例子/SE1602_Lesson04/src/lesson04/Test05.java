package lesson04;

public class Test05 {

	public static void main(String[] args) {
		// ��������
		int[] arr = new int[2];
		//�˽��������  new ��������
		String s = new String("abc");
		String s2 = new String("abc");
		System.out.println(s==s2);//false
		//String�ǱȽ����⣬��Ϊ����ʵ��toString���������¶���ͬ��ʱ������ֵҲ��ͬ
		System.out.println("s="+s);//abc ���� �ַ���������ֵ���
		System.out.println("s2="+s2);//abc
		
		
		Test05 o = new Test05();
		//ȫ����@ʮ�����Ƶ�����
		//o=lesson04.Test05@659e0bfd
		System.out.println("o="+o);
		
	}

}
