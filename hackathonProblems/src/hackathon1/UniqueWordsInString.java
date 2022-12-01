//Q15. Given a string print the unique words of the string.

package hackathon1;

public class UniqueWordsInString {
	
	public static void UniqueWords(String str) {
		
		int count;
		String[] words = str.split(" ");
		//for(String a:words) {
			//System.out.println(a);
		//}
		//System.out.println(Arrays.toString(words));
		for(int i=0;i<words.length;i++) {
			count = 1;
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
				count++;
				words[j]="";
			}
		}
			if(count==1 && words[i] != ""){
				System.out.println(words[i]);
			}
		}
			
	}
		public static void main(String[] args)
	    {
	        String str = "Dog chases Cat Cat chases rat";
	 
	        UniqueWords(str);
	    }
	
}

