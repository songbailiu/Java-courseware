package zuoye3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		//��ѭ����˼·���2345678����������(����������)�����������
		
		//��̬����  Scanner  import java.util.Scanner;
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		//��ÿ���̨�������intֵ
		int n = scan.nextInt();
		
//		int n = 2345678;
		
		//2345678   0
		//234567	8
		//23456		87   8*10+7
		//2345		876  87*10+6
		//234		8765
		//23		87654
		//2			876543
		//0			8765432
		
		//�㷨һ�����������ʵ�ֵ���
		//t�ǵ���������
		int t = 0;
		int oldNum = n;		
		while(n!=0){
			int g = n%10;//7
			t = t*10+g;//80+7
			n = n/10;//23456			
		}
		System.out.println(oldNum +" �����-->"+t);
		
		
		//�㷨��:java �ַ���������ʵ��(�˽�)
		//int --> String
		String str = oldNum+"";//"2345678"
		//String --> StringBuffer
		StringBuffer sb = new StringBuffer(str);
		//����  ������� ֻ��StringBuffer����
		sb.reverse();//"8765432"
		//StringBuffer--> String 
		String newStr = sb.toString();
		//String --> int 
		int newNum = Integer.parseInt(newStr);
		
		System.out.println(oldNum +" �����-->"+newNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
