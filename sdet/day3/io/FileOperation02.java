package com.training.sdet.day3.io;

import java.io.File;

public class FileOperation02 {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Huser\\Desktop\\myfolder");
		
		String [] list = file.list();
		
		for(String temp : list) {
			File f = new File(file, temp);
			if(f.isFile() && !f.canWrite()){
				System.out.println(f.getName());
//				System.out.println(f.getFreeSpace());
			}
			//System.out.println(temp.getName());
			//System.out.println(temp);
		}
	
}
}
