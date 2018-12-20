package com.training.sdet.day3.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) 
			throws IOException {
		File file = new File("Sample.txt");
		
		if(file.exists()) {
			System.out.println("File exists...");
			System.out.println("Modified time :" + new Date(file.lastModified()));
			System.out.println("Read : " + file.canRead());
			System.out.println("Write : " + file.canWrite());
			System.out.println("Path : " + file.getAbsolutePath());
//			file.delete();
		}else {
			file.createNewFile();
			System.out.println("File created..");
		}
	
	 System.out.println("Job done");
	}

}
