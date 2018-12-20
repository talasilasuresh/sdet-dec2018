package com.training.sdet.day3.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteOperation_1 {
	
	public static void main(String[] args) {
	
	try {
		BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
		
		String line = "";
				
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
	
}
