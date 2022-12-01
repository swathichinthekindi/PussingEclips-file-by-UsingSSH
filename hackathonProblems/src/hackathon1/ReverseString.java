//Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)

package hackathon1;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String str = Sc.nextLine();
		String S= str;
		String rev="";
		int length = S.length();
		
		for(int i=0; i<length; i++) {
			rev = S.charAt(i)+rev;
		}
		System.out.println(rev);
		
		Sc.close();
	
	}

}
