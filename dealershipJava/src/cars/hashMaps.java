package cars;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashMaps {

	public static void main(String[] args) {
		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
		
		dictionary.put("Alpha", "First latin letter");
		dictionary.put("Beta", "Second Latin letter");
		dictionary.put("Omega",  "Middle Lating letter");
		dictionary.put("Zeta", "Last Latin letter");

//		System.out.println(dictionary.entrySet());		
		
		for (String key: dictionary.keySet()) {
			System.out.println(dictionary.keySet());
		}
	}
}