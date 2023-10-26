package stringhandlingmethods;
import java.util.Scanner;
public class Count_from_words {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("how many words you want to add");
	int limit=sc.nextInt();
	int count=0,count1=0;
	for(int i=0;i<limit;i++) {
		System.out.println("enter the word");
		String word=sc.next();
		for(int j=0; j<word.length();j++) {
			char ch=word.charAt(j);
			if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0') {
				count ++;
			}else {
				count1 ++;
			}
		}
	}
System.out.println("number:"+count);
System.out.println("character:"+count1);
	}

}
