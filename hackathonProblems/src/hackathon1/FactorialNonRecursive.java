package hackathon1;

import java.util.Scanner;

public class FactorialNonRecursive {
	
	public static void main(String[] args) {
		long fact = 1;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number =");
		int num = Sc.nextInt();
		
		for(long i = 1; i<=num; i++) {
			 fact = fact*i;
		}
		System.out.println("Factorial of the Number is "+ fact);
		
		Sc.close();
		
		
	}

}
