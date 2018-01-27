package zuoye6;

public class Point {
	// ���ͼ�� Ȩ�����η�
	// - ˽�е�     private
	// * Ĭ�ϵ�     ��д���η�
	// # �ܱ����� protected
	// + ������     public
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
	
	
	//�ƶ���Ծ���
	public void movePoint(double dx,double dy){
		//x:1  --> 2
		x += dx;//this.x = this.x+dx;
		y += dy;		
	}
	
	//��õ�����һ����ľ���
	public double getDistance(Point p){
		
		System.out.println("getDistance this="+this);
		System.out.println("getDistance p="+p);
		
		//���÷���p1.getDistance(p2)
		//this ��ʾ p1
		//�β�p��ʾ p2
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
		System.out.println("p1������Ϊ:"+p1.x+","+p1.y);
		p1.movePoint(1, 1);
		System.out.println("p1������Ϊ:"+p1.x+","+p1.y);
		
		Point p2 = new Point(2,2);
		System.out.println("p2������Ϊ:"+p2.x+","+p2.y);
		
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		//ʵ��p2 ���� ������p
		//��ǰ����p1 ���Ƿ�����this
		double distance = p1.getDistance(p2);
		System.out.println("����Ϊ:"+distance);
		
		//ʵ��p1  �뷽�����β�p ��Ӧ
		//��ǰ����p2    �뷽���е�this��Ӧ
		double distance2 = p2.getDistance(p1);
		System.out.println("����Ϊ:"+distance2);
	}
	
	

}
