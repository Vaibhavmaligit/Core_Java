package listBigDataExamples;

import java.util.ArrayList;
import java.util.List;

public class CountryList {

	public List<List<String>> addStates(){
		
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("PUNE");
		maharashtra.add("MUMBAI");
		maharashtra.add("NASHIK");
		
		List<String> madhyapradesh =new ArrayList<String>();
		madhyapradesh.add("INDORE");
		madhyapradesh.add("BHOPAL");
		madhyapradesh.add("UJJAIN");
		
		List<String> gujarat = new ArrayList<String>();
		gujarat.add("SURAT");
		gujarat.add("VAPI");
		gujarat.add("GANDHINAGAR");
		
		List<List<String>> india = new ArrayList<List<String>>();
		india.add(maharashtra);
		india.add(madhyapradesh);
		india.add(gujarat);
		
		return india;
	}
}
