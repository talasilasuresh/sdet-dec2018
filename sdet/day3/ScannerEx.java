package com.training.sdet.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerEx {
	static  Map<String, String[]> myMap = new HashMap<>();
	
	static {
	myMap.put("goodmorning", new String[] {"good morning", "bonjour"});
	}
	


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true){
    System.out.println("Enter Your Name");
    int choice = sc.nextInt();
    		
    switch (choice) {
    case 1:
    	System.out.println("You choose 1 ");
    	break;
    
    default:
    	System.out.println("You choose 1 ");
    	break;
    	
    
    }
	}
}
}

