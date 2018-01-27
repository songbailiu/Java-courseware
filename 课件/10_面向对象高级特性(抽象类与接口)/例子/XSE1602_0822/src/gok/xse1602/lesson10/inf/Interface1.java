package gok.xse1602.lesson10.inf;

public interface Interface1 extends Interface2,Interface3{
	// 接口中只能有抽象方法和常量的集合
	//抽象类的语法非常相似:不能直接实例化，必须被子类实现
	//接口允许多继承，同时继承多个父接口
	int COUNT = 100;// public static final int COUNT = 100;

	void funA();// public abstract void funA();
	
	public void funB();

}
