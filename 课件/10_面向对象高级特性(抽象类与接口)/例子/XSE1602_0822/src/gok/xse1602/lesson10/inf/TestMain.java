package gok.xse1602.lesson10.inf;

public class TestMain {

	public static void main(String[] args) {
		Bird bird = new BlackBird("��ѻ");
		FlyInterface flyInterface = bird;
		flyInterface.fly();

		flyInterface = new AirPlane();
		flyInterface.fly();

		// �ӿ�����������ͬ�� �벻ͬ��
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

	}

}
