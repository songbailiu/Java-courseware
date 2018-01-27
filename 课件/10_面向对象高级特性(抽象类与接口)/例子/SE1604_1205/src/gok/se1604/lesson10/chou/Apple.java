package gok.se1604.lesson10.chou;

public class Apple extends Fruit {	
	
	public Apple(String name) {
		setName(name);//复用 父类的方法
	}
	
	
	


	@Override
	public void eatFun() {
		System.out.println(" 削皮吃  很甜.....");
		
	}
	
	
	public static void main(String[] args) {
		//以上转型对象的形式 使用
		Fruit fruit = new Apple("红富士");
		System.out.println(fruit.getName());
		
		fruit.eatFun();
	}

}
