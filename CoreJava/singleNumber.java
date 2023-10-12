package CoreJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class singleNumber {
	
	 public int singleNumber1(int[] nums) {
	        Map<Integer, Integer> counterMap= new HashMap<>();
	        Arrays.sort(nums);
	        
	        for(int i=0;i<=nums.length-1;i++)
	        {
	        	if(counterMap.containsKey(nums[i]))
	        	{
	        		counterMap.put(nums[i], counterMap.get(nums[i])+1);
	        		System.out.println("key ="+nums[i] + "value = "+ counterMap.get(nums[i]+1));
	        	}
	        	else
	        	{
	        		counterMap.put(nums[i],1);
	        	}
	        }
	 
	        for (Map.Entry entry : counterMap.entrySet()) {
	        	if(counterMap.containsValue(1))
	        	{
	            System.out.println("final key = "+entry.getKey() + " final value=" + entry.getValue());
	            return (int) entry.getKey();
	        	}
	        }

	        return 0;
	    }
	public static void main(String[] args)
	{
		singleNumber sN = new singleNumber();
		int[] nums = {1,1,3};
		int ans =sN.singleNumber1(nums);
		System.out.println("ans = "+ans);
	}

}
