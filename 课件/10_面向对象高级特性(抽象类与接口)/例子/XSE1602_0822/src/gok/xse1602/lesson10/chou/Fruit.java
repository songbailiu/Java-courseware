package gok.xse1602.lesson10.chou;

/**
 * ������
 * @author Li
 *
 */
public abstract class Fruit {
	// ������ ��Ϊһ�����ඨ��һ��ͨ����Ϊ,Ȼ��������ֱ�ʵ��
	// һ����뱻�̳У�����ֱ��ʵ����(new + ���캯��())
	
	
	public Fruit() {
		System.out.println("Fruit() ...");
	}
	
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ���󷽷�:��abstract���εķ���Ϊ���󷽷�
	// ֻ���з����Ķ��壬�����з�����({})
	// ���󷽷� ���뱻������д
	// ���󷽷� �����ڳ�������,[�������п����г��󷽷�Ҳ����û�г��󷽷�]
	public abstract void eatFun();

	public static void main(String[] args) {
		// ����ֱ��ʵ����
		// Fruit fruit = new Fruit();//error

	}

}
