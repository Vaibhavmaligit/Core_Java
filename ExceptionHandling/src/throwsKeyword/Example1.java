package throwsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {



	public static void fileReaader() throws FileNotFoundException, IOException {
		
		System.out.println("1st METHOD");
		FileReader fr = new FileReader("Data.txt");
	}
	
	public static void fileReader1 () throws FileNotFoundException, IOException {
		System.out.println("2nd METHOD");
		fileReaader();
	} 
	
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
		try {
			fileReader1();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
