package gok.se1604.inf;

public class ImplementsClass implements Interface1{
	//implements ��ʵ�ֽӿڵĹؼ���
	//һ������Ҳ����ͬʱʵ�ֶ�����ӿ� ������ʵ�ָ��ӿڵ����еĳ��󷽷�
	@Override
	public void funA() {
		System.out.println("funA()"); 
		//super ��ʾ��ǰ����ĸ������  ������ӿ�
//		System.out.println(super.COUNT);//error
		System.out.println(COUNT);
		System.out.println(Interface1.COUNT);
		
	}
	
	@Override
	public void funB() {
		System.out.println("funB()"); 
		
	}

	@Override
	public void funC() {
		System.out.println("funC()"); 
		
	}

	@Override
	public void funD() {
		// TODO Auto-generated method stub
		System.out.println("funD()"); 
	}
	
	public static void main(String[] args) {
		//ʹ�ýӿ� ����ת�Ͷ������ʽ����
		Interface1 interface1 = new ImplementsClass();
		interface1.funA();
		interface1.funB();
		
		Interface2 interface2 = interface1;
		interface2.funB();
		interface2.funC();
		
		
	}

	

}
