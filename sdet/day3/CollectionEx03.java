package com.training.sdet.day3;

import java.util.Vector;

public class CollectionEx03 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(1, 1);
		
		System.out.println("Size " +vector.size());
		System.out.println("capacity " + vector.capacity());
		
		vector.add("one");
		vector.add("two");
		
		System.out.println("Size " +vector.size());
		System.out.println("capacity " + vector.capacity());
		
	}
}
