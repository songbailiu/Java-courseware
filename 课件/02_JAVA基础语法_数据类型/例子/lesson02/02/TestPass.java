public class TestPass
{


	public static void main(String[] args){
		//char c = '��';
		Scanner scan = new Scanner(System.in);
		Char c = scan.nextChar();

		System.out.println("����ǰ:"+c);

		char newChar = (char)(c^'5');
		System.out.println("���ܺ�:"+newChar);

		char cc = (char) (newChar^'��');
		System.out.println("���ܺ�:"+cc);

		



		
		


	
	
	}
}