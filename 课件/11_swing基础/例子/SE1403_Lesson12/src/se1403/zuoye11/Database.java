package se1403.zuoye11;

import java.util.HashMap;
import java.util.Map;

/**
 * ���ݿ�
 * 
 * @author admin
 * 
 */
public class Database {
	private Map<Integer, McBean> data = new HashMap<Integer, McBean>();

	public Database() {
		McBean bean = new McBean();
		bean.setNid(1);
		bean.setSname("�ع�");
		bean.setNprice(2.0);
		bean.setSdescription("���ʵĵع�");

		data.put(1, bean);

		bean = new McBean();
		bean.setNid(2);
		bean.setSname("����");
		bean.setNprice(1.2);
		bean.setSdescription("�ֺ��ִ������");

		data.put(2, bean);

		bean = new McBean();
		bean.setNid(3);
		bean.setSname("˿��");
		bean.setNprice(1.5);
		bean.setSdescription("����˿��");

		data.put(3, bean);
	}

	public McBean getMcBean(int nid) {
		return data.get(nid);
	}

}
