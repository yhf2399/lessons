import java.util.Scanner;
	public class Game2{
		public static void main(String[] args) {
		String password="asd";
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("input password:");
			String userData=sc.nextLine();
			if (password.equals(userData)) {
				break;
			}
		}
	}
}