package hackathon1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int Num = Sc.nextInt();
		int temp = Num;
		int rem = 0;
		int Rev=0;
		while(temp!=0)
		{
			rem = temp%10;
			Rev=Rev*10+rem;
			temp=temp/10;
			
		}
		System.out.println(temp);
		if(Num==Rev) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		Sc.close();
	
		
	}

}
