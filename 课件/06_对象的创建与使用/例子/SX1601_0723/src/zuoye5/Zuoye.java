package zuoye5;
public class Zuoye {

	public static void main(String[] args) {
		// String --> int
		//�����쳣
		try {
			int i = Integer.parseInt("77yuyuyu");// "����"
			System.out.println(i);
		} catch (Exception e) {
			// e �����쳣����Ĳ���  ������ֻ��catch����ڲ�
			e.printStackTrace();
			System.out.println("�����쳣��....");

		}
//		System.out.println(e);//error

		System.out.println("main��������.....");

	}

}
