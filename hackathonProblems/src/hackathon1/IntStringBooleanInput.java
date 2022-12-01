//Q23. WJP to differentiate input as string, int or bool

package hackathon1;

import java.util.Scanner;

public class IntStringBooleanInput {
	
	static boolean IsNumber(String S) {
		for(int i = 0; i<S.length();i++) {
			if(Character.isDigit(S.charAt(i))==false)
				return false;
		}
		return true;	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value: ");
	    String S = sc.next(); 
	    
	    if (IsNumber(S))
            System.out.println("Integer");
	    
	   else if
	   ((S.equalsIgnoreCase("true")||S.equalsIgnoreCase("false"))) {
	    	System.out.println("Boolean");
	    }
	    else
	    	System.out.println("String");
	   
	   sc.close(); 
	}
	   
}