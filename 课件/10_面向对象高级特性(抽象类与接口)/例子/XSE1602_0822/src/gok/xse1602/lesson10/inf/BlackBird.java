package gok.xse1602.lesson10.inf;

public class BlackBird extends Bird {
	
	public BlackBird(String name) {
		setName(name);
	}

	@Override
	public void fly() {
		System.out.println(getName()+" Ò²»á·É......");

	}

}
