class Test07 
{
	static int getMax(int a,int b){
		System.out.println("getMax(int a,int b)....");
		int max = a>b?a:b;

		return max;//return有返回值 当前方法的剩余语句全部被忽略
		//System.out.println("无法访问语句...");//error
	}

	public static void main(String[] args) 
	{
		//跳转关键字 return,break,continue
		//return 结束当前的方法的调用，[为方法执行返回值],方法中出现return后，方法剩余语句全部被忽略
		/*int a = 5;
		if(a==5){
			System.out.println("a==5");
			return;//结束当前方法执行，忽略方法中剩余语句
		}*/
		
		//int max = getMax(1,100);
		//System.out.println("max="+max);

		/*for(int i=0;i<=10;i++){
			System.out.println("i="+i);
			if(i==5){
				return;//剩余所有语句全部不执行
			}
		}*/
		
		
		//break:[用法一：终止case]；用法二：终止一层循环，程序控制权给了循环后面的语句
		/*for(int i=0;i<=10;i++){
			System.out.println("i="+i);
			if(i==5){
				break;//终止一层循环，程序控制权给了循环后面的语句
			}
		}*/

		//continue:封闭当次循环(忽略当次循环的剩余语句)，执行下一次循环
		/*System.out.println("======================");
		for(int i=0;i<=10;i++){			
			if(i==5){
				continue;//封闭当次循环(忽略当次循环的剩余语句)，执行下一次循环
			}
			System.out.println("i="+i);
		}*/


		//不同循环出现continue后的控制权机制问题
		//continue 出现for中，控制权给了增量部分
		//continue 出现while或者do..while 中，控制权给了条件判断部分
		for(int i=0;i<=10;i++){			
			if(i==5){
				continue;//控制权i++
			}
			System.out.println("i="+i);
		}

		System.out.println("***********************");
		int i=0;
		while(i<=10){
			if(i==5){
				continue;//while循环中，continue出现之后，控制权给条件判断
			}
			System.out.println("i="+i);
			i++;//出现continue之后，没有执行
		}


		System.out.println("main方法结束....");
	}
}
