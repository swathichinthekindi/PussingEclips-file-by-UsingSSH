//Given an array of integers check the Palindrome of the series.

package hackathon1;

import java.util.Scanner;

public class ArrayPalindrome {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size =");
		int n = input.nextInt();
		int A[]= new int [n];
		System.out.println("Enter thr list of numbers =");
		for(int i=0; i<n; i++) {
			 A[i]= input.nextInt();
		}
		int flag = 0;
		for(int i=0; i<=n/2 && n!=0; i++) {// 1 2 3 2 1
			if(A[i]!=A[n-i-1]){
				flag = 1;
				break;				
			}		
		}
		if(flag == 1) 
			System.out.println("Not a Palindrome");
		
		else
			System.out.println("Palindrome");
		input.close();
	}

}
