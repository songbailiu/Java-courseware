public class TestChar
{


	public static void main(String[] args){
		//���帳ֵ���
		char c = 'a';
		//char c = 'b';//�����ظ��������

		//System.out.println("c="+c);
		//��ֵ���
		c = 'b';
		//�����������
		//System.out.println("c="+c);
		//ת���ַ�: һ'\'��ʼ+�����ַ�
		//System.out.println("\\="+'\\');
		//'ֻ��һ���ַ�'  \\������ "\\\\" �ַ���String
		//System.out.println("\\\\="+"\\\\");
		//\n����  \t ���� \r�س� \b�˸�
		/*System.out.println("nn="+'\n'+"hn");
		System.out.println("tt="+'\t'+"ht");
		System.out.println("rr="+'\r'+"hr");//�س� ��굽�ʼλ��
		System.out.println("bb="+'\b'+"hb");
*/
		//�˽��Ƶ�ת�� \072
		char c8 = '\072';
		System.out.println("c8="+c8);
		//ʮ�����Ƶ�ת�� \��u+��λ \u003A
		char c16 = '\u003A';
		System.out.println("c16="+c16);

		//unicode�������ȫ����󲿷ֹ��ҵ��ַ�
		char chinese = '��';
		System.out.println("chinese="+chinese);
		//��----->��  ��ʽת��
		//byte, short, char  >  int > long >  float > double

		int sum = '��'+0;
		System.out.println("sum="+sum);

		





	
	
	}
}