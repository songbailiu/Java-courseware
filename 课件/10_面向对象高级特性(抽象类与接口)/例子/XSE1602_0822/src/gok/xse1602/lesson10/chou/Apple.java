package gok.xse1602.lesson10.chou;



public class Apple extends Fruit {
	//子类继承抽象的父类,实现父类的抽象方法  或者继承把子类定义成抽象类
	
	public Apple(String name) {
		super();
		//复用父类的代码
		setName(name);
	}
	
	
	public static void main(String[] args) {
		//使用抽象类:以 上转型对象 使用抽象类
		
		Fruit fruit = new Apple("红富士");
		System.out.println(fruit.getName());
		
		fruit.eatFun();
		
		
		
		
	}

	
	//注解 标志  当前放是从父类重写得到的
	//jdk编译环境 1.5以上
	@Override
	public void eatFun() {
		System.out.println(getName()+"削皮 吃  很甜....");
		
	}
	
	

}
