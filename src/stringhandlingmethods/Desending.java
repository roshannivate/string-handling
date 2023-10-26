package stringhandlingmethods;
import java.util.Scanner;
public class Desending {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word");
		String word =sc.next();
		String rev=" ";
		for (int i=word.length()-1;i>0;i--){
			rev=rev+word.charAt(i);
		}
		System.out.println("reverse:"+rev);
		if(word.equals(rev)) {
			System.out.println("palindrone");
		}
		else {
			System.out.println("not palindron");
		}
	}

}
