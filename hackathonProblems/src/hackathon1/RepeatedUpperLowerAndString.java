//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string

package hackathon1;

import java.util.Scanner;

public class RepeatedUpperLowerAndString {
	
	public static void TotalRepeatedUpperCase(String S) {
		int c=0;
		for(int i=0; i<S.length();i++) {      
			if (S.charAt(i)>='A' && S.charAt(i)<='Z') {
				for(int j=i+1; j<S.length(); j++) {
					if(S.charAt(i)==S.charAt(j) && S.charAt(i)!=' ') {
						c++;
					}					
				}
			}
		}
	System.out.println("total number of repeated uppercase characters = "+c);
	}
	
	
	public static void TotalRepeatedLowerCase(String S) {
		int d=0;
		for(int i=0; i<S.length();i++) {
			if(S.charAt(i)>='a' && S.charAt(i)<='z'){
				for(int j=i+1; j<S.length(); j++) {
					if(S.charAt(i)==S.charAt(j) && S.charAt(i)!=' ' ) {
						d++;
					}
				}
			}
 		}
		System.out.println("Total number of repeated lowercase characters = "+ d);
	}
	
	public static void TotalRepeatedInteger(String S) {
		int e=0;
		for(int i=0; i<S.length();i++) {
			if(S.charAt(i)>='0' && S.charAt(i)<='9') {
				for(int j=i+1;j<S.length();j++) {
					if(S.charAt(i)==S.charAt(j) && S.charAt(i)!=' ' ) {
					e++;
				}
			  }
		   }
		}
		System.out.println("Total number of repeated integers =  "+e);
	}
	
	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String= ");
		String S =Sc.nextLine();
		TotalRepeatedUpperCase(S);
		TotalRepeatedLowerCase(S);
		TotalRepeatedInteger(S);
		Sc.close();

  }
}
