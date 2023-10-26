package stringhandlingmethods;
import java.util.Scanner;
public class Frist_letter_uppercase {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a name:");
	String s= sc.nextLine();
	System.out.println(s);
	s=s.toUpperCase();
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i].charAt(3)+".");
	}

	}

}
