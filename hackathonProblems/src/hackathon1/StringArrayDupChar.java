
//Q18. WJP to display duplicate character in string
package hackathon1;

import java.util.Scanner;

public class StringArrayDupChar {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter a String = ");
		String S = Sc.nextLine();
		char[] carr = S.toCharArray();
		int count = 1;
		for(int i = 0; i <carr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <carr.length; j++) {  
                if(carr[i] == carr[j] && carr[i] != ' ' && carr[i] != '0') {  
                    count++;  
                    carr[j] = '0';  
                }  
            }  
            if(count > 1 )  
                System.out.println(carr[i]);  
		}
		Sc.close();
	}
	
}
