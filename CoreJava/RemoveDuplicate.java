package com.example.demo;

import java.util.HashSet;

public class RemoveDuplicate {

	public int removeDuplicates(int[] nums) {
		int c = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[c] = nums[i];
				c++;
				// System.out.println("value of c ="+nums[c]);
			}

		}
		return c;
	}

	public int removeDuplicates1(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		return set.size();

	}

	public int removeDuplicates2(int[] nums) {
		int index = 0;
		for (int i = index; i < nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				nums[index] = nums[i + 1];

			} else {
				index++;
				nums[index] = nums[i + 1];
			}
		}

		return index;

	}

	public static void main(String[] args) {
		RemoveDuplicate t = new RemoveDuplicate();
		// int k = t.removeDuplicates(new int[] { 1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 6 });
		// int k1 = t.removeDuplicates1(new int[]{1,2,3,3,4,4,5,6});
		int k2 = t.removeDuplicates2(new int[] { 1, 1, 1, 2 });
		// System.out.println(k);
		 System.out.println(k2);
	}

}
