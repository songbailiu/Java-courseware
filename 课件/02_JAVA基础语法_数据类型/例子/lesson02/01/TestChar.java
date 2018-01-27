public class TestChar
{


	public static void main(String[] args){
		//定义赋值语句
		char c = 'a';
		//char c = 'b';//不能重复定义变量

		//System.out.println("c="+c);
		//赋值语句
		c = 'b';
		//方法调用语句
		//System.out.println("c="+c);
		//转义字符: 一'\'开始+特殊字符
		//System.out.println("\\="+'\\');
		//'只能一个字符'  \\必须结合 "\\\\" 字符串String
		//System.out.println("\\\\="+"\\\\");
		//\n换行  \t 缩进 \r回车 \b退格
		/*System.out.println("nn="+'\n'+"hn");
		System.out.println("tt="+'\t'+"ht");
		System.out.println("rr="+'\r'+"hr");//回车 光标到最开始位置
		System.out.println("bb="+'\b'+"hb");
*/
		//八进制的转义 \072
		char c8 = '\072';
		System.out.println("c8="+c8);
		//十六进制的转义 \和u+四位 \u003A
		char c16 = '\u003A';
		System.out.println("c16="+c16);

		//unicode码包括了全世界大部分国家的字符
		char chinese = '我';
		System.out.println("chinese="+chinese);
		//低----->高  隐式转换
		//byte, short, char  >  int > long >  float > double

		int sum = '我'+0;
		System.out.println("sum="+sum);

		





	
	
	}
}