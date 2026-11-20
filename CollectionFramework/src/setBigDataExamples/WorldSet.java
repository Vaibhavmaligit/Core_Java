package setBigDataExamples;

import java.util.HashSet;
import java.util.Set;

public class WorldSet {

public Set<Set<Set<String>>> addCountry() {
		
	   Set<String> maharashtra = new HashSet<String>();
		maharashtra.add("PUNE");
		maharashtra.add("MUMBAI");
		maharashtra.add("NASHIK");
		
		Set<String> madhyapradesh =new HashSet<String>();
		madhyapradesh.add("INDORE");
		madhyapradesh.add("BHOPAL");
		madhyapradesh.add("UJJAIN");
		
		Set<String> gujarat = new HashSet<String>();
		gujarat.add("SURAT");
		gujarat.add("VAPI");
		gujarat.add("GANDHINAGAR");
		
		Set<Set<String>> india = new HashSet<Set<String>>();
		india.add(maharashtra);
		india.add(madhyapradesh);
		india.add(gujarat);
		
		Set<String> california = new HashSet<String>();
		california.add("LOS ANGELES");
		california.add("SAN FRANSISCO");
		california.add("FRESNO");
		
		Set<String> georgia = new HashSet<String>();
		georgia.add("ATLANTA");
		georgia.add("COLUMBUS");
		georgia.add("AUGUSTA");
		
		Set<String> washington = new HashSet<String>();
		washington.add("OLYMPIA");
		washington.add("SPOKANE");
		washington.add("BELLEVUE");
		
		Set<Set<String>> usa = new HashSet<Set<String>>();
		usa.add(georgia);
		usa.add(washington);
		usa.add(california);
		
		Set<Set<Set<String>>> world = new HashSet<Set<Set<String>>>();
		world.add(india);
		world.add(usa);
		
		return world;
	}
}
