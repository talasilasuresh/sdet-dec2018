package com.training.sdet.day3.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteOperation {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)); 
		FileWriter fileWriter = null;
		
		try {
			System.out.println("Enter Emp Id :");
			int empId = Integer.parseInt(br.readLine());

			System.out.println("Enter Emp Name ");
			String empName = br.readLine(); 
			
			System.out.println("Emp Id " + empId);
			System.out.println("Emp Name " + empName);
			
			File file  = new File("Sample.txt"); 
			 fileWriter = new FileWriter(file, true); 
			
			fileWriter.append("Emp Id " + empId  + "\n");
			fileWriter.append("Emp Name " + empName+ "\n");
			
			System.out.println("Contents written to file");
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
