import java.util.Scanner;
 public class CiaoScan{
	public static void main(String[]ages){
    Scanner sc=new Scanner(System.in);
	System.out.print("input name:");
	String name=sc.nextLine();
	System.out.print("input msg:");
	String msg=sc.nextLine();
	for(int i=0;i<10;i++){
    System.out.println(name+"from"+msg);
		}
	}
}