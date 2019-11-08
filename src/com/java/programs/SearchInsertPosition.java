package com.java.programs;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = { 1,3,5,6};
		int target = 7;

		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {

		int first = 0;
		int last = nums.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				first = mid +1;
			}else {
				
				last = mid -1;
			}
			
			mid = (first+last)/2;
		}
		return first;
	}
}
