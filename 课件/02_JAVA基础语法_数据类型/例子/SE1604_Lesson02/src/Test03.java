
public class Test03 {

	public static void main(String[] args) {
		//�������ʽ����ϵ���ʽ���߼����ʽ���������ʽ����ֵ���ʽ�����ű��ʽ
		//���ȼ�:���� ���� ��ϵ ���� �߼� ���ڸ�ֵ  ���� ����
		int a=10,b=10,c=100;
		
		double d = Math.sqrt(16)+10;//�������ʽ  4.0
		System.out.println("d="+d);
		System.out.println("��ӡ����,������");
		
		//��Ϸ�������  ������������ϣ�����߿�ʼ����
		//�ҽ�ϣ� ���ұ߿�ʼ����
		int sum = a+b+c;//�ұߵ�ֵ��ֵ����ߵı���sum
		
		
//		���������
		//+,-,*,/,%
		//++,--
		
		int div = 10/3;//������������ȡ���� 3
		int mod = 10%3;//% ����  1
		//++,--
		//++   �������1
		//ǰ�� ++  ++i   �������1 �ٲ�������
		//����++  i++  �Ȳ��������������1
		//ǰ�� --  --i   �������1 �ٲ�������
		//����--  i--  �Ȳ��������������1
		
		int i = 5;
		System.out.println(++i);//6
		System.out.println(i);//6
		System.out.println(i++);//i=6  i++ ��ʾi���� 6 
		System.out.println(i);//7
		System.out.println(--i);//6
		System.out.println(i--);//6
		System.out.println(i);//5
		
		//��̬��             5   6    7  7   6    6  6   5
		int res = (i++)+i+(++i)+i+(--i)+i+(i--)+i;
		System.out.println(res);
		
		
		
		//��ֵ�����  �븴�ϸ�ֵ�����
		int x,y,z;
		x = y = z=10;
		
		//�����д��
		//int k =  o =  ko = 10;//error
		
		//���ϸ�ֵд��+=,-=,/=,*=,%=
		x += 5;// x = x+5;//10+5
		
		
		
		

	}

}
