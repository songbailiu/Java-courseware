package lesson05;

public class Test05This {
	//this代表当前对象自身的引用,谁正在执行方法(实例方法或者构造函数) 就代表 谁
	//作用：1、区分形参与实例变量
	//2、把当前对象作为参数传递到其他的方法中
	
	//实例变量
	int i;//0
	
//	i = 100;//error类体不能单独写赋值语句
//	System.out.println("fdkfjdfjdfkjd");//error
	//if ... for ... error
	
	public Test05This() {
		System.out.println("Test05This()构造中   this="+this);
	}
	public Test05This(int i) {
		System.out.println("Test05This(int i)构造中   this="+this);
		//1、区分形参与实例变量
		this.i = i;
		
		
		//把当前的对象作为参数传递到 静态方法中
		testStaticFun(this);
		
		//StackOverflowError:当应用程序递归太深而发生堆栈溢出时，抛出该错误。
		//方法自己调用自己导致死循环  堆栈溢出
//		testStaticFun(new Test05This(1000));
	}
	
	
	public static void testStaticFun(Test05This object){
		System.out.println("静态方法 object="+object);
		
	}
	
	public void testFun(){
		System.out.println("实例方法 testFun() this="+this);
	}
	
	
	
	public static void main(String[] args) {
//		Test05This o1 = new Test05This();
//		System.out.println("o1="+o1);
//		o1.testFun();
		//this 代表o1
//		
//		System.out.println("------------------------");
//		Test05This o2 = new Test05This();
//		System.out.println("o2="+o2);
//		o2.testFun();
		//this 代表了   o2
		
		Test05This o3 = new Test05This(100);
		System.out.println("o3="+o3);
		System.out.println(o3.i);
		

	}

}
