package gok.xse1602.zuoye09;

public class TestExtends {
	public static void main(String[] args) {
		new Sub();//当前创建的是子类Sub对象,实例方法都与对象绑定在一起
		
//		new Supper();
	}

}

class Supper {
	int i = 10;
	int[] arr = new int[2];
	public Supper() {
		super();//Object()
		System.out.println("Supper()构造  this="+this);
		print();//实例方法 被子类重写过,当创建的是子类对象的时候，
		//在父类的构造中调用该实例方法 一定共识子类重写后的方法
		i = 20;
	}

	public void print() {
		System.out.println("Supper===" + i);
	}
}

class Sub extends Supper {
	//变量隐藏 发生在编译期间
	int i = 30;
	int[] arr = new int[2];//数组中的元素0 在运行期间获得 默认初始值
	public Sub() {
		super();//new Supper();创建一个新的父类对象 与直接调用super()意思不一样
		System.out.println("Sub()构造  this="+this);
		print();//this.print()
		super.print();
		i = 40;
	}

	public void print() {
		System.out.println("Sub===" + i);
		System.out.println("Sub=== arr=" + arr);
	}
}
