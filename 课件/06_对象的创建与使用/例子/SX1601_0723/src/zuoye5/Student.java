package zuoye5;

public class Student {
	// ���������䣬�༶(����Ϊ�����)���ɼ���
	String name;
	int age;
	// ��̬������������getXXX��setXXX�ķ���
	static String className = "SX1601";
	Score score;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//���Ƽ�
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
		System.out.println("˵ ����....");
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
		//ѧ���ĳɼ������ĳɼ�
		//null ���������κ������뷽��������ֿ�ָ���쳣 NullPointerException
		//System.out.println("student.score.chinese="+student.score.chinese);
		//����������߸�ֵ
		student.score = new Score(77, 88, 99);
		System.out.println("��ʼ���� student.score="+student.score);
		System.out.println("student.score.chinese="+student.score.chinese);
		
		
		//�༶  �� ��̬����,ͨ������.��̬������
		System.out.println(Student.className);
		System.out.println(className);//�������� ��ͬһ�����У�����ʡ������
		
		
//		student.Student();
		
	}

}
