package setBigDataExamples;

import java.util.HashSet;
import java.util.Set;

public class CountrySet {

public Set<Set<String>> addStates(){
		
		Set<String> maharashtra = new HashSet<String>();
		maharashtra.add("SHIRPUR");
		maharashtra.add("DHULE");
		maharashtra.add("NASHIK");
		maharashtra.add("SHIRPUR");
		
		Set<String> madhyapradesh =new HashSet<String>();
		madhyapradesh.add("BHOPAL");
		madhyapradesh.add("REVA");
		madhyapradesh.add("SENDHWA");
		madhyapradesh.add("REVA");
		
		Set<String> gujarat = new HashSet<String>();
		gujarat.add("AHMEDABAD");
		gujarat.add("NAVSARI");
		gujarat.add("POICHA");
		gujarat.add("AHMEDABAD");
		
		Set<Set<String>> india = new HashSet<Set<String>>();
		india.add(maharashtra);
		india.add(madhyapradesh);
		india.add(gujarat);
		
		return india;
	}
}
