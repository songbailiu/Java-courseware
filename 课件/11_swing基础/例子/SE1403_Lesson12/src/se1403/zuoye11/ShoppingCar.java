package se1403.zuoye11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 购物车具体业务类
 * 
 * @author admin
 * 
 */
public class ShoppingCar {
	private double totalPrice; // 购物车所有商品总价格
	private int totalCount; // 购物车所有商品数量
	private Map<Integer, OrderItemBean> itemMap; // 商品编号与订单项的键值对

	// 定义数据库对象,便于根据商品编号获得商品对象
	Database database = new Database();

	public ShoppingCar() {
		// 初始化购物车
		itemMap = new HashMap<Integer, OrderItemBean>();
	}

	public void buy(int nid) {
		// 如果该商品是第一次购买，商品的信息从数据库获取，数据库的模拟代
		// 码见附录。itemMap增加一对键值对。
		// 如果不是第一次购买，则通过商品编号找到对应的定单项，然后更新定
		// 单项的商品数量。
		// 不管是否第一次购买，都得更新购物车的总价格和总数量。
		if (itemMap.containsKey(nid)) {
			// 重复购买,累加订单项中的商品个数
			OrderItemBean orderItemBeanOld = itemMap.get(nid);
			orderItemBeanOld.setCount(orderItemBeanOld.getCount() + 1);
			computeCountAndTotalPrice();
		} else {
			// map没有包含key，则是第一次购买,添加一个键值对(商品编号与订单项)
			McBean mcBean = database.getMcBean(nid);
			if (mcBean != null) {
				OrderItemBean orderItemBean = new OrderItemBean(mcBean, 1);
				itemMap.put(nid, orderItemBean);
				// 计算总价格与总个数
				computeCountAndTotalPrice();
			}

		}

	}

	public void delete(int nid) {
		// 通过商品编号删除的对应的定单项，然后从更新购物车的总价格和总数量。
		itemMap.remove(nid);
		computeCountAndTotalPrice();
	}

	public void update(int nid, int count) {
		// /通过商品编号找到对应的对应的定单项，修改商品数量。然后从更新购物车的总价格和总数量。
		if (itemMap.containsKey(nid)) {
			// 重复购买,累加订单项中的商品个数
			OrderItemBean orderItemBeanOld = itemMap.get(nid);
			// 修改个数
			orderItemBeanOld.setCount(count);
			computeCountAndTotalPrice();
		}

	}

	public void clear() {
		// 清空定单项，购物车的总价格和总数量清零。
		itemMap.clear();
		computeCountAndTotalPrice();
	}

	public void show() {
		// 显示购物车的商品，格式如下:
		// 商品编号 商品名称 单价 购买数量 小计
		// 1 地瓜 2.0 2 4.0
		// 2 土豆 1.2 5 6.0
		//
		// 合计：总数量：7 总价格：10元

		System.out.println("********** 显示购物车的商品，格式如下:***************");
		System.out.println("商品编号\t商品名称\t单价\t购买数量\t小计");
		Collection<OrderItemBean> values = itemMap.values();
		for (OrderItemBean orderItemBean : values) {
			System.out.println(orderItemBean);
		}
		System.out
				.println("合计：总数量：" + totalCount + "\t总价格：" + totalPrice + "元");

		System.out.println("***************************************");

	}

	/**
	 * 计算总个数与总价格
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
