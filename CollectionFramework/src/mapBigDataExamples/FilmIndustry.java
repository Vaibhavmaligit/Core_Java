package mapBigDataExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FilmIndustry {

	public Map<String, Map<Integer, String>> addMovies() {
		
		Map<Integer, String> bollywood = new LinkedHashMap<Integer, String>();
		bollywood.put(111, "DHURANDHAR");
		bollywood.put(222, "3 IDIOTS");
		bollywood.put(333, "DANGAL");
		
		Map<Integer, String> tollywood = new LinkedHashMap<Integer, String>();
		tollywood.put(444, "BAHUBALI");
		tollywood.put(555, "KGF");
		tollywood.put(666, "RRR");
		
		Map<Integer, String> hollywood = new LinkedHashMap<Integer, String>();
		hollywood.put(777, "AVENGERS");
		hollywood.put(888, "SPIDERMAN");
		hollywood.put(999, "AVTAR");
		
		Map<String, Map<Integer, String>> filmindustry = new LinkedHashMap<String, Map<Integer,String>>();
		filmindustry.put("BOLLYWOOD", bollywood);
		filmindustry.put("TOLLYWOOD", tollywood);
		filmindustry.put("HOLLYWOOD", hollywood);
		
		
		return filmindustry;
		
	}
}
