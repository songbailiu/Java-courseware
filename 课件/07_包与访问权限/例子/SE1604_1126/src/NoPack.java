import gok.lesson07.Person;


public class NoPack {

	public static void main(String[] args) {
		NoPack noPack = new NoPack();
		
		
		
		
		//无包名的类可以访问有包名的类
		Person person = new Person();
		
		
		//有包名的类无法访问无包名的类
		//请查看gok.lesson07.Person

	}

}
