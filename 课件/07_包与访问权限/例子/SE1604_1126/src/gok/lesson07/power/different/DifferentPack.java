package gok.lesson07.power.different;

import gok.lesson07.power.PowerClass;

public class DifferentPack {
	
	
	

	public static void main(String[] args) {
		//对象o 与类PowerClass 在不同一个包中的不同类中
		PowerClass o = new PowerClass();
//		System.out.println("o.pri="+o.pri);//私有的 不可以 error
//		System.out.println("o.def="+o.def);//默认不可以
//		System.out.println("o.pro="+o.pro);//受保护的 也不可以
		System.out.println("o.pub="+o.pub);
		
		

	}

}
