//Given an array of integers, sort the integer values.

package hackathon1;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Array Size= ");
	int size = input.nextInt();
	int A[] = new int[size];
	System.out.println("Enter a list of numbers= ");
	for(int i=0; i<size; i++) {
		A[i]= input.nextInt();
	}
	for(int i=0;i<size-1;i++) {
		for(int j=0; j<size-1; j++) {
			if( A[j]>A[j+1]) {
			int temp = A[j];
			A[j]= A[j+1];
			A[j+1]= temp;
		}
		
	}
	}
	for(int e:A) {
		System.out.println(e);
	
	}
	//System.out.println("Sorted Array = "+Arrays.toString(A));
	input.close();

	}
}
