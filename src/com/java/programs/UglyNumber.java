package com.java.programs;

public class UglyNumber {
	
	public static void main(String[] args) {
		
		int num =  14;
		System.out.println(isUgly(num));
	}

	 public static boolean isUgly(int num) {
	
		 boolean flag = false;
			
			if(num==0)
				flag = false;
			
			else{
				while(num%2==0){
					num/= 2;
				}
				while(num%3==0){
					num/=3;
				}
				while(num%5==0){
					num/=5;
				}
			}
			
			if(num==1){
				flag = true;
			}
			
			return flag;
	 }
}
