package gok.se1604.inf;

public interface Interface1 extends Interface2,Interface3 {
	//接口是常量与抽象方法的集合
	//接口允许多重的继承：一个子接口可以同时继承多个父接口
	int COUNT = 100;//public static final int COUNT = 100;
	public void funA();//public abstract void funA();

}
