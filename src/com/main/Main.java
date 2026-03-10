package com.main;

import java.util.*;

/*
 * UC6: Map Bogie to Capacity
 * 		Used HashMap to store name and capacity
 * 		Checking Consist
 * 
 * @author Dilpreet
 * @version 6.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		Map<String,Integer> capacityMap = new HashMap<>();
		
		capacityMap.put("First Class", 24);
		capacityMap.put("Cargo", 120);
		capacityMap.put("Sleeper", 72);
		capacityMap.put("AC Chair", 56);
		
		System.out.println("Bogie Capacity Details:");
		
		for(String key : capacityMap.keySet()) {
			System.out.println(key + " -> " + capacityMap.get(key));
		}
		

	}

}
