package lesson06;

/**
 * 探讨对象创建 的初始化过程
 * 
 * @author Li
 * 
 */
public class Test02InitObject {
	// 对象创建 晚于类加载的时间
	// 对象创建要完成的操作:
	// 1、初始化实例变量；
	// 2、分配实例方法的函数入口；
	// 3、执行对象块{}；
	// 4、执行构造函数(super();剩余语句才是第四部分执行)

	// 1 实例变量
	String initVar = "实例变量";

	// 3对象块:每次创建对象的时候 都会执行一次
	{
		System.out.println("对象块   initVar=" + initVar + "  this=" + this);
		// initFun();
	}

	public Test02InitObject() {
		// [super():创建对象的时候最早执行的]
		// 4：除了super()执行父类的构造,当前构造函数的剩余语句
		//
		System.out.println("构造函数Test02InitObject()  initVar=" + initVar
				+ "  this=" + this);// 实例变量
		// initFun();
	}

	// 实例方法
	// 2分配实例方法的函数入口；
	public void initFun() {
		System.out.println("实例方法initFun() initVar=" + initVar);

	}

	public static void main(String[] args) {
		Test02InitObject object1 = new Test02InitObject();
		System.out.println("object1=" + object1);
		System.out.println("---------------------------");
		Test02InitObject object2 = new Test02InitObject();
		System.out.println("object2=" + object2);
	}

	// 类变量与实例变量的区别：
	// 一、 共享性:类变量被所有对象共享,即同一类的所有对象共享此类的类变量; 实例变量为每个对象独有; 操作自己的实例变量而不会影响其它对象
	// 二、初始化时间:类变量在类加载时分配内存的；实例变量在创建对象时分配内存的;
	// 三、消亡时间:类变量在程序退出时释放内存; 对象不存在实例变量就不存在了[对象什么时候消亡,变量的消亡时间]
	// 四、调用形式:类变量一般通过类名.来调用;实例变量通过对象.调用
	// 五、声明的形式:类变量static来声明,实例变量没有static声明

}
