
/**
 * 这是一个测试类
 * @author lilong
 *
 */
public class TestDoc {
	//javadoc java文件名
	//javadoc TestDoc.java

	/**
	 * 这是一个主函数
	 * @param args
	 */
	public static void main(String[] args) {
		//标识符：作用给类名、方法名、变量名、包名取名字的符号
		//全世界大部分国家的字母、数字、下划线_、美元符号$任意组合，但不能是数字开头
		//
		int i = 0x1f;
		//int 0x1f = 99;//error为了避免歧义，不能以数字
		int $a = 100;
		int userAge =20;
		int 中文 = 100;//可以写，但不推荐
		String user_name = "小强";//字符串		
		System.out.println("i="+i);
		System.out.println("$a="+$a);
		System.out.println("userAge="+userAge);
		System.out.println("中文="+中文);
		System.out.println("user_name="+user_name);
		
		//java采用unicode码  采用双字节(1字节=8bit) 范围比单字节ASCII(美国编码)
		//0-65535  总共65536个字符 计算机底层对应一个数值
		//每一个字符 都对应一个数值(unicode码)
		//a --> 97
		//b-->98
		//A-->65
		//B-->66
		//我 --> 
		char c = '我';
		char a = 'a';
		//字符 转换成整数 对应一个unicode码值
		int ci = c;
		int ai = a;
		//java中：任何的变量与字符串"内容"+运算都 是字符串拼接 得到一个新的字符串
		System.out.println(c+"="+ci);//我=25105
		System.out.println(a+"="+ai);//a=97
		
		
		//关键字：有特殊用处和语义关键词 ，不能用来取名字
		//class，public，static，void，return，int等等
		//两个保留词:goto，const 目前java的版本没有使用这两个关键字
		//后续更高级的版本会使用，程序员不能使用
		
	//	int boolean = 100;//error 无效的变量定义
		//int class = 100;/error
		
		int ii = 100;
		boolean boolean1 = false;
		boolean boolean2 = true;
		System.out.println("boolean1="+boolean1);
		System.out.println("boolean2="+boolean2);
		
		//变量定义 
		char x = 'x';
		System.out.println("x="+x);
		x = 'f';
		System.out.println("x="+x);
		
		//内存：方法临时区、堆区(new对象内存区域)、栈区(stack,常量值),寄存器，本地方法区
		//方法里定义的变量  存在方法临时区
		//以多少空间存放数据,比特位,二进制补码的形式存放
		//byte 8位  00000000   例如8  --> 00001000
		//int i8 = 8  int对应4个字节 32bit 00000000000000000000000000001000
		
		//java数据类型分两大类:
		//一、基本数据类型(重点讨论 8大基本数据类型)
		//二、复合数据类型(引用数据类型,考虑内存地址,引用地址)
		//类类型、数组类型、接口类型、枚举类型、注解类型等等
		
		//一、八大基本数据类型
		//1、整型(byte,char,int,long)
		//2、浮点型（float，double）
		//3、布尔类型(boolean)
		//4、字符型(char)
		//数据类型	   字节数	  所占位数				数的范围	
//		 boolean     1  	   8				true,false
//		 char		 2	       16				0 ～65535
//		 byte		 1 	       8				-27～27-1
//		 short		 2	       16				-215～215-1	
//		 int		 4 	       32				-231～231-1	
//		 long	     8 	       64				-263～263-1	
//		 float	     4	       32	   	   		3.4e－038 ～3.4e＋038
//		 double	     8	       64	        	1.7e－308 ～1.7e＋308

		//十进制、二进制、八进制、十六进制换算
		//平时 数字十进制:88,79,69,101
		//每一位上的数字:0-9
		//69 --> 9*10^0+6*10^1
		//二进制:0~1   8 --> 00001000 ==> 1*2^3+0*2^2+0*2^1+0*2^0
		//十进制换算成二进制   00001000
		// 8 /2  --> 0
		// 4 /2  --> 0
		// 2 /2  --> 0
		// 1/2   --> 1
		// 0
		
		//八进制: 以0开头,每一位上0-7
		//031 -->  25   --> 031
		//25  /8 -->1
		//3   /8 -->3
		//0
		//求 八进制075 的十进制的值 = 61
				
		//十六进制 : 以0x或者0X开头, 0-9,10-15(a-f)
		//0x7f  -->15*16^0+7*16^1 ==>  127
		
		//27的十六进制  0x1b
		//27 /16 余11  11用b表示
		//1  /16 余1
		//0
		
		//原码 ： 正数的原码就是补码
		//补码: 实际存在计算机底层的编码格式,负数的补码 是绝对值的原码按位取反 再加1
		//8  的补码  00001000
		//-8补码 
		//8的补码  00001000
		//按位取反11110111
		//+1    00000001
		//=     11111000  就是-8的补码
		//第二种算法：8 -1 的原码7  00000111
		//按位取反			   11111000

	}

}
