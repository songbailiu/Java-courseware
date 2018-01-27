package lesson05;

public class Test03Function {
	//按照功能划分:
	//实例方法：没有static修饰,通过对象.方法名()
	//类方法（静态方法）:static修饰，通用类名.方法名()调用
	//构造方法(构造器或者构造函数)：1、没有返回值那一栏;2、必须与类名同名
	//作用： 在创建对象的时候调用构造方法 进行数据的初始化
	public Test03Function() {
		System.out.println("构造方法Test03Function()");
	}
	
	
	//实例方法
	public void initFun(){
		System.out.println("实例方法 没有返回值");
	}
	public int getMax(int a,int b){
		System.out.println(" getMax(int a,int b)");
		return a>b?a:b;
	}
	
	
//	/静态方法,类方法
	public static void staticFun(){
		System.out.println("静态方法staticFun()....");
	}

	public static void main(String[] args) {
		//方法 只有明确调用才会执行
		//静态方法：类名.方法名
		Test03Function.staticFun();
		staticFun();//省略类名
		
		//构造方法:new  构造函数()
		Test03Function o = new Test03Function();
		//实例方法:对象.方法名
		o.initFun();
		int max = o.getMax(1, 100);
		System.out.println("max="+max);
		
		
		
		System.out.println("main结束.....");

	}

}
