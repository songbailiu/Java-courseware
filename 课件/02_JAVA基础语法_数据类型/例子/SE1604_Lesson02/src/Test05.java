public class Test05 {

	public static void main(String[] args) {
		// �߼������ ������������ boolean
		// &&(��·��) ����ͬʱΪtrue������Ϊtrue
		// ��·���󣺵���ߵ�ֵΪfalse�����ұ߲���������
		// &(�Ƕ�·��):����ͬʱΪtrue������Ϊtrue
		// ��������Ƿ�Ϊfalse���ұ���Ҫ��������
		int a = 4, b = 5;
		boolean and = a > 4 && ++b > 5;
		System.out.println("and=" + and);// false
		System.out.println("b=" + b);// 5
		
		
		boolean and2 = a > 4 & ++b > 5;//�ұ߲���������
		System.out.println("and2=" + and2);//false
		System.out.println("b=" + b);// 6
		
		
		// ||(��·��) ��һ�ߵ�ֵΪtrue������Ϊtrue
		// ��·���󣺵����Ϊtrue�����ұ߲���������
		//| �Ƕ�·����һ�ߵ�ֵΪtrue������Ϊtrue
		//��������Ƿ�Ϊtrue���ұ���Ҫ��������
		int c = 9,d = 10;
		boolean or = c>=9 || ++d >10;
		System.out.println("or="+or);//true
		System.out.println("d="+d);//10
		
		boolean or2 = c>=9 | ++d >10;//�ұ߲���������
		System.out.println("or2="+or2);//true
		System.out.println("d="+d);//11
		
		// �� ! ���漴��
		boolean not = !or2;
		System.out.println("not="+not);
		boolean not2= !(c>9);
		System.out.println("not2="+not2);
		

	}

}
