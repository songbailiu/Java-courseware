package zuoye5;

public class Score {
	// java数据模型 JavaBean POJO VO:Value Object
	double chinese, english, math;

	public Score() {
		chinese = 60;
		english = 60;
		math = 60;
	}

	public Score(double chinese, double english, double math) {
		super();
		this.chinese = chinese;
		this.english = english;
		this.math = math;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}
	
	public static void main(String[] args) {
		Score score1 = new Score();
		System.out.println("score1.chinese="+score1.chinese);
		System.out.println("score1.chinese="+score1.getChinese());
		score1.english = 80;
		System.out.println("score1.english="+score1.english);
		score1.setEnglish(57);
		System.out.println("score1.english="+score1.english);
		//error:void类型不能出现打印函数中
//		System.out.println(score1.setEnglish(57));
		
		Score score2 = new Score(99, 99, 100);
		System.out.println("score2.chinese="+score2.chinese);
		System.out.println("score2.english="+score2.english);
		System.out.println("score2.math="+score2.math);
		
	}

}
