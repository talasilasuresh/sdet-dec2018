package com.training.sdet.day3;


import java.util.*;
import java.util.Map.Entry;

public class MapEx01 {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("Harry", 4000);
	map.put("Peter", 5000);
	map.put("Britt", 6000);
	
	System.out.println("harry Balance " + map.get("Harry"));
	System.out.println("pater Balance " + map.get("Peter"));

	Set set = map.entrySet();
	Iterator itr = set.iterator();
	
	while(itr.hasNext()){
		Map.Entry element = (Entry) itr.next();
		
		System.out.println(element.getKey() +"," + element.getValue()); 
		
	}

}
}
