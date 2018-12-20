package com.training.sdet.day3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx02 {
	public static void main(String[] args) {
		
		TreeSet<Emp> set = new TreeSet<>();
		
		set.add(new Emp(101, "Kumar", 3344));
		set.add(new Emp(105, "Frank", 5344));
		set.add(new Emp(123, "Urvi", 5544));
		set.add(new Emp(101, "Kumar", 3344));
		set.add(new Emp(678, "Archana", 5555));
		
		for(Emp temp : set){
			System.out.println(temp + "," + temp.hashCode());
		}
	}
}
