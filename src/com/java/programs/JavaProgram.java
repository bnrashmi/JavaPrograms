package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaProgram {

	public static void main(String[] args) {

		/*
		 * 
		 * remove duplicates elements in the array
		 * 
		 * 
		 * int arr[] = {13,10,44,10,22,5,13};
		 * 
		 * arr = removeDuplicatesElementsInArray(arr); for(int j=0;j<arr.length;j++) {
		 * System.out.println(arr[j]); }
		 */

		/*
		 * print prime numbers between two numbers
		 * 
		 * int num1 = 10, num2 = 40;
		 * 
		 * printPrimeNumsBetweeenTwoNum(num1, num2);
		 * 
		 */

		/*
		 * print string in reverse order
		 * 
		 * String str = "Rashmi"; reverseString(str);
		 * 
		 */

		/*
		 * 
		 * Print remainder of the number
		 * 
		 * int num = 563; printRemainderOfNumber(num);
		 * 
		 */

		/*
		 * Count frequency of number
		 * 
		 * int [] num = {1,1,2,0,3,4,5,8,7,6,0,0,1,1}; countFrequencyOfNum(num);
		 */
		
		
		
		/*
		 *  Find Largest element in the array 
		 *  
		 * int [] num = {20,12,10,14, 22,45};
		 * 
		 * findLargestElementInArray(num);
		 */
		
		/*
		 *  second largest element in the array 
		 *  
		 * int [] num = {20,12,10,14, 22,45}; secondLargestElementInUnsortedArray(num);
		 */
		
		/*
		 * second smallest element in the array
		 * int [] num = {20,12,10,14, 22,45}; secondSmallestElementInUnsortedArray(num);
		 */
		
	}

	/* second smallest element in the array */
	private static void secondSmallestElementInUnsortedArray(int[] num) {
			int first =num[0],second =0;
			
			for(int i=1;i<num.length;i++) {
				if(num[i] < first) {
					second =first;
					first = num[i];
				}else if(num[i] < second && num[i]!= first) {
					second = num[i];
				}
			}
			
			System.out.println(second);
	}

	/* second largest element in the array */
	private static void secondLargestElementInUnsortedArray(int[] num) {
			
		int first =num[0], second =0;
		
		for(int i=1;i<num.length;i++) {
			if(num[i] > first) {
				second =first;
				first = num[i];
			}else if(num[i] > second && num[i]!= first) {
				second = num[i];
			}
		}
		
		System.out.println(second);
	}

	/* Find Largest element in the array */
	private static void findLargestElementInArray(int[] num) {
		int temp = num[0];
		for(int i=1;i<num.length;i++) {
			
			if(num[i] > temp) {
				temp = num[i];
			}
		}
		System.out.println(temp);
		
	}

	/* Count frequency of number */
	private static void countFrequencyOfNum(int[] num) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {

			if (map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]) + 1);
			} else {
				map.put(num[i], 1);
			}
		}

		for (Integer key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

	/* Print remainder of the number */
	private static void printRemainderOfNumber(int num) {

		if (num > 10) {
			num = num % 10;
		}
		System.out.println(num);
	}

	/* print string in reverse order */
	private static void reverseString(String str) {

		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(i - 1));
		}
	}

	/* print prime numbers between two numbers */
	private static void printPrimeNumsBetweeenTwoNum(int num1, int num2) {

		for (int i = num1; i <= num2; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}

	// remove duplicates elements in the array
	private static int[] removeDuplicatesElementsInArray(int[] arr) {

		Arrays.sort(arr);
		int a[] = new int[arr.length], len = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				a[len++] = arr[i];

			}
		}
		a[len] = arr[arr.length - 1];
		return a;
	}
}
