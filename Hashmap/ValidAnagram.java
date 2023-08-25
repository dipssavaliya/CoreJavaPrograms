package Hashmap;

import java.util.*;

public class ValidAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("abcba", "cbbaa"));

	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
			} else {
				map1.put(s.charAt(i), 1);
			}
		}
		for (int j = 0; j < t.length(); j++) {
			if (map2.containsKey(t.charAt(j))) {
				map2.put(t.charAt(j), map2.get(t.charAt(j)) + 1);
			} else {
				map2.put(t.charAt(j), 1);
			}
		}
/*	for(Map.Entry mp: map1.entrySet()){  
		System.out.println(mp.getKey()+ " "+mp.getValue());  
		}
	for(Map.Entry mp: map2.entrySet()){  
		System.out.println(mp.getKey()+ " "+mp.getValue());  
		}*/
		return map1.entrySet().stream().allMatch(e -> e.getValue().equals(map2.get(e.getKey())));

	}

}
