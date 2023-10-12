package CoreJava;

import java.util.Arrays;

public class NextGreater {

	public static void main(String[] args) {
		NextGreater n = new NextGreater();
		int[] nums1 = { 2 ,4};
		int[] nums2 = { 1, 2, 3, 4 };
		int[] ans = n.nextGreaterElement(nums1, nums2);
		System.out.print(Arrays.toString(ans));

	}

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums2.length];
		int length = nums2.length;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j] && nums2[j+1]>length) {
					if (nums2[j + 1] > nums2[j])
						result[j] = nums2[j + 1];

					else {
						result[j] = -1;
					}
				} else {
					result[j] = -1;
				}
			}
		}
		return result;
	}
}
