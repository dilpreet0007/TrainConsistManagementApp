package com.main;

import java.util.*;

/*
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * 		IDs added
 * 		Tried to add duplicates
 * 		Its current consist is printed
 * 
 * @author Dilpreet
 * @version 3.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		
		Set<String> trainConsist = new HashSet<>();
		
		//Bogie IDs added in set
		trainConsist.add("BG101");
		trainConsist.add("BG102");
		trainConsist.add("BG103");
		trainConsist.add("BG104");
		
		//try to add duplicates
		trainConsist.add("BG101");
		trainConsist.add("BG102");
		
		System.out.println("Passenger Bogies: " + trainConsist);

	}

}
