class Test06 
{
	public static void main(String[] args) 
	{
		//for  
		for(int i=0;i<10;i++){
			System.out.println("i="+i);//i=1 \n
		}
		//for 1��ʼ������ʡ��,2����ʡ��(true),3���ֿ���ʡ�ԣ�4��������Ҳ����ʡ��
		
		//��ѭ��
		/*for(;;){
			System.out.println("================");
		}*/
		//��ѭ�����������ǲ��ɵ���,������ִ��
		//System.out.println("main����....");//�޷����ʵ����



		//while ѭ��
		int i = 1;
		while(i <= 10){
			System.out.print(i+",");
			i++;
		}
		System.out.println("  ");
		//do ... while ��ִ��һ��ѭ������䣬�ٽ��������ж�
		//����Ҫִ��һ��ѭ�������
		do{
			System.out.println("do ...while ");
		}while(i != 11);
		

		//Ƕ��ѭ��:�����Ƕ����һ��ѭ��
		/*for(int j=1;j<=5;j++){
			System.out.print("j="+j+" k=");
			for(int k=1;k<=5;k++){
				System.out.print(k+",");
			}
			System.out.println("  ");		
		}*/

		//����žų˷���Ч��
		//1*1=1
		//1*2=2 2*2=4
		//1*3=3 2*3=6 3*3=9
		//....
		//1*9=9 2*9=18 3*9=27....9*9=81
		System.out.println("======����žų˷���Ч��======");
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
				System.out.print(b+"*"+a+"="+a*b+"\t");
			}
			System.out.println();
		}



		
	}
}
