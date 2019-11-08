package com.java.programs;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int nums[] = {0,1};
		
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
        
		Arrays.sort(nums);
		int i=0;
		for(i = 0;i< nums.length;i++) {

			if(nums[i] !=i) {
				return i;
			}
		}
		return nums.length;
    }
}
