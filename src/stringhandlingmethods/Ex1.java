package stringhandlingmethods;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("total char of your name:"+name.length());
	System.out.println("frist latter of name:"+name.charAt(0));
	System.out.println("total latter no:"+(name.length()-1));

	}

}
