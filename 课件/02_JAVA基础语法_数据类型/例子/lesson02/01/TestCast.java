public class TestCast
{
	//ǿ������ת��
	//��ָ��ֵ�����˱������͵ľ���ʱ�������� 
	//����ᱨ��

	//ǿ������ת��
	//type i= (type)a; 

	public static void main(String[] args){
		byte b = 127;//-128~127
		byte b1 = (byte)129;
		int fi = (int)99.99f;
		
		System.out.println("b="+b);
		System.out.println("b1="+b1);
		System.out.println("fi="+fi);


		char c = '��';
		int ci = c;
		System.out.println(c+"="+ci);



	
	
	}
}