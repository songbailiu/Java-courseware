
public class Test02 {

	public static void main(String[] args) {
		//��������֮���������
		//1���;��� ���߾��� �Զ�ת��
		//byte, short, char  >  int > long >  float > double
		byte b = 8;
		short s = 129;
		char c = '��';
		int sum = b+s+c;
		float f = 99.6f;//F
		
		float sumf = sum+9.8f;		
		double d = 99.6+sum;
		
		//2���߾��� ���;���  ��Ҫǿ������ת�������ܵ�����ʧ����
		int fi = (int)f;//99.6 --> 99
		
		System.out.println("fi="+fi);
		//byte:-128 --> 127
		byte b2 = (byte)128;//int --> byte
		System.out.println("b2="+b2);//-128
		//-128 ,-127....0,1,2....127
		
		//ע�⣺���ܰ�boolean���Ͳ�����������
		boolean bl = false;
		//int a = 99+bl;//The operator + is undefined for the argument type(s) int, boolean
		
		System.out.println(bl==true);//false
		
		
		//char 0-65535   С��int��Χ
		char cChar = 'a';//97
		int ci = cChar;//97
		System.out.println(cChar+" --> "+ci);
		System.out.println(cChar+" --> "+(int)cChar);
		
		
		
		
		
		
		
		

		

	}

}
