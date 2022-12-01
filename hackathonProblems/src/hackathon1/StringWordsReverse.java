package hackathon1;

import java.util.Scanner;

public class StringWordsReverse {
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String str = Sc.nextLine();
		
		
		String words[]=str.split(" ");
		for(int i = words.length-1 ; i>=0 ; i--) 
			System.out.print(words[i]+ " ");
		
		Sc.close();

}
}
