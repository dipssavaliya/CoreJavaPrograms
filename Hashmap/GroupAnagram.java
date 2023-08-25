package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	public static void main(String[] args) {
		String[] strs = { "eat", "tea","dog" };
		 List<List<String>> groupanam = groupAnagrams(strs);
		groupanam.stream().forEach(System.out::println);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String,List<String>> map = new HashMap<>();
		for(String s: strs)
		{
			char[] cArray = s.toCharArray();
			Arrays.sort(cArray);
			String s1 = new String(cArray);
			//System.out.println(s1);
			
			if(!map.containsKey(s1))
			{
				map.put(s1, new ArrayList<>());
			}
			map.get(s1).add(s);
		}
		
		
		return new ArrayList<>(map.values());

	}
}
