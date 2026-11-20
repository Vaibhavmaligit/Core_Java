package mapBigDataExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country {

public Map<String, List<String>> addStates(){
		
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("PUNE");
		maharashtra.add("MUMBAI");
		maharashtra.add("NASHIK");
		
		List<String> madhyapradesh =new ArrayList<String>();
		madhyapradesh.add("INDORE");
		madhyapradesh.add("BHOPAL");
		madhyapradesh.add("UJJAIN");
		
		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("MADHYAPRADESH", madhyapradesh);
		
		return india;
}
}