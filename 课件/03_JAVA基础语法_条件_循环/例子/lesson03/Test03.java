//�ඨ��֮ǰ����ϵͳ�� java.lang����������е�ϵͳ�࣬Ĭ�϶��ᱻjava�����װ��,����String,System��
import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		//���� ������4�ı�������������100�ı�����������400�ı���
		//400���м���4,8,12,16........4�ı���
		//�����100 ���� 100,200,300 ȡ������
		//400������
		
		//�����Ļ�Ķ�̬�������� ������ɨ����Scanner
		Scanner scanner = new Scanner(System.in);
		//�����Ļ���������int
		System.out.println("������һ������,��س�:");
		int y = scanner.nextInt();

		//int y = 2000;
		if(y%4 == 0){
			if(y%100 == 0){
				if(y%400==0){
					System.out.println(y+"������");
				}else{
					System.out.println(y+"��������");				
				}			
			}else{
				//4,8,12,16 
				System.out.println(y+"������");
			}
		}else{
			System.out.println(y+"��������");
		}
		
		
		//�㷨��:�߼������ʵ��
		if(y % 4 == 0 && y%100 != 0 || y % 400 == 0){
			System.out.println(y+"������");
		}else{
			System.out.println(y+"��������");
		}
		
	}
}
