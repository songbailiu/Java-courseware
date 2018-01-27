package gok.se1604.inf;

public class TestMain {

	public static void main(String[] args) {
		// 相同点：
		// 都必须通过其它类实现才能使用;
		// 不能直接实例化
		//
		// 不同点：
		// 抽象类是类，其中可包含变量及(抽象)方法的定义;
		// 接口实质并不类，其中只包含类常量及抽象方法的定义;
		// 类只能单一继承，接口允许多重继承
		// 接口中只能有public修饰符，类可以是任何修饰符
		// 设计模式讲：继承强调是一种的关系 is-a
		// 接口：强调功能具有 has - a
		
		//何时使用接口 何时使用类
		//存在继承关系  用类 
		//强调功能的相似，一般用接口
		
		
		FlyInf flyObject = new BlackBird("乌鸦");
		flyObject.fly();
		
		flyObject = new AirPlane();
		
		flyObject.fly();

	}

}
