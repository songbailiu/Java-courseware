package zuoye6;

public class Point {
	// 类框图中 权限修饰符
	// - 私有的     private
	// * 默认的     不写修饰符
	// # 受保护的 protected
	// + 公共的     public
	private double x,y;
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//移动相对距离
	public void movePoint(double dx,double dy){
		//x:1  --> 2
		x += dx;//this.x = this.x+dx;
		y += dy;		
	}
	
	//求该点与另一个点的距离
	public double getDistance(Point p){
		
		System.out.println("getDistance this="+this);
		System.out.println("getDistance p="+p);
		
		//调用方法p1.getDistance(p2)
		//this 表示 p1
		//形参p表示 p2
		double dx = this.x-p.x;
		double dy = this.y-p.y;
		
		return Math.sqrt(dx*dx+dy*dy);
		
	}



	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println("p1的坐标为:"+p1.x+","+p1.y);
		p1.movePoint(1, 1);
		System.out.println("p1的坐标为:"+p1.x+","+p1.y);
		
		Point p2 = new Point(2,2);
		System.out.println("p2的坐标为:"+p2.x+","+p2.y);
		
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		//实参p2 就是 方法中p
		//当前对象p1 就是方法中this
		double distance = p1.getDistance(p2);
		System.out.println("距离为:"+distance);
		
		//实参p1  与方法中形参p 对应
		//当前对象p2    与方法中的this对应
		double distance2 = p2.getDistance(p1);
		System.out.println("距离为:"+distance2);
	}
	
	

}
