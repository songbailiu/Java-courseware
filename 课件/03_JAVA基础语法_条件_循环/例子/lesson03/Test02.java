class Test02 
{
	public static void main(String[] args) 
	{
		//if���ַ�֧��if��if...else,if ...else if ... else if....else
		int a = 5;
		if(a==5){
			System.out.println("a==5");
		}

		//˫��֧
		if(a%2==0){
			System.out.println("a��ż��");
		}else{
			System.out.println("a������");
		}

		//���֧:ÿһ����֧���֮�����໥�ų��(����һ����ƥ����������ȫ������)
		if(a < 0){
			System.out.println("a<0");
		}else if(0<=a && a<10){
			System.out.println("0<=a && a<10");
		}else if(10 <= a && a < 100){
			System.out.println("10<=a && a<100");
		}else{
			System.out.println("a���������...");
		}

		//else ��ifƥ�������ͬһ������У�����else�����if����ƥ�䣨ifû�б�����elseƥ�䣩
		int  b = 3, c = 5, d = 4, x = 0;
		a = 1;

		if (a < b)
			if (c < d)
				x = 1;
			else if (a < c)
				if (b < d)
					x = 2;
				else
					x = 3;
			else
				x = 6;
		else
			x = 7;
		System.out.println("x="+x);
		//������ȷ��Ƕ�׺󣬳������ɶ��Ծͺ�ǿ��
		if (a < b){
			if (c < d){
				x = 1;
			}else if (a < c){
				if (b < d)
					x = 2;
				else
					x = 3;
			}else{
				x = 6;
			}
		}else
			x = 7;




	}
}
