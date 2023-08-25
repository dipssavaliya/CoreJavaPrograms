package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
		    List<List<Integer>> lst = new ArrayList<>();
		    Set<List<Integer>> st = new HashSet<>();
		        for(int i=0; i<nums.length;i++)
		        {
		            for(int j =i+1; j<nums.length;j++)
		            {
		                for(int k=j+1; k<nums.length;k++)
		                {
		                    if((nums[i]+nums[j]+nums[k])==0)
		                    {
		                    	 st.add(Arrays.asList(nums[i],nums[j],nums[k]));
		                    }
		                }
		            }
		        }
		        System.out.println("lst 1 elements = "+st);
		        return lst;
		    }
	public static void main(String[] args) {
		ThreeSum t = new ThreeSum();
		// int k = t.removeDuplicates(new int[] { 1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 6 });
		// int k1 = t.removeDuplicates1(new int[]{1,2,3,3,4,4,5,6});
		 t.threeSum(new int[] { -1,0,1,2,-1,-4 });
		
		
		
	}

}
