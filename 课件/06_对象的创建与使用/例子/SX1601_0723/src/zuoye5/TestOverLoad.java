package zuoye5;
public class TestOverLoad {
	public static void main(String[] args) {
		Test test = new Test();
		//test.print(null);//ƥ�䲻��ȷ
		//String��StringBuffer����Object������
		//nullͬʱƥ�����ߣ�null�޷���������String��StringBuffer
		
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
