package com.training.sdet.day3.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class ObjectStoreAndGet {
	
	// alt + shift + z 
	public static void store(Laptop laptop) {
		ObjectOutputStream oos = null;
		try {
			 oos = 
				new ObjectOutputStream(
				new FileOutputStream("laptop.ser"));
			
			oos.writeObject(laptop);
			oos.writeInt(100);
			oos.writeChars("Hello");
			System.out.println("Data saved... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {} 
		}
	}

	public Laptop getObject() {
		
				try {
			
				ObjectInputStream ois = new 
						ObjectInputStream(new FileInputStream("laptop.ser"));
				
				Laptop laptop = (Laptop) ois.readObject();
				System.out.println(ois.readInt());
				System.out.println(ois.readChar());
				
				return laptop;
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(ClassNotFoundException cnfe) {}
			
			return null;
	
	}
	
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop(1234, 
				"Surface Pro", "Microsoft"); 
		
		store(laptop);
	}
}

