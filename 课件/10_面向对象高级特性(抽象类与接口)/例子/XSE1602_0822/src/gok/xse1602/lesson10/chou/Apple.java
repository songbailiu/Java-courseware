package gok.xse1602.lesson10.chou;



public class Apple extends Fruit {
	//����̳г���ĸ���,ʵ�ָ���ĳ��󷽷�  ���߼̳а����ඨ��ɳ�����
	
	public Apple(String name) {
		super();
		//���ø���Ĵ���
		setName(name);
	}
	
	
	public static void main(String[] args) {
		//ʹ�ó�����:�� ��ת�Ͷ��� ʹ�ó�����
		
		Fruit fruit = new Apple("�츻ʿ");
		System.out.println(fruit.getName());
		
		fruit.eatFun();
		
		
		
		
	}

	
	//ע�� ��־  ��ǰ���ǴӸ�����д�õ���
	//jdk���뻷�� 1.5����
	@Override
	public void eatFun() {
		System.out.println(getName()+"��Ƥ ��  ����....");
		
	}
	
	

}
