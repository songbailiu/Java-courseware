package lesson06;

/**
 * ̽�ֶ��󴴽� �ĳ�ʼ������
 * 
 * @author Li
 * 
 */
public class Test02InitObject {
	// ���󴴽� ��������ص�ʱ��
	// ���󴴽�Ҫ��ɵĲ���:
	// 1����ʼ��ʵ��������
	// 2������ʵ�������ĺ�����ڣ�
	// 3��ִ�ж����{}��
	// 4��ִ�й��캯��(super();ʣ�������ǵ��Ĳ���ִ��)

	// 1 ʵ������
	String initVar = "ʵ������";

	// 3�����:ÿ�δ��������ʱ�� ����ִ��һ��
	{
		System.out.println("�����   initVar=" + initVar + "  this=" + this);
		// initFun();
	}

	public Test02InitObject() {
		// [super():���������ʱ������ִ�е�]
		// 4������super()ִ�и���Ĺ���,��ǰ���캯����ʣ�����
		//
		System.out.println("���캯��Test02InitObject()  initVar=" + initVar
				+ "  this=" + this);// ʵ������
		// initFun();
	}

	// ʵ������
	// 2����ʵ�������ĺ�����ڣ�
	public void initFun() {
		System.out.println("ʵ������initFun() initVar=" + initVar);

	}

	public static void main(String[] args) {
		Test02InitObject object1 = new Test02InitObject();
		System.out.println("object1=" + object1);
		System.out.println("---------------------------");
		Test02InitObject object2 = new Test02InitObject();
		System.out.println("object2=" + object2);
	}

	// �������ʵ������������
	// һ�� ������:����������ж�����,��ͬһ������ж��������������; ʵ������Ϊÿ���������; �����Լ���ʵ������������Ӱ����������
	// ������ʼ��ʱ��:������������ʱ�����ڴ�ģ�ʵ�������ڴ�������ʱ�����ڴ��;
	// ��������ʱ��:������ڳ����˳�ʱ�ͷ��ڴ�; ���󲻴���ʵ�������Ͳ�������[����ʲôʱ������,����������ʱ��]
	// �ġ�������ʽ:�����һ��ͨ������.������;ʵ������ͨ������.����
	// �塢��������ʽ:�����static������,ʵ������û��static����

}
