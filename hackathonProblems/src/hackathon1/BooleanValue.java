//Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 


package hackathon1;

import java.util.Scanner;

public class BooleanValue {

	public static void main(String[] args) {
		
	boolean result;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three Boolean Values =");
	boolean a = input.nextBoolean();
	boolean b = input.nextBoolean();
	boolean c = input.nextBoolean();
	
	if(a) {
		result=b || c;
	}	
		else {
			result = b && c;
		}
		
		if (result){
			System.out.println("Two Boolean variables are true");
		}
		else
			System.out.println("Two Boolean variables are not true");
		
		input.close();
	}
		
		
		
	}


