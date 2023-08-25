package Hashmap;

import java.util.HashMap;

public class Dictionary {

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "ab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		

		HashMap<Character, Integer> allletters = new HashMap<>();

		for (int i = 0; i < magazine.length(); i++) {
			char m = magazine.charAt(i);
			if (allletters.containsKey(m)) {
				allletters.put(m, allletters.get(m) + 1);
			} else {
				allletters.put(m, 1);
			}
		}

		for (int j = 0; j < ransomNote.length(); j++) {
			char r = ransomNote.charAt(j);
			if (allletters.containsKey(r) && allletters.get(r)>0) {
				allletters.put(r, allletters.get(r) - 1);
			}
			else
			{
				return false;
			}
		}
		return true;
	}

}
