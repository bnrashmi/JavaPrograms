
//https://leetcode.com/problems/merge-sorted-array/
package com.java.programs;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		int m=3,n=3;
		
		merge(nums1, m, nums2, n);
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	  
		 int i=0,j=0,r=0;int[] temp = new int[nums1.length];
		 while(i < m && j < n) {
			 
			 if(nums1[i] < nums2[j]) {
				 temp[r] = nums1[i];
				 i++;
				 r++;
			 }else {
				 temp[r] = nums2[j];
				 j++;
				 r++;
			 }
		 }
		 
		 while(i < m) {
			 temp[r] = nums1[i];
			 i++;
			 r++;
		 }
		 
		 while(j < n) {
			 temp[r] = nums2[j];
			 j++;
			 r++;
			
		 }
		 
		 nums1 = temp;
		 for(int k=0;k<temp.length;k++) {
			 System.out.println(nums1[k]);
		 }
	 }
}
