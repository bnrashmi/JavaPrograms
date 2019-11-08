package com.java.programs;

public class MaximumSubArray {

	
	public static void main(String[] args) {
		
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
        
		/*int max =0;
		
		for(int i=1;i<nums.length;i++) {
			int sum =0;
			for(int j=i;j<nums.length;j++) {
				sum =sum + nums[j];
			}
			
			if(max < sum) {
				max = sum;
			}
		}
		
		
		return max;*/
		
		int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < nums.length; i++){
            curSum+= nums[i];   
            if(curSum > maxSum) {
                maxSum = curSum;
            }
            if(curSum < 0) {    
                curSum = 0;
            }           
        }
        
        return maxSum;
    }
}
