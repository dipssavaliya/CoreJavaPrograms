package Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));

	}

	public static boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> map = new HashMap<>();
		String[] arr = s.split(" ");
		System.out.println(arr.length);
		System.out.println(s.length());
		if(arr.length!=s.length())
        {
            return false;
        }
		
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<pattern.length();i++)
		{
			if(map.containsKey(pattern.charAt(i)))
			{
				if(!map.get(pattern.charAt(i)).equals(arr[i]))
				{
					return false;
				}
			}
			
			else
			{
				if (map.containsValue(arr[i])) {
					return false;
				}
				map.put(pattern.charAt(i), arr[i]);
			}
		}
//		for(Map.Entry mp: map.entrySet()){  
//			System.out.println(mp.getKey()+ " "+mp.getValue());  
//			}
		return true;

	}
}
