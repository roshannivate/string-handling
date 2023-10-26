package stringhandlingmethods;
import java.util.Scanner;
public class Change_upper_to_lowercase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter:");
	String s= sc.next();
	System.out.println(s);
	char a[]=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		if(a[i]>='a'&&a[i]<='z') {
			a[i]-=32;
		}
	}
s=new String(a);
System.out.println(s);
	}

}
