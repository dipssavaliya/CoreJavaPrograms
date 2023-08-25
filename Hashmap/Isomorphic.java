package Hashmap;

import java.util.HashMap;

public class Isomorphic {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
	}

	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
			}
			else 
			{
				if (map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			}

		}

		return true;

	}
}
