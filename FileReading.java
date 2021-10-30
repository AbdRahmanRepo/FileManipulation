package com.Demo.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) throws Throwable {
		String location ="SampleFile.txt";
		FileReader fileReader = new FileReader(location);
		
		BufferedReader reader = new BufferedReader(fileReader);
		
		String currentLine = reader.readLine();
		while((currentLine = reader.readLine()) != null) {
			System.out.println("currentLine");
		}
		
	}
	
}
