package lesson05;

public class Test04Constructor {
	// ���췽���ص㣺1�����û�ж��幹�췽����ϵͳ��Ĭ����� ȱʡ�Ĺ��췽��(�޲ο�ʵ�ֵĹ��췽��)
	// �������Լ������˹��췽����ʱ���޲εĹ������ʧ��

	public Test04Constructor() {
		System.out.println("Test04Constructor()���캯��....");
	}

	public Test04Constructor(int i) {
		System.out.println("Test04Constructor(int i)���캯��....");
	}

	// ��������:ָͬһ�����ڶ����������������ͬ������,������Щ�����Ĳ����б���벻ͬ(����������ͬ,�������Ͳ�ͬ,����˳��ͬ)��
	public void speak(String content) {
		System.out.println("speak(String content)...");
	}

	public void speak(String language,int i) {
		System.out.println("speak(String language,int i)...");
	}
	
	public void speak(int a) {
		System.out.println("speak(int a)...");
	}

	//error:�����뷵��ֵ�޹�
//	public int speak(int a) {
//		System.out.println("speak(int a)...");
//	}

	public static void main(String[] args) {
		// ƥ����޲εĹ���
		Test04Constructor o = new Test04Constructor();

		// ƥ�� int�Ĳ����Ĺ���
		Test04Constructor o2 = new Test04Constructor(100);

		o2.speak(100);
		o2.speak("hfdkfdfk");
		o2.speak("fdjfkdjfd", 100);
		
		
		
		
	}

}
