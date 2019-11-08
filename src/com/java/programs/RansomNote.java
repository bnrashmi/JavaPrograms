package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {

		System.out.println(canConstruct("fffbfg",
				"effjfggbffjdgbjjhhdegh"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		/*for(int i=0;i<magazine.length();i++) {
			for(int j=0;j<ransomNote.length();j++) {
				if(magazine.charAt(i)==ransomNote.charAt(j)) {
					ransomNote = ransomNote.replaceFirst(String.valueOf(ransomNote.charAt(j)), "");
					break;
				}
			}
			
			if(ransomNote.length() == 0) {
				return true;
			}
		}*/
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		/*for(int i=0;i<magazine.length();i++) {
			
			if(map.containsKey(magazine.charAt(i))) {
				
				map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
			}else {
				map.put(magazine.charAt(i), 1);
			}
		}
		
		for(int i=0;i<ransomNote.length();i++) {
			
			if(map.containsKey(ransomNote.charAt(i))) {
				if(map.get(ransomNote.charAt(i)) >1) {
					map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
				}else {
					map.remove(ransomNote.charAt(i));
				}
			}else {
				return false;
			}
		}*/
		
		if(ransomNote.length() >magazine.length()) {
			return false;
		}
		for (char t: magazine.toCharArray()) {

				map.put(t, map.getOrDefault(t, 0)+1);
		}

		for (char c : ransomNote.toCharArray()) {

			if (!map.containsKey(c)) {
				return false;
			} 
			map.put(c, map.get(c) - 1);
			if(map.get(c)==0) {
				map.remove(c);
			}
		}
		return true;
	}
}
