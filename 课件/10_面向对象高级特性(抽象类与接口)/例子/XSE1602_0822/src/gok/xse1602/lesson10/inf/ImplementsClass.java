package gok.xse1602.lesson10.inf;

public class ImplementsClass implements Interface1 {
	// ��classʵ�ֽӿ�implements ���ӿ� ����д���,���Ÿ���

	@Override
	public void funA() {
		//������super ���ø��ӿ��еĶ���,super �����Ǹ���
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
		//����ת�Ͷ��� ����
		Interface1 interface1 = new ImplementsClass();
		interface1.funA();
		interface1.funB();
		int a = interface1.funD(100, 200);
		System.out.println(a);
		
		//�ӿ� �ײ㴦��ʱ  ���� Object ���ʹ���
		//����Object ��ط���
		System.out.println(interface1.toString());
		
	
		
		
		
	}

}
