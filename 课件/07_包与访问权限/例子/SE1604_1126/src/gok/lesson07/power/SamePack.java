package gok.lesson07.power;

public class SamePack {
	
	
	

	public static void main(String[] args) {
		//对象o 与类PowerClass 在同一个包中的不同类中
		PowerClass o = new PowerClass();
//		System.out.println("o.pri="+o.pri);//私有的 不可以 error
		System.out.println("o.def="+o.def);
		System.out.println("o.pro="+o.pro);
		System.out.println("o.pub="+o.pub);
		
		

	}

}
