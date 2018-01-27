package gok.xse1602.lesson10.inf;

public class ImplementsClass implements Interface1 {
	// 类class实现接口implements 父接口 可以写多个,逗号隔开

	@Override
	public void funA() {
		//不能用super 调用父接口中的东西,super 代表是父类
		//System.out.println(super.COUNT);//error
		System.out.println(COUNT);
		System.out.println(Interface1.COUNT);
		System.out.println("ImplementsClass funA()...");

	}

	@Override
	public void funB() {
		System.out.println("ImplementsClass funB()...");

	}

	@Override
	public void funC() {
		System.out.println("ImplementsClass funC()...");

	}

	@Override
	public int funD(int a, int b) {
		// TODO Auto-generated method stub
		return a > b ? a : b;
	}

	@Override
	public void funE() {
		System.out.println("ImplementsClass funE()...");

	}
	
	public static void main(String[] args) {
		//以上转型对象 调用
		Interface1 interface1 = new ImplementsClass();
		interface1.funA();
		interface1.funB();
		int a = interface1.funD(100, 200);
		System.out.println(a);
		
		//接口 底层处理时  当作 Object 类型处理
		//沿用Object 相关方法
		System.out.println(interface1.toString());
		
	
		
		
		
	}

}
