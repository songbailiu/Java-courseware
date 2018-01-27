public class Main {

	public static void main(String[] args) {
		//���� �Ż���ʵ�ַ�ʽ
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

		System.out.print("\n���� " + count + " ������");

	}

	/**
	 * �ж������ķ���
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
		//�����Ż����㷨
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}
