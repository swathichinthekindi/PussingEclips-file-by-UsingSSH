//Q19. WJP to display number of occurrence of all character

package hackathon1;

import java.util.Scanner;

public class CharOccurences {
	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter a String = ");
	String S = Sc.nextLine();
	char[] carr = S.toCharArray();
	int count;
	for(int i=0; i<S.length(); i++) {
		count = 1;
		for(int j=i+1;j<S.length();j++) {
			if (carr[i]==carr[j] && carr[i]!=' ') {
				count++;
				carr[j]=0;
				
			}
			
		}
		if(carr[i]!=0 && carr[i]!=' ') {
			System.out.println(carr[i]+" occured "+ count +" times");
		}
		
		
	}
	Sc.close();
}
}