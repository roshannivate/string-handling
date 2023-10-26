package stringhandlingmethods;
import java.util.Scanner;
public class Double_sameno {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a password:");
	String s1=sc.nextLine();
	System.out.println("enter a password again:");
	String s2=sc.nextLine();
	if(s1.length()!=s2.length()) {
		System.out.println("invalied pass"+" ");
	}

	}

}
