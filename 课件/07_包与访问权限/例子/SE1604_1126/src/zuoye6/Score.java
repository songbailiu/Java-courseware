package zuoye6;

public class Score {
	// 包含英语、数学、语文、综合四科
	private double english, math, chinese, x;

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(double english, double math, double chinese, double x) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.x = x;
	}

	public double getTotalScore() {
		return chinese + english + math + x;
	}

	public double average() {
		return getTotalScore() / 4;
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

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public static void main(String[] args) {
		Score score = new Score(100, 100, 95, 99);
		System.out.println(score.getTotalScore());
		System.out.println("平均分:" + score.average());

	}

}
