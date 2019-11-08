package com.java.programs;

public class FibinociNumber {

	public static void main(String[] args) {

		int N = 2;
		System.out.println(fib(N));
	}

	public static int fib(int N) {

		int fib0 =0,fib1=1, fib2=0;
		if(N ==0){
            return fib0;
        }else if(N==1){
            return fib1;
        }
		int i=2;
		while(i <=N) {
			fib2 = fib0 +fib1;
			fib0 = fib1;
			fib1 = fib2;
			i++;
		}
		
		 return fib2;
	}
}
