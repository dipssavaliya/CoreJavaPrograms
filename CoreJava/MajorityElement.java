package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int ans = majorityElement(new int[] { 2, 3, 3, 4,5,5,5 });
		System.out.print(ans);
	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		// System.out.println(Arrays.toString(nums));
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
//	    for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
//	    {  System.out.println("Key = " + entry.getKey() +
//                             ", Value = " + entry.getValue());
//	    }
	    return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
	

	}
}