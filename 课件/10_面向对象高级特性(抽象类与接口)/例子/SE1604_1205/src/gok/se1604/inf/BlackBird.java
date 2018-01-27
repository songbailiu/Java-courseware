package gok.se1604.inf;

/**
 * ÎÚÑ»Àà
 * @author lilong
 *
 */
public class BlackBird extends Bird {
	
	public BlackBird(String name) {
		super(name);
	}
	

	@Override
	public void fly() {
		System.out.println(getName()+" Ò²»á·É.....");

	}

}
