package gok.lesson07.diff;
//���벻ͬ���е��� import д�� ��������ඨ��֮��,����д���
import gok.lesson07.Person;
//����ͬʱ��������ͬ��������
//import gok.lesson07.client.Person;//error

public class Test03DiffPack {

	public static void main(String[] args) {
		//��ͬһ�����е�����ò�ͬ���е���
		//���� ��ͬ���е���	 import gok.lesson07.Person;	
		Person person = new Person();
		System.out.println(person.name);
		
		//2��ȫ����������.����   �������ͬһ�����п����õ�ͬ���Ĳ�ͬ���������
		gok.lesson07.client.Person p2 = new gok.lesson07.client.Person();
		System.out.println(p2.name);
		
		//��ע:����ʹ�õ�����import���������õ���ʹ��ȫ����

	}

}
