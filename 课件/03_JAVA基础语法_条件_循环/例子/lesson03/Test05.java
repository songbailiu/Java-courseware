class Test05 
{
	public static void main(String[] args) 
	{
		//javaΨһһ����Ŀ����������������
		//���ʽ1?���ʽ2:���ʽ3  Ҫ�󣺱��ʽ1����boolean,���ʽ2����ʽ3 ����������һ��
		int a = 1,b = 100,c = 1000;
		int max;
		max = a>b?a:b;
		System.out.println("max="+max);
		//��Ч��if...else
		/*if(a>b){
			max = a;
		}else{
			max = b;
		}*/

		//��������������������е����ֵ
		max = a>b?(a>c?a:c) : (b>c?b:c);
		System.out.println("���������ֵ max="+max);


	}
}
