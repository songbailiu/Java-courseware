package lesson06;

/**
 * 探讨 类加载的过程
 * @author Li
 *
 */
public class Test01StaticClass {
	//类加载的时间点要 早于 对象创建的时间点
	// 类加载：发生在类第一次被虚拟机调用,类会被虚拟机加载,一般来说 类只被加载一次
	 //类加载要完成的操作：
	//1、初始化类变量；
	//2、分配类方法的函数入口(不是调用函数)；
	//3、执行静态块 static{}
	//备注:静态变量与静态块一般按照顺序定义
	
	
	
	

	//1、静态变量 也称为类变量
	static String staticVar = "静态变量";
	static{
		 //静态块：类被加载的时候执行的一个代码段,一般只被执行一次
		//作用:在类加载的时候，执行复杂的业务操作，执行一系列的代码段
		 System.out.println("静态块 被执行了。。。。类被加载了....");
		 
		 System.out.println("静态块中 staticVar="+staticVar);
		 
		 
		 //测试：调用静态函数
		 staticFun();
	 }
	
	
	static void staticFun(){
		System.out.println("静态方法staticFun()   staticVar="+staticVar);
		
	}
	
	
	static{
		 //静态块：类被加载的时候执行的一个代码段,一般只被执行一次
		//作用:在类加载的时候，执行复杂的业务操作，执行一系列的代码段
		 System.out.println("静态块 被执行了2。。。。类被加载了....");
	 }
	
	
	//构造函数
	public Test01StaticClass() {
		System.out.println("Test01StaticClass()构造函数...");
	}
	

	
	

	public static void main(String[] args) {
		System.out.println("main方法。。。。。");
		//cmd  控制台    java Test01StaticClass
		//执行程序后   类被加载到内存中   
		//虚拟机 会自动把该类的信息加载到内存中，一般虚拟机只自动加载一次
		
		
		//SUN 公司 JAVA创始公司  2009 被Oracle公司收购
		//SUN  java专业认证  SCJP    --> OCJP   300$
		//OCJD
		//......

	}

}
