package listBigDataExamples;

import java.util.ArrayList;
import java.util.List;

public class WorldList {

	public List<List<List<String>>> addCountry() {
		
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
		
		List<String> california = new ArrayList<String>();
		california.add("LOS ANGELES");
		california.add("SAN FRANSISCO");
		california.add("FRESNO");
		
		List<String> georgia = new ArrayList<String>();
		georgia.add("ATLANTA");
		georgia.add("COLUMBUS");
		georgia.add("AUGUSTA");
		
		List<String> washington = new ArrayList<String>();
		washington.add("OLYMPIA");
		washington.add("SPOKANE");
		washington.add("BELLEVUE");
		
		List<List<String>> usa = new ArrayList<List<String>>();
		usa.add(georgia);
		usa.add(washington);
		usa.add(california);
		
		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(india);
		world.add(usa);
		
		return world;
	}
}
