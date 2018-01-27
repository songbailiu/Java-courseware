package lesson05;

public class Test04Constructor {
	// 构造方法特点：1、如果没有定义构造方法，系统会默认添加 缺省的构造方法(无参空实现的构造方法)
	// 当程序自己定义了构造方法的时候，无参的构造就消失。

	public Test04Constructor() {
		System.out.println("Test04Constructor()构造函数....");
	}

	public Test04Constructor(int i) {
		System.out.println("Test04Constructor(int i)构造函数....");
	}

	// 方法重载:指同一个类内多个方法可以享有相同的名字,但是这些方法的参数列表必须不同(参数个数不同,参数类型不同,参数顺序不同)。
	public void speak(String content) {
		System.out.println("speak(String content)...");
	}

	public void speak(String language,int i) {
		System.out.println("speak(String language,int i)...");
	}
	
	public void speak(int a) {
		System.out.println("speak(int a)...");
	}

	//error:重载与返回值无关
//	public int speak(int a) {
//		System.out.println("speak(int a)...");
//	}

	public static void main(String[] args) {
		// 匹配的无参的构造
		Test04Constructor o = new Test04Constructor();

		// 匹配 int的参数的构造
		Test04Constructor o2 = new Test04Constructor(100);

		o2.speak(100);
		o2.speak("hfdkfdfk");
		o2.speak("fdjfkdjfd", 100);
		
		
		
		
	}

}
