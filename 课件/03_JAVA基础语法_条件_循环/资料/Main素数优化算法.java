public class Main {

	public static void main(String[] args) {
		//素数 优化的实现方式
		int count = 0;
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i)) {
				count++;
				System.out.print(i + ",");
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}

		System.out.print("\n共有 " + count + " 个素数");

	}

	/**
	 * 判断素数的方法
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(long n) {
		if (n <= 3) {
			return n > 1;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		//素数优化的算法
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}
