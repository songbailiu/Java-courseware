public class Test04 {

	public static void main(String[] args) {
		// ��ϵ����� ���ʽ�ķ���ֵ��boolean
		// >,>=,<,<= Ҫ�����ֲ��ܱȽϴ�С
		// == , != Ҫ�� �Ⱥ����ߵ���������һ��(����)
		int a = 9, b = 10, c = 10;
		boolean gt = a > b;// false
		boolean ge = c >= 10;// true

		// == ,!= ���ߵ�����Ҫ����
		boolean eq = a == b;// false
		boolean eq2 = a == 9.0;// ��ʽת�� a=9 --> 9.0
		System.out.println("eq2=" + eq2);

		boolean neq = a != b;
		System.out.println("neq=" + neq);

		char char1 = ':';
		System.out.println(char1 + " --> " + (int) char1);

		boolean eq3 = 58 == char1;//char --> int
		System.out.println("eq3=" + eq3);// true
		
		//�����������ͣ������� Ҳ����ʹ��== ��!= 
		String s1 = "abc";//������
		String s2 = "abc";//������
		String s3 = new String("abc");//���� �¿��� 
		boolean eq4 = s1 == s2;
		System.out.println("eq4="+eq4);//true
		boolean eq5 = s1 == s3;
		System.out.println("eq5="+eq5);//false
	}

}
