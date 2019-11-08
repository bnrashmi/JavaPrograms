package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesInArrayList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5);
		List<Integer> temp = new ArrayList<Integer>();
		
		for(Integer integer: list) {
			if(!temp.contains(integer)) {
				temp.add(integer);
				System.out.println(integer);
			}
		}
	}
}
