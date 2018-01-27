package zuoye5;

public class Student {
	// 姓名，年龄，班级(定义为类变量)，成绩；
	String name;
	int age;
	// 静态变量不用生成getXXX与setXXX的方法
	static String className = "SX1601";
	Score score;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//不推荐
//	public void Student() {
//		// TODO Auto-generated constructor stub
//	}
	

	public Student(String name, int age, Score score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public static void speak() {
		System.out.println("说 中文....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		System.out.println("student.name="+student.name);
		System.out.println("student.age="+student.age);
		System.out.println("student.score="+student.score);//null
		//学生的成绩的语文成绩
		//null 访问它的任何属性与方法都会出现空指针异常 NullPointerException
		//System.out.println("student.score.chinese="+student.score.chinese);
		//创建对象或者赋值
		student.score = new Score(77, 88, 99);
		System.out.println("初始化后 student.score="+student.score);
		System.out.println("student.score.chinese="+student.score.chinese);
		
		
		//班级  是 静态变量,通过类名.静态变量名
		System.out.println(Student.className);
		System.out.println(className);//调用与类 在同一个类中，可以省略类名
		
		
//		student.Student();
		
	}

}
