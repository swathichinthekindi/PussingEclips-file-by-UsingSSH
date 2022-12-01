//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

package hackathon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadAndWriteFileReverse {
	public static void main(String[] args) throws IOException {
		ArrayList<String>aList = new ArrayList<String>();
		String sPath = "/Users/Shilpa/Documents/application.properties";
		String sPathWrite2 = "/Users/Shilpa/Documents/WriteFile2.properties";
		FileReader oFileReader = new FileReader (sPath);
		BufferedReader oBufferedReader = new BufferedReader(oFileReader);
		
		String str;
		while(( str =oBufferedReader.readLine())!=null) {
			aList.add(str);
		}
		oBufferedReader.close();
		Collections.reverse(aList);
		
		BufferedWriter oBufferedWriter = null;
		try {
			FileWriter oFileWriter= new FileWriter(sPathWrite2);
			oBufferedWriter= new BufferedWriter(oFileWriter);
			for(String S:aList) {
				oBufferedWriter.write(S);
				oBufferedWriter.write("\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			oBufferedWriter.close();
			System.out.println("File writing is completed");
		}
		
		}
		
	}
	


