package gok.xse1602.zuoye09;

public class TestExtends {
	public static void main(String[] args) {
		new Sub();//��ǰ������������Sub����,ʵ����������������һ��
		
//		new Supper();
	}

}

class Supper {
	int i = 10;
	int[] arr = new int[2];
	public Supper() {
		super();//Object()
		System.out.println("Supper()����  this="+this);
		print();//ʵ������ ��������д��,������������������ʱ��
		//�ڸ���Ĺ����е��ø�ʵ������ һ����ʶ������д��ķ���
		i = 20;
	}

	public void print() {
		System.out.println("Supper===" + i);
	}
}

class Sub extends Supper {
	//�������� �����ڱ����ڼ�
	int i = 30;
	int[] arr = new int[2];//�����е�Ԫ��0 �������ڼ��� Ĭ�ϳ�ʼֵ
	public Sub() {
		super();//new Supper();����һ���µĸ������ ��ֱ�ӵ���super()��˼��һ��
		System.out.println("Sub()����  this="+this);
		print();//this.print()
		super.print();
		i = 40;
	}

	public void print() {
		System.out.println("Sub===" + i);
		System.out.println("Sub=== arr=" + arr);
	}
}
