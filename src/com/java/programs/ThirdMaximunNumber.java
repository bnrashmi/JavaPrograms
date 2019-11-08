package com.java.programs;

import java.util.Arrays;

public class ThirdMaximunNumber {

	public static void main(String[] args) {

		int nums[] = { -234, 1,2};

		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {

		/*
		 * int max = nums[0]; int secondMax = 0, thirdMax = 0;
		 * 
		 * for (int i = 1; i < nums.length; i++) {
		 * 
		 * if(max < nums[i]) { thirdMax = secondMax; secondMax = max; max =nums[i];
		 * }else if(secondMax < nums[i] && max != nums[i]) { thirdMax = secondMax;
		 * secondMax = nums[i]; }else if( thirdMax < nums[i] && secondMax >nums[i]) {
		 * thirdMax = nums[i]; }
		 * 
		 * 
		 * }
		 * 
		 * if (thirdMax != 0) { return thirdMax; } else { return max; }
		 */

		Arrays.sort(nums);

		int thirdmax =  Integer.MAX_VALUE,temp = nums[nums.length -1];

		int count = 0;
		for (int i = nums.length; i > 0; i--) {

			if(nums[i-1] != thirdmax ) {
				thirdmax = nums[i-1];
				count++;
			}
			if(count ==3) {
				return nums[i-1];
			}
		}
		
		
			return temp;
	}
}
