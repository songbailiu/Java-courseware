public class TestCast
{
	//强制类型转换
	//当指定值超过了变量类型的精度时会出现溢出 
	//编译会报错

	//强制类型转换
	//type i= (type)a; 

	public static void main(String[] args){
		byte b = 127;//-128~127
		byte b1 = (byte)129;
		int fi = (int)99.99f;
		
		System.out.println("b="+b);
		System.out.println("b1="+b1);
		System.out.println("fi="+fi);


		char c = '哈';
		int ci = c;
		System.out.println(c+"="+ci);



	
	
	}
}