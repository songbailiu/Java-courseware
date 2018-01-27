package gok.se1604.inf;

public class ImplementsClass implements Interface1{
	//implements 类实现接口的关键字
	//一个子类也可以同时实现多个父接口 ，必须实现父接口的所有的抽象方法
	@Override
	public void funA() {
		System.out.println("funA()"); 
		//super 表示当前子类的父类对象  不代表接口
//		System.out.println(super.COUNT);//error
		System.out.println(COUNT);
		System.out.println(Interface1.COUNT);
		
	}
	
	@Override
	public void funB() {
		System.out.println("funB()"); 
		
	}

	@Override
	public void funC() {
		System.out.println("funC()"); 
		
	}

	@Override
	public void funD() {
		// TODO Auto-generated method stub
		System.out.println("funD()"); 
	}
	
	public static void main(String[] args) {
		//使用接口 以上转型对象的形式调用
		Interface1 interface1 = new ImplementsClass();
		interface1.funA();
		interface1.funB();
		
		Interface2 interface2 = interface1;
		interface2.funB();
		interface2.funC();
		
		
	}

	

}
