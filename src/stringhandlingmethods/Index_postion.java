package stringhandlingmethods;
import java.util.Scanner;
public class Index_postion {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    String s="Hallown is in october";
    for(int i=0;i<s.length();i++) {
    	char ch=s.charAt(i);
    	if (ch=='0'||ch=='0') {
    		System.out.println(i);
    	}
    }

	}

}
