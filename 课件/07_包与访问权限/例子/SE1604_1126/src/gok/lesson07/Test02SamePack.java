package gok.lesson07;

public class Test02SamePack {

	public static void main(String[] args) {
		//同一个包中的类相互调用
		//java在搜寻类路径的时候，默认从当前包中搜寻
		//Person 就是gok.lesson07.Person 
		Person person = new Person();
		System.out.println(person.name);
	}

}
