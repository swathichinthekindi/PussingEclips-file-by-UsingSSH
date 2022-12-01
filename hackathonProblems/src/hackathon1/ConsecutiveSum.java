//Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, 
//which when added give N. 
//INPUT:  N = 9  	OUTPUT:  4 + 5       2 + 3+ 4

package hackathon1;

import java.util.Scanner;

public class ConsecutiveSum {
	
	static void findConsecutive(int N)
	{
		int start = 1;
	    int end = (N + 1) / 2;
	    while (start < end)
	    {
	    	int sum = 0;
	    
        for (int i = start; i <= end; i++)
        {
            sum = sum + i;
	
            if (sum == N)
            {
            	for (int j = start; j <= i; j++)
                    
                    System.out.print(j + " ");
                    System.out.println();
                break;
            }
            if (sum>N)
            	break;
        }
            
            sum = 0;
            start++;
        }
    }
	
     
    public static void main (String[] args) {
    	Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int N = Sc.nextInt();
    	
        findConsecutive(N);
     
        Sc.close();
    }
            
}
            
	