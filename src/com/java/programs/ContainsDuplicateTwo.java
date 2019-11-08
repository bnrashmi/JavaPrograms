package com.java.programs;

import java.util.HashMap;

public class ContainsDuplicateTwo {

	public static void main(String[] args) {

		int [] nums = {1,2,3,1};
		int k =3;
		
		System.out.println(containsNearbyDuplicate(nums, k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		if(k > nums.length) {
			return false;
		}
		
		for(int i=0;i<nums.length;i++) {
			
			int j=1;
			while(j <nums.length) {
				if(nums[j] == nums[i] && (j-i)==k) {
					return true;
				}
				j++;
			}
		}
		
		return false;
	}
}
