package gok.lesson07.power;

public class PowerClass {
	//����Ȩ�ޣ�ͨ�������еĳ�Ա�ķ���Ȩ�����ƣ����Կ����ⲿ����������г�Ա�ķ��� 
	//�������η�
//	��һ������Ա�����ʱ�������ڵĳ�Ա�����ͳ�Ա�������ԣ���Ӧ�÷�Χ����ͨ��ʩ��һ���ķ���Ȩ�����޶���
	//���������Ƿ���ͬһ�����У�ͬһ�����У���ͬ����
	// ����		�ؼ���	    ͬһ������ 	ͬ����ͬ�� 	��ͬ�� 	���ͼ����
	// ˽�е�	private   �� 								-
	// Ĭ�ϵ�			     �� 			�� 					*
	// �ܱ�����	protected �� 			�� 					#
	// ������	public 	     ��			�� 			��		+
	
	private int pri = 10;
	int def = 20;
	protected int pro= 30;
	public int pub = 40;
	
	

	public static void main(String[] args) {
		//����o ����PowerClass ��ͬһ������
		PowerClass o = new PowerClass();
		System.out.println("o.pri="+o.pri);
		System.out.println("o.def="+o.def);
		System.out.println("o.pro="+o.pro);
		System.out.println("o.pub="+o.pub);
		
		

	}

}
