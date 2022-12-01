//Q16. Write a method that will remove given character from the String?

package hackathon1;

public class RemoveChar {
	
	public static String RemovecharAt(String str, int i) {
		
		return str.substring(0, i)+str.substring(i+1);
	}
			

	public static void main(String[] args) {
		
		
		String S = "Apple";
		
		System.out.println(RemovecharAt(S, 1));
		
	}

}
