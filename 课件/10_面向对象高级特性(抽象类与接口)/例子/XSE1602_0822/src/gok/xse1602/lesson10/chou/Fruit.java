package gok.xse1602.lesson10.chou;

/**
 * 抽象类
 * @author Li
 *
 */
public abstract class Fruit {
	// 抽象类 作为一个父类定义一个通用行为,然后让子类分别实现
	// 一般必须被继承，不能直接实例化(new + 构造函数())
	
	
	public Fruit() {
		System.out.println("Fruit() ...");
	}
	
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 抽象方法:用abstract修饰的方法为抽象方法
	// 只能有方法的定义，不能有方法体({})
	// 抽象方法 必须被子类重写
	// 抽象方法 必须在抽象类中,[抽象类中可以有抽象方法也可以没有抽象方法]
	public abstract void eatFun();

	public static void main(String[] args) {
		// 不能直接实例化
		// Fruit fruit = new Fruit();//error

	}

}
