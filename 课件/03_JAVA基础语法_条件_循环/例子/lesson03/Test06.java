class Test06 
{
	public static void main(String[] args) 
	{
		//for  
		for(int i=0;i<10;i++){
			System.out.println("i="+i);//i=1 \n
		}
		//for 1初始化可以省略,2可以省略(true),3部分可以省略，4增量部分也可以省略
		
		//死循环
		/*for(;;){
			System.out.println("================");
		}*/
		//死循环后面的语句是不可到达,不可以执行
		//System.out.println("main结束....");//无法访问的语句



		//while 循环
		int i = 1;
		while(i <= 10){
			System.out.print(i+",");
			i++;
		}
		System.out.println("  ");
		//do ... while 先执行一次循环的语句，再进行条件判断
		//至少要执行一次循环的语句
		do{
			System.out.println("do ...while ");
		}while(i != 11);
		

		//嵌套循环:语句中嵌入另一个循环
		/*for(int j=1;j<=5;j++){
			System.out.print("j="+j+" k=");
			for(int k=1;k<=5;k++){
				System.out.print(k+",");
			}
			System.out.println("  ");		
		}*/

		//输出九九乘法表效果
		//1*1=1
		//1*2=2 2*2=4
		//1*3=3 2*3=6 3*3=9
		//....
		//1*9=9 2*9=18 3*9=27....9*9=81
		System.out.println("======输出九九乘法表效果======");
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
				System.out.print(b+"*"+a+"="+a*b+"\t");
			}
			System.out.println();
		}



		
	}
}
