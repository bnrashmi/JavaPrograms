
//https://leetcode.com/problems/move-zeroes/
package com.java.programs;

public class MoveZeros {

	
	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums) {

		int j=0,k=0;

		while(j<nums.length) {
			
			if(nums[j]!=0) {
				nums[k] = nums[j];
				System.out.print(nums[k]+" ");
				k++;
			}
			j++;
		}
		
		while(k<nums.length) {
		
			nums[k] = 0;
			
			System.out.print(nums[k] + " ");
			k++;
		}
	}
}
