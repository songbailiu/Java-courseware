package gok.se1604.inf;

public abstract class Bird implements FlyInf{
	private String name;
	
	public Bird(String name) {
		this.name = name;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
