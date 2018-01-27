package se1403.zuoye11;

public class TestCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShoppingCar car = new ShoppingCar();
		car.buy(1);
		car.show();
		car.buy(2);
		car.buy(3);
		car.show();
		
		car.update(1, 10);
		car.show();
		car.delete(3);
		car.show();
		car.clear();
		car.show();

	}
}
