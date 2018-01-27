package se1403.zuoye11;

/**
 * ��������
 * 
 * @author admin
 * 
 */
public class OrderItemBean {
	// ��Ʒ����
	private McBean mcBean;
	// ��Ʒ����
	private int count;

	public OrderItemBean(McBean mcBean, int count) {
		super();
		this.mcBean = mcBean;
		this.count = count;
	}

	public McBean getMcBean() {
		return mcBean;
	}

	public void setMcBean(McBean mcBean) {
		this.mcBean = mcBean;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mcBean+"\t"+count+"\t"+mcBean.getNprice()*count;
	}

}
