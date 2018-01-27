package gok.se1604.lesson10.chou;

public abstract class Fruit {
	//抽象类：一般提供一种父类的形式，不能直接实例化，必须被子类继承。
	//java中所有的对象都是由类来描述的
	//并不一定是所有的类都有足够丰富的信息来描述对象
	private String name;
	
	
	//定义抽象方法：父类本身实现没有意义，必须要强制 子类实现的方法，就可以定义成抽象方法
	//定义了抽象方法的类 必须是抽象类，但是抽象类中可以没有抽象方法
	//抽象方法只能有方法定义语句，不能有方法的实现(方法体{})
	public abstract void eatFun();
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
//		抽象的概念 具体化没有意义  抽象类不能直接实例化
//		Fruit fruit = new Fruit();
		
		
		
	}
	
	
	
	
	
	
	

}
