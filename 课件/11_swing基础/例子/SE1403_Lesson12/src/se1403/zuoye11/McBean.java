package se1403.zuoye11;

/**
 * ��Ʒ��
 * @author admin
 *
 */
public class McBean {
	private int nid;
	private String sname;
	private double nprice;
	private String sdescription;
	
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getNprice() {
		return nprice;
	}
	public void setNprice(double nprice) {
		this.nprice = nprice;
	}
	public String getSdescription() {
		return sdescription;
	}
	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}
	
	
	//�����ӡչʾʹ��
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nid+"\t"+sname+"\t"+nprice;
	}
	
	
	
	

}
