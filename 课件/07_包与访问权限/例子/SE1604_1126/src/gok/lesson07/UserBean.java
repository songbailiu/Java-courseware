package gok.lesson07;

public class UserBean {
	//面向对象三大特征:封装、继承、多态
	// 封装：把数据和数据的操作 打包在一起，形成一种新的数据类型(定义类)
	//实现代码重复利用,通用功能 当然设计成通用方法 来调用
	//用户名、密码、邮箱、手机、地址等等
	
	//写 javaBean 私有属性,公共的getXXX和setXXX
	//无参构造
	
	private String username;
	private String password;
	private String email;
	private String phone;
	private String address;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}	
	
	public UserBean(String username, String password, String email,
			String phone, String address) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

}
