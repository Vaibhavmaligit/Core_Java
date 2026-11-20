package listBigDataExamples;

import java.util.ArrayList;
import java.util.List;

public class UniversityList {

	public List<List<String>> addUniversity () {
		
		List<String> mumbaiuniversity = new ArrayList<String>();
		mumbaiuniversity.add("ENGINEERING");
		mumbaiuniversity.add("MEDICAL");
		mumbaiuniversity.add("COMMERCE");
		
		List<String> puneuniversity = new ArrayList<String>();		
		puneuniversity.add("ARTS");
		puneuniversity.add("LAW");
		puneuniversity.add("BANKING");
		
		List<String> shivajiuniversity = new ArrayList<String>();
		shivajiuniversity.add("ARCHITECTURE");
		shivajiuniversity.add("MBA");
		shivajiuniversity.add("DILOMA");
		
		List<List<String>> maharashtrauniversity = new ArrayList<List<String>>();
		maharashtrauniversity.add(puneuniversity);
		maharashtrauniversity.add(mumbaiuniversity);
		maharashtrauniversity.add(shivajiuniversity);
		
		return maharashtrauniversity;
	}
	
}
