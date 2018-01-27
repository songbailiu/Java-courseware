class Test05 
{
	public static void main(String[] args) 
	{
		//java唯一一个三目运算符，条件运算符
		//表达式1?表达式2:表达式3  要求：表达式1返回boolean,表达式2与表达式3 的数据类型一致
		int a = 1,b = 100,c = 1000;
		int max;
		max = a>b?a:b;
		System.out.println("max="+max);
		//等效于if...else
		/*if(a>b){
			max = a;
		}else{
			max = b;
		}*/

		//利用条件运算符求三者中的最大值
		max = a>b?(a>c?a:c) : (b>c?b:c);
		System.out.println("三者中最大值 max="+max);


	}
}
