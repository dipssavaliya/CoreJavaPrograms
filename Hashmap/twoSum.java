package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class twoSum {

	public static void main(String[] args) {
		int[] ans = twoSum(new int[] { 2, 6, 7, 8 }, 9);
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		//int[] ans =new int[2];
		for (int i=0;i<nums.length;i++) {
			int compl = target - nums[i];
			if (map.containsKey(compl)) {
				//ans[0]=map.get(compl);
				//ans[1]=i;
				return new int[] {map.get(compl), i};
			} else {
				map.put(nums[i], i);
			}
			//System.out.println(map.getKey()+ " "+map.getValue());  
		}
	
//			for(Entry mp: map.entrySet()){  
//				System.out.println(mp.getKey()+ " "+mp.getValue());  
//				}
//			for(int i:ans)
//			{
//				System.out.println("ans"+i);
//			}
		
		return new int[] {};
	}

}
