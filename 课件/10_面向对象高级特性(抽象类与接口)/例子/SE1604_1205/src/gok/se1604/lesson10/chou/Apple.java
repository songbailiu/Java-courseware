package gok.se1604.lesson10.chou;

public class Apple extends Fruit {	
	
	public Apple(String name) {
		setName(name);//���� ����ķ���
	}
	
	
	


	@Override
	public void eatFun() {
		System.out.println(" ��Ƥ��  ����.....");
		
	}
	
	
	public static void main(String[] args) {
		//����ת�Ͷ������ʽ ʹ��
		Fruit fruit = new Apple("�츻ʿ");
		System.out.println(fruit.getName());
		
		fruit.eatFun();
	}

}
