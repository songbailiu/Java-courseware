package se1403.zuoye11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ���ﳵ����ҵ����
 * 
 * @author admin
 * 
 */
public class ShoppingCar {
	private double totalPrice; // ���ﳵ������Ʒ�ܼ۸�
	private int totalCount; // ���ﳵ������Ʒ����
	private Map<Integer, OrderItemBean> itemMap; // ��Ʒ����붩����ļ�ֵ��

	// �������ݿ����,���ڸ�����Ʒ��Ż����Ʒ����
	Database database = new Database();

	public ShoppingCar() {
		// ��ʼ�����ﳵ
		itemMap = new HashMap<Integer, OrderItemBean>();
	}

	public void buy(int nid) {
		// �������Ʒ�ǵ�һ�ι�����Ʒ����Ϣ�����ݿ��ȡ�����ݿ��ģ���
		// �����¼��itemMap����һ�Լ�ֵ�ԡ�
		// ������ǵ�һ�ι�����ͨ����Ʒ����ҵ���Ӧ�Ķ����Ȼ����¶�
		// �������Ʒ������
		// �����Ƿ��һ�ι��򣬶��ø��¹��ﳵ���ܼ۸����������
		if (itemMap.containsKey(nid)) {
			// �ظ�����,�ۼӶ������е���Ʒ����
			OrderItemBean orderItemBeanOld = itemMap.get(nid);
			orderItemBeanOld.setCount(orderItemBeanOld.getCount() + 1);
			computeCountAndTotalPrice();
		} else {
			// mapû�а���key�����ǵ�һ�ι���,���һ����ֵ��(��Ʒ����붩����)
			McBean mcBean = database.getMcBean(nid);
			if (mcBean != null) {
				OrderItemBean orderItemBean = new OrderItemBean(mcBean, 1);
				itemMap.put(nid, orderItemBean);
				// �����ܼ۸����ܸ���
				computeCountAndTotalPrice();
			}

		}

	}

	public void delete(int nid) {
		// ͨ����Ʒ���ɾ���Ķ�Ӧ�Ķ����Ȼ��Ӹ��¹��ﳵ���ܼ۸����������
		itemMap.remove(nid);
		computeCountAndTotalPrice();
	}

	public void update(int nid, int count) {
		// /ͨ����Ʒ����ҵ���Ӧ�Ķ�Ӧ�Ķ�����޸���Ʒ������Ȼ��Ӹ��¹��ﳵ���ܼ۸����������
		if (itemMap.containsKey(nid)) {
			// �ظ�����,�ۼӶ������е���Ʒ����
			OrderItemBean orderItemBeanOld = itemMap.get(nid);
			// �޸ĸ���
			orderItemBeanOld.setCount(count);
			computeCountAndTotalPrice();
		}

	}

	public void clear() {
		// ��ն�������ﳵ���ܼ۸�����������㡣
		itemMap.clear();
		computeCountAndTotalPrice();
	}

	public void show() {
		// ��ʾ���ﳵ����Ʒ����ʽ����:
		// ��Ʒ��� ��Ʒ���� ���� �������� С��
		// 1 �ع� 2.0 2 4.0
		// 2 ���� 1.2 5 6.0
		//
		// �ϼƣ���������7 �ܼ۸�10Ԫ

		System.out.println("********** ��ʾ���ﳵ����Ʒ����ʽ����:***************");
		System.out.println("��Ʒ���\t��Ʒ����\t����\t��������\tС��");
		Collection<OrderItemBean> values = itemMap.values();
		for (OrderItemBean orderItemBean : values) {
			System.out.println(orderItemBean);
		}
		System.out
				.println("�ϼƣ���������" + totalCount + "\t�ܼ۸�" + totalPrice + "Ԫ");

		System.out.println("***************************************");

	}

	/**
	 * �����ܸ������ܼ۸�
	 */
	private void computeCountAndTotalPrice() {
		totalPrice = 0;
		totalCount = 0;
		Collection<OrderItemBean> values = itemMap.values();
		for (OrderItemBean orderItemBean : values) {
			totalCount += orderItemBean.getCount();

			totalPrice += orderItemBean.getCount()
					* orderItemBean.getMcBean().getNprice();

		}

	}

}
