package interviewCodes;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCode {

	public static void main(String[] args) {

	HashMap<String, Integer> map = new LinkedHashMap<>();
	map.put("Rahul", 1025);
	map.put("Singh", 1625);
	map.put("Lodhi", 1925);
	
	System.out.println(map);
	
	Set<String> keys = map.keySet();
	
	System.out.println(keys);
	
	Collection<Integer> values = map.values();
	
	System.out.println(values);
	
	map.putIfAbsent("RahulSingh", 12345);
	System.out.println(map);
	
	Set<Entry<String,Integer>> entrySet = map.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1500) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
		
	}

}
