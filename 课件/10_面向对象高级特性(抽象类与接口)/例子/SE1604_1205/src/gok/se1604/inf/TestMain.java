package gok.se1604.inf;

public class TestMain {

	public static void main(String[] args) {
		// ��ͬ�㣺
		// ������ͨ��������ʵ�ֲ���ʹ��;
		// ����ֱ��ʵ����
		//
		// ��ͬ�㣺
		// ���������࣬���пɰ���������(����)�����Ķ���;
		// �ӿ�ʵ�ʲ����࣬����ֻ�����ೣ�������󷽷��Ķ���;
		// ��ֻ�ܵ�һ�̳У��ӿ�������ؼ̳�
		// �ӿ���ֻ����public���η�����������κ����η�
		// ���ģʽ�����̳�ǿ����һ�ֵĹ�ϵ is-a
		// �ӿڣ�ǿ�����ܾ��� has - a
		
		//��ʱʹ�ýӿ� ��ʱʹ����
		//���ڼ̳й�ϵ  ���� 
		//ǿ�����ܵ����ƣ�һ���ýӿ�
		
		
		FlyInf flyObject = new BlackBird("��ѻ");
		flyObject.fly();
		
		flyObject = new AirPlane();
		
		flyObject.fly();

	}

}
