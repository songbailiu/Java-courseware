package gok.lesson07;

public class UserBean {
	//���������������:��װ���̳С���̬
	// ��װ�������ݺ����ݵĲ��� �����һ���γ�һ���µ���������(������)
	//ʵ�ִ����ظ�����,ͨ�ù��� ��Ȼ��Ƴ�ͨ�÷��� ������
	//�û��������롢���䡢�ֻ�����ַ�ȵ�
	
	//д javaBean ˽������,������getXXX��setXXX
	//�޲ι���
	
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
