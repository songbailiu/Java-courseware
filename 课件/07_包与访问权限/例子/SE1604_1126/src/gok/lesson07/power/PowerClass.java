package gok.lesson07.power;

public class PowerClass {
	//访问权限：通过对类中的成员的访问权限限制，可以控制外部对象对于类中成员的访问 
	//四种修饰符
//	当一个类可以被访问时，对类内的成员变量和成员方法而言，其应用范围可以通过施以一定的访问权限来限定。
	//对象与类是否在同一个类中，同一个包中，不同包中
	// 中文		关键字	    同一个类中 	同包不同类 	不同包 	类框图符号
	// 私有的	private   ★ 								-
	// 默认的			     ★ 			★ 					*
	// 受保护的	protected ★ 			★ 					#
	// 公共的	public 	     ★			★ 			★		+
	
	private int pri = 10;
	int def = 20;
	protected int pro= 30;
	public int pub = 40;
	
	

	public static void main(String[] args) {
		//对象o 与类PowerClass 在同一个类中
		PowerClass o = new PowerClass();
		System.out.println("o.pri="+o.pri);
		System.out.println("o.def="+o.def);
		System.out.println("o.pro="+o.pro);
		System.out.println("o.pub="+o.pub);
		
		

	}

}
