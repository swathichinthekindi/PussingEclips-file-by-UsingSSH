//Q27. WJP to perform ascending order Quick sort

package hackathon1;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
	int[]a = {40,25,129,75,43,23,65,25,70,90};
	
	QuickSort obj = new QuickSort();
	obj.sort(a, 0, a.length-1);
	System.out.println(Arrays.toString(a));
	
	}
	
	
	public int partition(int[]a, int lowerBound, int upperBound) {  
		int pivot = a[lowerBound];
		int start = lowerBound;
		int end = upperBound;
		while(start<end) {
			while(start<a.length && a[start]<=pivot) {
				start++;
			}
			while(end<a.length && a[end]>pivot ) {
				end--;
			}
			if (start<end) {
				swap(a, start, end);
			}
		}
		
		swap(a,lowerBound, end);
		return end;
	}
	
	
	public void swap(int[]a,int s, int e) {
		int temp = a[s];
		a[s]= a[e];
		a[e]= temp;
	}
	
	
	public void sort(int[]a, int lowerBound, int upperBound) {
		
		if(lowerBound<upperBound) {
			int pLocation = partition(a,lowerBound,upperBound);
			sort(a,lowerBound, pLocation-1);
			sort(a, pLocation+1, upperBound);
			
		}
		
	}
	

}
