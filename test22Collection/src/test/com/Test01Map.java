package test.com;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Test01Map {

	public static void main(String[] args) {
		System.out.println("Map...");

		Map<String, String> map = new Hashtable<String, String>();
		map.put("name1", "kim");
		map.put("name2", "kim");
		map.put("name3", "kimwwww");
		System.out.println("map.size():"+map.size());
		System.out.println(map.get("name3"));
		Set<String> s = map.keySet();
		for (String key : s) {
			System.out.println(key+">>"+map.get(key));
		}
		
	}

}
