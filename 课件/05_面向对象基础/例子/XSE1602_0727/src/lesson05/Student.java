package lesson05;

public class Student {
	//�� �Ƕ�����һ���µ��������ͣ�����������е������Լ������ݵĲ���
	//��������У�
	//���ݣ����������״̬  ���Ǳ���
	//����������������еĹ��ܺ���Ϊ����Ӧ���Ǻ������߷���
	
	String studentNo;
	String name;
	String sex;
	double height;
	double weight;
	
	//��Ϊ��
	public void speak(String language){//��ʽ����:���������ʱ��ָ���Ĳ��� 
		System.out.println("�й���ѧ��˵"+language);
	}
	
	public void eat(){
		System.out.println("ѧ�� �� �׷� ���� ��ʳ.....");
	}
	
	public void study(){
		System.out.println("ѧ�� ����ְ���� �ú�ѧϰ ��������....");
	}
	
	public static void main(String[] args) {
		//��Student��������������
		int i = 100;
		int[] arr = new int[2];
		String s = new String("abc");
		//����  ������ = new  ����()  //���캯��
		//student��ΪStudent���͵Ķ���   ��һ�����ñ��� 
		Student student = new Student();
		//ʹ�������еı���    :����.�����Լ��ı���
		student.studentNo="01182092";
		student.name = "��С��";
		student.sex = "��";
		System.out.println("student.studentNo="+student.studentNo);
		System.out.println("student.name="+student.name);
		System.out.println("student.sex="+student.sex);
		
		//ʹ������ķ���:����.������([����]);
		student.speak("����....");//���õ�ʱ��ʵ�ʴ���Ĳ�����Ϊʵ��
		student.eat();
		student.study();		
		
	}
	
	
	

}
