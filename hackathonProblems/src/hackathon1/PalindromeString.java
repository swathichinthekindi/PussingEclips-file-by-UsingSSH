//Write a program to check palindrome (MalayalaM) for both numbers and string?

package hackathon1;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String S = Sc.next();		
		int length = S.length();
		String rev="";
		for(int i=0;i<length;i++) {// Madam
			 rev =S.charAt(i)+rev;
		}
		if(S.equalsIgnoreCase(rev)) {
		System.out.println(S+" is a Palindrome");
		}
		else 
			System.out.println("It is not a palindrome");
		
		System.out.println("Enter a Number = ");
		int Num = Sc.nextInt();
		int ori_num= Num;
		int Rev = 0;
		while(Num!=0) {
			Rev = Rev*10 + Num%10;// 12321
			Num = Num/10;
		}
		if (ori_num==Rev) {
			System.out.println(ori_num+" is a Palindrome");
		}
		else
			System.out.println("Not a palindrome");
		Sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
	
	

