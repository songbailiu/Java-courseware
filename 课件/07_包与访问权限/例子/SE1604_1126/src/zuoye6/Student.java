package zuoye6;

public class Student {
	private String id,name;
	private boolean special;
	private Score score;//null
	
	
	public Student() {
		//score ��Ҫ new
		score = new Score(60, 60, 60, 60);
		name="Сǿ";
		id="01182092";
		special = false;
	}	
	
	public Student(String id, String name, boolean special, Score score) {
		super();
		this.id = id;
		this.name = name;
		this.special = special;
		this.score = score;
	}




	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//boolean��ʵ������ ����
	public boolean isSpecial() {
		return special;
	}
	public void setSpecial(boolean special) {
		this.special = special;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	//��ÿ�� ����
	public void setScore(double chinese,double english,double math,double x) {
		score.setChinese(chinese);
		score.setEnglish(english);
		score.setMath(math);
		score.setX(x);
	}
	
	public double getTotalScore() {
		
		//���⿼��  ����10��
		if(special){
			return 10+score.getTotalScore();
		}		
		
		return score.getTotalScore();
	}
	
	public void speak(){
		System.out.println("speak()....");
	}
	
	public void speak(String content){
		System.out.println("speak(String content)....");
	}
	
	public void speak(String content,String language){
		System.out.println("speak(String content,String language)....");
	}
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		System.out.println(student1.score);
		System.out.println(student1.getTotalScore());
		
		
		Student student2 = new Student("01182093","����",true,new Score(99, 99, 99, 99));
		System.out.println(student2.score);
		System.out.println(student2.getTotalScore());
		
	}
	

}
