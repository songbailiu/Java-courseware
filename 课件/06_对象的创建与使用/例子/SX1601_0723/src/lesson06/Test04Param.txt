package lesson06;

public class Test04Param {
	// 当方法被调用时，如有参数，参数须要实例化(初始化);即参数是具体的值;
	// 在java中,参数传递分为两种：
	// 值传递：基本数据类型采用值传递;
	// 实参的值永远不发生变化
	// 引用传递：类类型采用引用传递;
	// 实参的内存地址不变化，但是内容有可能变化
	
	//实例变量
	int r;
	
	//值传递：基本数据类型采用值传递，值永远不发生变化
	static void changeSimple(int a){
		//a --> 9
		a++;//a = a+1   a -->10
	}
	
	
	//引用传递：实参的内存地址不变化，但是内容有可能变化
	static void changeReference(int[] arrInt){
		//实参与形参指向同一个实体，改变形参就是改变实参,数据会变化
		//arrInt[0] = 99;
		
		//不变化：形参指向了新的实体，改变形参不会影响实参,数据不变化
		arrInt = new int[2];
		arrInt[0] = 99;	
	}
	
	
	
	//类类型的引用传递
	static void changeReference(Test04Param param){
		//param.r = 99;
		
		param = new Test04Param();
		param.r = 99;
	}
	
	
	
	

	public static void main(String[] args) {
//		int i = 9;
//		System.out.println("i="+i);
//		changeSimple(i);
//		System.out.println("值传递后 i="+i);
//		
//		//引用传递
//		int[] arr = new int[2];//{0,0}
//		System.out.println("arr="+arr);
//		System.out.println("arr[0]="+arr[0]);
//		changeReference(arr);		
//		
//		System.out.println("引用传递 后 arr[0]="+arr[0]);
//		System.out.println("arr="+arr);
		
		
		Test04Param o = new Test04Param();
		System.out.println("o.r="+o.r);
		
		changeReference(o);
		
		System.out.println("引用传递后 o.r="+o.r);

	}

}
