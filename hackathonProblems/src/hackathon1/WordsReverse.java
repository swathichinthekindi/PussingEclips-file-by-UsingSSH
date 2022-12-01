//Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)

package hackathon1;
import java.util.Scanner;

public class WordsReverse {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String with 2 words = ");
		String str = Sc.nextLine();
		
		
		String words[]=str.split(" ");
		String revString = "";
		
		for(int i =0; i<words.length; i++) {
			String S = words[i];
			String revword = "";
			
			for(int j =0; j<S.length(); j++) {
				revword = S.charAt(j)+revword;
			}
			System.out.print(revword+" ");
			
			revString = revString+revword+" "; 
			
		}
		System.out.println();
		System.out.print(revString);
		System.out.println();
		
		
		
		String RevString ="";
		for(int i=0;i<revString.length();i++) {
			RevString= revString.charAt(i)+RevString;
		}
		System.out.println(RevString.substring(1));
		
		
		
		Sc.close();
		
		
		
	}

}
