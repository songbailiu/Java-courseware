package gok.se1604.zuoye9;

public class TestExtends {
	public static void main(String[] args) {
		new Sub();
		
//		new Supper();
	}

}

class Supper {
	int i = 10;
	int[] arr = new int[2];
	public Supper() {
		System.out.println("Supper()  this="+this);
		print();//ʵ���������������ʵ��������������д�󣬴�����������ʱ��
		//�ڸ���Ĺ��캯���е��øķ�����һ����������д���
		//ʵ���������ö�̬�󶨻��� ���ݾ������õ�ʵ��������ʵ�������ĵ���
		i = 20;
	}
	public void print() {
		System.out.println("Supper==="+i);
	}
}

class Sub extends Supper {
	int i = 30;//�����˸���ı���i �����ڱ���׶�
	int[] arr = new int[2];//{0,0}  �����е�Ĭ��ֵ0 �ڳ��������ڼ�õ�
	public Sub() {
		super();
		System.out.println("Sub()  this="+this);
		print();//Sub===30
		super.print();//Supper===20
		i = 40;
	}

	public void print() {
		System.out.println("Sub==="+i);
		System.out.println("Sub===arr="+arr);
	}
}

