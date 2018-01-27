package lesson05;

public class Student {
	//类 是定义了一种新的数据类型，描述对象具有的数据以及对数据的操作
	//程序设计中：
	//数据：描述对象的状态  就是变量
	//操作：描述对象具有的功能和行为，对应的是函数或者方法
	
	String studentNo;
	String name;
	String sex;
	double height;
	double weight;
	
	//行为：
	public void speak(String language){//形式参数:方法定义的时候指定的参数 
		System.out.println("中国的学生说"+language);
	}
	
	public void eat(){
		System.out.println("学生 吃 米饭 或者 面食.....");
	}
	
	public void study(){
		System.out.println("学生 的天职就是 好好学习 天天向上....");
	}
	
	public static void main(String[] args) {
		//用Student类型来创建对象
		int i = 100;
		int[] arr = new int[2];
		String s = new String("abc");
		//类型  变量名 = new  类型()  //构造函数
		//student称为Student类型的对象   是一种引用变量 
		Student student = new Student();
		//使用类体中的变量    :对象.引用自己的变量
		student.studentNo="01182092";
		student.name = "李小龙";
		student.sex = "男";
		System.out.println("student.studentNo="+student.studentNo);
		System.out.println("student.name="+student.name);
		System.out.println("student.sex="+student.sex);
		
		//使用类体的方法:对象.方法名([参数]);
		student.speak("中文....");//调用的时候实际传入的参数称为实参
		student.eat();
		student.study();		
		
	}
	
	
	

}
