//类定义之前导入系统包 java.lang包下面的所有的系统类，默认都会被java虚拟机装载,例如String,System等
import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		//闰年 必须是4的倍数，但不能是100的倍数，或者是400的倍数
		//400年中计算4,8,12,16........4的倍数
		//如果是100 倍数 100,200,300 取消闰年
		//400是闰年
		
		//获得屏幕的动态输入内容 工具类扫描仪Scanner
		Scanner scanner = new Scanner(System.in);
		//获得屏幕输入的整数int
		System.out.println("请输入一个整数,请回车:");
		int y = scanner.nextInt();

		//int y = 2000;
		if(y%4 == 0){
			if(y%100 == 0){
				if(y%400==0){
					System.out.println(y+"是闰年");
				}else{
					System.out.println(y+"不是闰年");				
				}			
			}else{
				//4,8,12,16 
				System.out.println(y+"是闰年");
			}
		}else{
			System.out.println(y+"不是闰年");
		}
		
		
		//算法二:逻辑运算符实现
		if(y % 4 == 0 && y%100 != 0 || y % 400 == 0){
			System.out.println(y+"是闰年");
		}else{
			System.out.println(y+"不是闰年");
		}
		
	}
}
