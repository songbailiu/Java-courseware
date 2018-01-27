package zuoye5;
public class Zuoye {

	public static void main(String[] args) {
		// String --> int
		//捕获异常
		try {
			int i = Integer.parseInt("77yuyuyu");// "数字"
			System.out.println(i);
		} catch (Exception e) {
			// e 就是异常处理的参数  作用域只在catch块的内部
			e.printStackTrace();
			System.out.println("出现异常了....");

		}
//		System.out.println(e);//error

		System.out.println("main方法结束.....");

	}

}
