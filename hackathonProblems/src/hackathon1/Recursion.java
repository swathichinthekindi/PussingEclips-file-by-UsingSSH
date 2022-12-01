package hackathon1;

public class Recursion {
	
	public static int Factorial(int num) {
		if (num>=1) {
		return num* (Factorial(num-1));
		}
		else
		return 1;
			
	}
	
	public static void main(String[] args) {
		
		int fact = Factorial(4);
		System.out.println("Factorial of 4 is "+ fact);
		
		
		
	}
	

}
