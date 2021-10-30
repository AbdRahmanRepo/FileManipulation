package com.Demo.com;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriting {
	public static void main(String[] args) throws Throwable {
		
		//Using FileOutputStream(for write raw byte array)
		String location = "SampleFile1.txt";
		String content = "This is the File Writing using File Output Stream";
		
		FileOutputStream fos = new FileOutputStream(location);
		
		byte[] write = content.getBytes();
		
		fos.write(write);
		fos.close();
		
		//Using Path(for write raw byte array)
		
		String location2 = "SampleFile2.txt";
		String content2 = "This is the File Writing using Path";
		
		Path path = Paths.get(location2);
		
		Files.write(path,content2.getBytes());
		
		//Using Buffered writing(Easiest way, Performance wise better and wisely used )
		
		String location3 = "SampleFile3.txt";
		String content3 = "This is the File Writing using Buffered Writer";
		
		FileWriter writter = new FileWriter(location3);
		
		BufferedWriter bufferedWriter = new BufferedWriter(writter);
		
		bufferedWriter.write(content3);
	
		bufferedWriter.close();
		
		//using File Writer(Strainght forward.direction interaction with files,less performance)

		String location4 = "SampleFile4.txt";
		String content4 = "This is the File Writing using File Writer";
		
		FileWriter fwriter = new FileWriter(location4);
		
		fwriter.write(content4);
		fwriter.close();
		
		
		
		
		
	}
}
