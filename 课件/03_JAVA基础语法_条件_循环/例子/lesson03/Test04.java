class Test04 
{
	public static void main(String[] args) 
	{
		//switch ...case 匹配具体的值的一个分支语句
		//case 语句中 直到遇到break才终止case语句的执行

		/*int i = 1;
		switch(i){
			case 1 :
				System.out.println("i==1");
				//break;
			case 2 :
				System.out.println("i==2");
				//break;
			case 3 :
				System.out.println("i==3");
				//break;
			case 4 :
				System.out.println("i==4");
				break;
			case 5 :
				System.out.println("i==5");
				break;
			default:
				System.out.println("default.....");
				break;		
		}*/


		int i = 6;
		switch(i){
			default:
				System.out.println("default.....");
				//break;	
			case 1 :
				System.out.println("i==1");
				//break;
			case 2 :
				System.out.println("i==2");
				//break;
			case 3 :
				System.out.println("i==3");
				//break;
			case 4 :
				System.out.println("i==4");
				break;
			case 5 :
				System.out.println("i==5");
				break;
				
		}
		//case 寻找一个切入点开始从上往下开始执行，直到遇到break才终止




	}
}
