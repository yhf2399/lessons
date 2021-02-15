import java.util.Random;
import java.util.Scanner;
public class Game{
	public static void main(String[]args){
	Random random=new Random();
	Scanner sc=new Scanner(System.in);
	int number=0;
	while(true){
		number++;
	int target=random.nextInt(10);
	System.out.println("your answer?>");
	int answer=sc.nextInt();
	if(answer==target){
	System.out.println("you win!");
	System.out.println("in"+number);
	break;
	}else{
	System.out.println("target"+target);
     	}
	 }
  }
}