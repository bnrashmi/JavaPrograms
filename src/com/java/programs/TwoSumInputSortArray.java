package com.java.programs;

public class TwoSumInputSortArray {

	
	public static void main(String[] args) {
		
		int [] numbers = {2,7,11,15};
		int target = 9;
		int num[] = twoSum(numbers, target);
		
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+ " ");
		}
	}
	public static int[] twoSum(int[] numbers, int target) {

		
		for(int i = 0;i<numbers.length;i++) {
			int  num = numbers[i];
			
			for(int j=i+1;j<numbers.length;j++) {
				if((num+numbers[j]) == target) {
					return new int[] {i+1,j+1};
				}
			}
		}
		
		return new int[] {};
	}
}
