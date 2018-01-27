package lesson06;

public class Test03SystemGC {
	// 对象消亡： 虚拟机进行垃圾回收
	// 内存释放
	// Java使用自动的处理重新分配内存的方法,
	//即垃圾回收机制：当一个对象的引用不存在，则该对象被认为是不再需要的，
	//它所占有的内存会被释放掉。
	// JAVA自动回收垃圾，不需要开发人员自己控制。
	// 如果想强制垃圾回收，可以调用[测试垃圾回收]
	// System.gc();
	
	//回收当前程序中所有空闲对象 ，隐式调用对象的finalize()
	// 重写  来自Object父类的finalize() 
	
	public Test03SystemGC() {
		System.out.println("Test03SystemGC() this="+this);
	}
	
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize()对象被回收了 this"+this);
	}

	public static void main(String[] args) {
		//o1 是定义在main方法中的一个局部变量，在main方法执行完毕之后才消亡
		Test03SystemGC o1 = new Test03SystemGC();
		Test03SystemGC o2 = new Test03SystemGC();
		Test03SystemGC o3= new Test03SystemGC();
		Test03SystemGC o4= new Test03SystemGC();
		o1 = null;//o1 原来的实体 处于空闲状态
		o2 = null;
		o3 = null;
		o4 = null;
		//强制回收垃圾
		System.gc();
		
		
		

	}

}
