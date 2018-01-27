package zuoye5;
public class TestOverLoad {
	public static void main(String[] args) {
		Test test = new Test();
		//test.print(null);//匹配不明确
		//String与StringBuffer都是Object的子类
		//null同时匹配三者，null无法具体区分String与StringBuffer
		
		Object o = new Object();
		test.print(new Object());
		test.print("String");
		test.print(new StringBuffer("fdjfkdjfkd"));
		
		
		
	}
}

class Test {
	public void print(String some) {
		System.out.println("String version print");
	}

	public void print(Object some) {
		System.out.println("Object version print");
	}

	public void print(StringBuffer some) {
		System.out.println("StringBuffer version print");
	}
}
