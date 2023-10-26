package stringhandlingmethods;
import java.util.Scanner;
public class Comparetomethod {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your pass:");
	String pass=sc.next();
	System.out.println("enter pass again:");
	String conpass=sc.next();
	int i=pass.compareTo(conpass);
	System.out.println("i="+1);
	if(i==0) {
		System.out.println("sucessyour pass has been saved");
	}else {
		System.out.println("error");
	}

	}

}
