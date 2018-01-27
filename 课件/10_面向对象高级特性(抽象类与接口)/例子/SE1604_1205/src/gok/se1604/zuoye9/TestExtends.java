package gok.se1604.zuoye9;

public class TestExtends {
	public static void main(String[] args) {
		new Sub();
		
//		new Supper();
	}

}

class Supper {
	int i = 10;
	int[] arr = new int[2];
	public Supper() {
		System.out.println("Supper()  this="+this);
		print();//实例方法，当父类的实例方法被子类重写后，创建子类对象的时候，
		//在父类的构造函数中调用改方法就一定是子类重写后的
		//实例方法采用动态绑定机制 根据具体引用的实体来决定实例方法的调用
		i = 20;
	}
	public void print() {
		System.out.println("Supper==="+i);
	}
}

class Sub extends Supper {
	int i = 30;//隐藏了父类的变量i 发生在编译阶段
	int[] arr = new int[2];//{0,0}  数组中的默认值0 在程序运行期间得到
	public Sub() {
		super();
		System.out.println("Sub()  this="+this);
		print();//Sub===30
		super.print();//Supper===20
		i = 40;
	}

	public void print() {
		System.out.println("Sub==="+i);
		System.out.println("Sub===arr="+arr);
	}
}

