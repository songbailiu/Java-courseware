public class Test01
{


	public static void main(String[] args){
		int i = 5;
		//++ǰ��  ���������ȵ���1 �ٲμ�����
		//++����  �����Ȳμ����㣬���������1
		System.out.println("++i="+(++i));//6  i=i+1
		System.out.println("i="+i);//6
		System.out.println("i++="+i++);//6 i++ ==>i ��֮��i=i+1
		System.out.println("i="+i);//7 

		//--ǰ��  ���������ȵݼ�1 �ٲμ�����
		//--����  �����Ȳμ����㣬������ݼ�1
		int b = 7;
		System.out.println("--b="+(--b));//6
		System.out.println("b="+b);//6
		System.out.println("b--="+b--);//6
		System.out.println("b="+b);//5

		i = 5;
		//			6	6	6	  7     6   6   6     5	
		int sum = ++i + i + i++ + i + --i + i + i-- + i; 
		System.out.println("sum="+sum);
		//�μ������������Ϊ������ʱ����ȡ��������
		System.out.println("div="+22/4);//5

		//int a = int b = int c = 10;//error
		int a,f,c;//����
		a = f = c = 10;
		int d = 10,e = 30;
		

		


	
	
	}
}