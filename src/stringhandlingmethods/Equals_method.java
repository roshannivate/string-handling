package stringhandlingmethods;
import java.util.Scanner;
public class Equals_method {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your pass:");
	String pass = sc.next();
	System.out.println("enter pass again:");
	String conpass=sc.next();
	if(pass.equals(conpass)) {
		System.out.println();
	}

	}

}
