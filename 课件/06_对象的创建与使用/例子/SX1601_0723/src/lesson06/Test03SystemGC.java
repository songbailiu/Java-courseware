package lesson06;

public class Test03SystemGC {
	// ���������� �����������������
	// �ڴ��ͷ�
	// Javaʹ���Զ��Ĵ������·����ڴ�ķ���,
	//���������ջ��ƣ���һ����������ò����ڣ���ö�����Ϊ�ǲ�����Ҫ�ģ�
	//����ռ�е��ڴ�ᱻ�ͷŵ���
	// JAVA�Զ���������������Ҫ������Ա�Լ����ơ�
	// �����ǿ���������գ����Ե���[������������]
	// System.gc();
	
	//���յ�ǰ���������п��ж��� ����ʽ���ö����finalize()
	// ��д  ����Object�����finalize() 
	
	public Test03SystemGC() {
		System.out.println("Test03SystemGC() this="+this);
	}
	
	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize()���󱻻����� this"+this);
	}

	public static void main(String[] args) {
		//o1 �Ƕ�����main�����е�һ���ֲ���������main����ִ�����֮�������
		Test03SystemGC o1 = new Test03SystemGC();
		Test03SystemGC o2 = new Test03SystemGC();
		Test03SystemGC o3= new Test03SystemGC();
		Test03SystemGC o4= new Test03SystemGC();
		o1 = null;//o1 ԭ����ʵ�� ���ڿ���״̬
		o2 = null;
		o3 = null;
		o4 = null;
		//ǿ�ƻ�������
		System.gc();
		
		
		

	}

}
