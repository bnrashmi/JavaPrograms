package com.java.programs;

import java.util.Scanner;

public class RotateArrayByNelemets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("test case");
		int testcase =  2;//scanner.nextInt();
		int num[] = new int[2];
		
		System.out.println("enter size and rotation");
		for(int i=0;i<2;i++) {
			num[i] = scanner.nextInt();
		}
		
		int array [] = new int[num[0]];
		System.out.println("enter array of elements");
		for(int j=0;j < num[0];j++) {
			array[j] = scanner.nextInt();
		}
		
		for(int k=0;k<num[1];k++) {
			int temp = array[0];
			int n = 0; 
			while(n <array.length-1){
				array[n] = array[n+1];
				n++;
			}
			if(n == array.length-1) {
				array[n] = temp;
			}
		}
		
		for(int m = 0; m <array.length;m++) {
			System.out.println(array[m]);
		}
	}
}
