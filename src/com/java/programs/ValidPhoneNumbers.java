package com.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumbers {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\JavaPrograms\\JavaPrograms\\src\\com\\java\\programs\\phonenumbers.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		while(bufferedReader.readLine() != null) {
			if(bufferedReader.readLine() != null) {
			Pattern pattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}$");
			Matcher matcher = pattern.matcher(bufferedReader.readLine());
			if(matcher.find()) {
				System.out.println(bufferedReader.readLine() );
			}
			}
		}
	}
	
	
}
