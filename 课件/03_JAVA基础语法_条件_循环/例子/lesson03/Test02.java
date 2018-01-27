class Test02 
{
	public static void main(String[] args) 
	{
		//if三种分支：if，if...else,if ...else if ... else if....else
		int a = 5;
		if(a==5){
			System.out.println("a==5");
		}

		//双分支
		if(a%2==0){
			System.out.println("a是偶数");
		}else{
			System.out.println("a是奇数");
		}

		//多分支:每一个分支语句之间是相互排斥的(当有一条件匹配后，其他语句全部忽略)
		if(a < 0){
			System.out.println("a<0");
		}else if(0<=a && a<10){
			System.out.println("0<=a && a<10");
		}else if(10 <= a && a < 100){
			System.out.println("10<=a && a<100");
		}else{
			System.out.println("a是其他情况...");
		}

		//else 与if匹配规则：与同一程序块中，距离else最近的if进行匹配（if没有被其他else匹配）
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
		//进行正确的嵌套后，程序代码可读性就很强了
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
