public class TestPass
{


	public static void main(String[] args){
		//char c = '我';
		Scanner scan = new Scanner(System.in);
		Char c = scan.nextChar();

		System.out.println("加密前:"+c);

		char newChar = (char)(c^'5');
		System.out.println("加密后:"+newChar);

		char cc = (char) (newChar^'哈');
		System.out.println("解密后:"+cc);

		



		
		


	
	
	}
}