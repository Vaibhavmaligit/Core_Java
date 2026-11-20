package mapBigDataExamples;

import java.util.HashMap;
import java.util.Map;

public class UniversityMap {

	public Map<String,Map<Integer, String> > addUniversity() {
		
		Map<Integer, String> puneuniversity = new HashMap<Integer, String>();
		puneuniversity.put(111, "ENGINEERING");
		puneuniversity.put(222, "COMMERCE");
		puneuniversity.put(333, "MEDICAL");
		
		Map<Integer, String> shivajiuniversity = new HashMap<Integer, String>();
		shivajiuniversity.put(444, "ARTS");
		shivajiuniversity.put(555, "BTECH");
		shivajiuniversity.put(666, "LAW");
		
		Map<Integer, String> mumbaiuniversity = new HashMap<Integer, String>();
		mumbaiuniversity.put(111, "ARCHITECTURE");
		mumbaiuniversity.put(222, "MBA");
		mumbaiuniversity.put(333, "DIPLOMA");
		
		Map<String,Map<Integer, String> > maharashtrauniversity = new HashMap<String, Map<Integer,String>>();
		maharashtrauniversity.put("PUNE", puneuniversity);
		maharashtrauniversity.put("SHIVAJI", shivajiuniversity);
		maharashtrauniversity.put("MUMBAI", mumbaiuniversity);
		
		return maharashtrauniversity;
	}
}
