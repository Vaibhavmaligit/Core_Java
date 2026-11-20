package setBigDataExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniversitySet {

public Set<Set<String>> addUniversity () {
		
	Set<String> mumbaiuniversity = new LinkedHashSet<String>();
		mumbaiuniversity.add("ENGINEERING");
		mumbaiuniversity.add("MEDICAL");
		mumbaiuniversity.add("COMMERCE");
		mumbaiuniversity.add("MEDICAL");
		
		Set<String> shivajiuniversity = new LinkedHashSet<String>();
		shivajiuniversity.add("ARCHITECTURE");
		shivajiuniversity.add("MBA");
		shivajiuniversity.add("DILOMA");
		shivajiuniversity.add("DILOMA");
		
		Set<String> puneuniversity = new LinkedHashSet<String>();		
		puneuniversity.add("ARTS");
		puneuniversity.add("LAW");
		puneuniversity.add("BANKING");
		puneuniversity.add("ARTS");
		
		
		Set<Set<String>> maharashtrauniversity = new LinkedHashSet<Set<String>>();
		maharashtrauniversity.add(mumbaiuniversity);
		maharashtrauniversity.add(shivajiuniversity);
		maharashtrauniversity.add(puneuniversity);
		
		
		
		return maharashtrauniversity;
	}
	
}
