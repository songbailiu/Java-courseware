public class Test03
{


	public static void main(String[] args){
		//�߼������  ������һ����boolean����  
		//��·�������ұߵı��ʽ,����ߵı��ʽΪfalse���ұߵĲ��μ�����
		//&&���� ����Ϊ���Ϊ��,	
		
		int a = 9,b = 10;
		//boolean and1 = a>=9 && b++ > 10;//false
		//System.out.println("and1="+and1);
		//System.out.println("b="+b);//11
		//boolean and2 = a>9 && b++ > 10;//
		//System.out.println("and2="+and2);
		//System.out.println("b="+b);//10

		//& �Ƕ�·��(��������Ƿ�Ϊ�棬�ұ�һ����μ�����)
		/*boolean not_and = a>9 & b++ > 10;//
		System.out.println("not_and="+not_and);
		System.out.println("b="+b);//10*/

		//|| ��·��  ����ߵı��ʽΪtrue �ұ߱��ʽ���μ�����
		/*boolean or  = 9==9 || ++b>10;
		System.out.println("or="+or);//true
		System.out.println("b="+b);//10*/

		//|�Ƕ�·�� ������ߵı��ʽ�Ƿ�Ϊ�棬�ұ߶���μ�����
		/*boolean not_or  = a==9 | ++b>10;
		System.out.println("not_or="+not_or);//true
		System.out.println("b="+b);//11*/
		
		//!ȡ��
		boolean not = !(a>b);
		System.out.println("not="+not);




		
		


	
	
	}
}