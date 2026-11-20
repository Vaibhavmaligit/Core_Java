package mapBigDataExamples;

import java.util.HashMap;
import java.util.Map;

public class WorldMap {

	public Map<String,Map<String,Map<Integer, String>>> addWorld() {
		
		Map<Integer, String> maharashtra = new HashMap<Integer, String>();
		maharashtra.put(11, "NASHIK");
		maharashtra.put(22, "PUNE");
		maharashtra.put(33, "MUMBAI");
		
		Map<Integer, String> rajasthan = new HashMap<Integer, String>();
		rajasthan.put(44, "JAIPUR");
		rajasthan.put(55, "UDAIPUR");
		rajasthan.put(66, "JAISALMERS");
		
		Map<String,Map<Integer, String>> india = new HashMap<String, Map<Integer,String>>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("RAJASTHAN", rajasthan);
		
		Map<Integer, String> california = new HashMap<Integer, String>();
		california.put(10, "LOS ANGELES");
		california.put(20, "SAN FRANSISCO");
		california.put(30, "FRESNO");
		
		Map<Integer, String> georgia = new HashMap<Integer, String>();
		georgia.put(40, "ATLANTA");
		georgia.put(50, "COLUMBUS");
		georgia.put(60, "AUGUSTA");
		
		Map<String,Map<Integer, String>> usa = new HashMap<String, Map<Integer,String>>();
		usa.put("CALIFORNIA", california);
		usa.put("GEORGIA", georgia);
		
		Map<String,Map<String,Map<Integer, String>>> world = new HashMap<String, Map<String,Map<Integer,String>>>();
		world.put("INDIA", india);
		world.put("USA", usa);
		
		
		return world;
		
		
	}
}
