package lesson05;

public class Test02Var {
	//类体中的定义的变量分为:全局变量与局部变量
	//全局变量：定义在类体中的变量，在整个类中可以使用甚至类的外部都可以使用
	//分为静态变量(类变量) 和实例变量(实例成员变量)
	//类变量：static修饰,被共享,通过类名.变量名调用
	//实例变量:没有static修饰，被单个对象独有，通过对象.变量名调用
	
	//静态变量:在内存中存放在静态存储区，整个内存中只有一份数据
	static String country = "中国";
	//实例变量:被对象独有
	String name = "小强";
	
	
	
	
	//局部变量：定义在代码段中(方法体，if，for等等)的变量,使用之前必须手动初始化
	
	
	

	public static void main(String[] args) {
		//使用静态变量:类名.变量名
		System.out.println("Test02Var.country="+Test02Var.country);
		System.out.println("country="+country);//调用与类在一起，可以省略类名
		
		
		
		//创建对象的写法
		Test02Var object = new Test02Var();
		//实例变量：对象.变量名
		System.out.println("obejct.name="+object.name);
		object.name="旺财";
		System.out.println("obejct.name="+object.name);
		System.out.println("obejct="+object);
		Test02Var object2 = new Test02Var();
		System.out.println("obejct2="+object2);
		System.out.println("object2.name="+object2.name);
		System.out.println(object == object2);//false
		
		//静态的方法中 不能直接饮用非静态的变量
		//Cannot make a static reference to the non-static field Test02Var.name
//		System.out.println(Test02Var.name);//error
		
		
		
		//局部变量:使用之前必须手动初始化
		int i;
		i  = 10;
		System.out.println(i);
		
		
		
		
		//类变量：被共享的
		System.out.println("object.country="+object.country);
		System.out.println("object2.country="+object2.country);
		country = "USA";
		System.out.println("-----------修改静态变量后----------------");
		System.out.println("country="+country);
		System.out.println("object.country="+object.country);
		System.out.println("object2.country="+object2.country);
		
		
	}

}
