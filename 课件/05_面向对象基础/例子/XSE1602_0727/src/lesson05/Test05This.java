package lesson05;

public class Test05This {
	//this����ǰ�������������,˭����ִ�з���(ʵ���������߹��캯��) �ʹ��� ˭
	//���ã�1�������β���ʵ������
	//2���ѵ�ǰ������Ϊ�������ݵ������ķ�����
	
	//ʵ������
	int i;//0
	
//	i = 100;//error���岻�ܵ���д��ֵ���
//	System.out.println("fdkfjdfjdfkjd");//error
	//if ... for ... error
	
	public Test05This() {
		System.out.println("Test05This()������   this="+this);
	}
	public Test05This(int i) {
		System.out.println("Test05This(int i)������   this="+this);
		//1�������β���ʵ������
		this.i = i;
		
		
		//�ѵ�ǰ�Ķ�����Ϊ�������ݵ� ��̬������
		testStaticFun(this);
		
		//StackOverflowError:��Ӧ�ó���ݹ�̫���������ջ���ʱ���׳��ô���
		//�����Լ������Լ�������ѭ��  ��ջ���
//		testStaticFun(new Test05This(1000));
	}
	
	
	public static void testStaticFun(Test05This object){
		System.out.println("��̬���� object="+object);
		
	}
	
	public void testFun(){
		System.out.println("ʵ������ testFun() this="+this);
	}
	
	
	
	public static void main(String[] args) {
//		Test05This o1 = new Test05This();
//		System.out.println("o1="+o1);
//		o1.testFun();
		//this ����o1
//		
//		System.out.println("------------------------");
//		Test05This o2 = new Test05This();
//		System.out.println("o2="+o2);
//		o2.testFun();
		//this ������   o2
		
		Test05This o3 = new Test05This(100);
		System.out.println("o3="+o3);
		System.out.println(o3.i);
		

	}

}
