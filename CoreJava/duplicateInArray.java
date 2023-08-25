package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateInArray {

	
	    public int removeDuplicates(int[] nums) {
	    
	    int count =0;
	    int duplicateCount=0;
	    List<Integer> test = new ArrayList<>();
	        for(int i=0; i<nums.length-1;i++)
	        {
	        	
	        	if(duplicateCount>1 && nums[i]==nums[i+1])
	            {
	                continue;
	            }
	        	
	            if(nums[i]==nums[i+1])
	            {
	                duplicateCount++;
	                ++count;
	                test.add(nums[i]);
	                
	            }
	            if(nums[i]!=nums[i+1])
	            {
	            	count++;
	            	 test.add(nums[i]);
	            }
	            
	            
	        }
	        System.out.println("list of element: "+test.toString());
	        return count;
	    }
	
	public static void main(String[] args)
	{
		duplicateInArray dA = new duplicateInArray();
		//int[] test = {1,1,1,2,2,3};
		int count = dA.removeDuplicates(new int[] {1,1,1,2,2,3});
		System.out.print(count);
	}
}
