package gok.lesson07.diff;
//导入不同包中的类 import 写在 包定义和类定义之间,可以写多句
import gok.lesson07.Person;
//不能同时导入两个同类名的类
//import gok.lesson07.client.Person;//error

public class Test03DiffPack {

	public static void main(String[] args) {
		//不同一个包中的类调用不同包中的类
		//导入 不同包中的类	 import gok.lesson07.Person;	
		Person person = new Person();
		System.out.println(person.name);
		
		//2、全类名：包名.类名   解决咱们同一个类中可能用到同名的不同包下面的类
		gok.lesson07.client.Person p2 = new gok.lesson07.client.Person();
		System.out.println(p2.name);
		
		//备注:经常使用的类用import，不经常用的类使用全类名

	}

}
