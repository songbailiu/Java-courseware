package lesson05;

public class Test02Var {
	//�����еĶ���ı�����Ϊ:ȫ�ֱ�����ֲ�����
	//ȫ�ֱ����������������еı��������������п���ʹ����������ⲿ������ʹ��
	//��Ϊ��̬����(�����) ��ʵ������(ʵ����Ա����)
	//�������static����,������,ͨ������.����������
	//ʵ������:û��static���Σ�������������У�ͨ������.����������
	
	//��̬����:���ڴ��д���ھ�̬�洢���������ڴ���ֻ��һ������
	static String country = "�й�";
	//ʵ������:���������
	String name = "Сǿ";
	
	
	
	
	//�ֲ������������ڴ������(�����壬if��for�ȵ�)�ı���,ʹ��֮ǰ�����ֶ���ʼ��
	
	
	

	public static void main(String[] args) {
		//ʹ�þ�̬����:����.������
		System.out.println("Test02Var.country="+Test02Var.country);
		System.out.println("country="+country);//����������һ�𣬿���ʡ������
		
		
		
		//���������д��
		Test02Var object = new Test02Var();
		//ʵ������������.������
		System.out.println("obejct.name="+object.name);
		object.name="����";
		System.out.println("obejct.name="+object.name);
		System.out.println("obejct="+object);
		Test02Var object2 = new Test02Var();
		System.out.println("obejct2="+object2);
		System.out.println("object2.name="+object2.name);
		System.out.println(object == object2);//false
		
		//��̬�ķ����� ����ֱ�����÷Ǿ�̬�ı���
		//Cannot make a static reference to the non-static field Test02Var.name
//		System.out.println(Test02Var.name);//error
		
		
		
		//�ֲ�����:ʹ��֮ǰ�����ֶ���ʼ��
		int i;
		i  = 10;
		System.out.println(i);
		
		
		
		
		//��������������
		System.out.println("object.country="+object.country);
		System.out.println("object2.country="+object2.country);
		country = "USA";
		System.out.println("-----------�޸ľ�̬������----------------");
		System.out.println("country="+country);
		System.out.println("object.country="+object.country);
		System.out.println("object2.country="+object2.country);
		
		
	}

}
