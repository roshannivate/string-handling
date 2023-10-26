package stringhandlingmethods;
import java.util.Scanner;
public class Checking_gmail {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your gmail:");
	String s=sc.nextLine();
	String a[]=s.split("@");
	if(a[a.length-1].equals("gmail.com")){
		System.out.println("thank you! you can ragister");
	}else {
		System.out.println("we require gmail account to continue");
	}

	}

}
