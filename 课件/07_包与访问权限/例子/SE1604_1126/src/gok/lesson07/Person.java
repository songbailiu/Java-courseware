//定义包 package 必须写在java文件的第一句话
package gok.lesson07;
//Java用文件系统目录来存储包。目录名和包名严格匹配。
//cmd dos命令中运行 一定要保证 根目录下面有与包名对应的文件夹

public class Person {
	//类的全称gok.lesson07.Person 类的全路径
	//不再叫Person
	
	public String name ="gok.lesson07.Person";
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name);
		
		
		//有包名的类无法访问无包名的类
		//有包名的类中搜寻类路径的时候，
		//默认从当前包名的路径下搜寻类的信息,无法找到无包名的类
		//gok.lesson07.NoPack 解析NoPack
//		NoPack no = new NoPack();//error 
		
	}
	

}
