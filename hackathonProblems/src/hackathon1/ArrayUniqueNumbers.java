//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

package hackathon1;

import java.util.Scanner;

public class ArrayUniqueNumbers {
	
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = Sc.nextInt();
		int A[]= new int[size];
		System.out.println("Enter the list of numbers= ");
		for(int i=0; i<size; i++) {
		 A[i]= Sc.nextInt();
		}
		
		int flag = 0;
		int count = 1;
		for(int i=0;i<size;i++) {
			flag = 0;
			for(int j=i+1;j<size;j++) {
				if(A[i]==A[j]) {
					count++;
					flag = 1;
					A[j]= 0;
					break;
				}
				
			}

			if (flag ==0 && A[i]!=0)
				System.out.println(A[i]);
			else if (A[i]!=0)
				System.out.println("number of occurences of "+ A[i]+ " is "+count);
				
			
					
	}
		Sc.close();
	}
}
				
				
				
			
		
	
	

		
