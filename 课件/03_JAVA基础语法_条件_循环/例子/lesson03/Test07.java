class Test07 
{
	static int getMax(int a,int b){
		System.out.println("getMax(int a,int b)....");
		int max = a>b?a:b;

		return max;//return�з���ֵ ��ǰ������ʣ�����ȫ��������
		//System.out.println("�޷��������...");//error
	}

	public static void main(String[] args) 
	{
		//��ת�ؼ��� return,break,continue
		//return ������ǰ�ķ����ĵ��ã�[Ϊ����ִ�з���ֵ],�����г���return�󣬷���ʣ�����ȫ��������
		/*int a = 5;
		if(a==5){
			System.out.println("a==5");
			return;//������ǰ����ִ�У����Է�����ʣ�����
		}*/
		
		//int max = getMax(1,100);
		//System.out.println("max="+max);

		/*for(int i=0;i<=10;i++){
			System.out.println("i="+i);
			if(i==5){
				return;//ʣ���������ȫ����ִ��
			}
		}*/
		
		
		//break:[�÷�һ����ֹcase]���÷�������ֹһ��ѭ�����������Ȩ����ѭ����������
		/*for(int i=0;i<=10;i++){
			System.out.println("i="+i);
			if(i==5){
				break;//��ֹһ��ѭ�����������Ȩ����ѭ����������
			}
		}*/

		//continue:��յ���ѭ��(���Ե���ѭ����ʣ�����)��ִ����һ��ѭ��
		/*System.out.println("======================");
		for(int i=0;i<=10;i++){			
			if(i==5){
				continue;//��յ���ѭ��(���Ե���ѭ����ʣ�����)��ִ����һ��ѭ��
			}
			System.out.println("i="+i);
		}*/


		//��ͬѭ������continue��Ŀ���Ȩ��������
		//continue ����for�У�����Ȩ������������
		//continue ����while����do..while �У�����Ȩ���������жϲ���
		for(int i=0;i<=10;i++){			
			if(i==5){
				continue;//����Ȩi++
			}
			System.out.println("i="+i);
		}

		System.out.println("***********************");
		int i=0;
		while(i<=10){
			if(i==5){
				continue;//whileѭ���У�continue����֮�󣬿���Ȩ�������ж�
			}
			System.out.println("i="+i);
			i++;//����continue֮��û��ִ��
		}


		System.out.println("main��������....");
	}
}
