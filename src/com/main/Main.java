package com.main;

import java.util.*;

/*
 * UC5: Preserve Insertion Order of Bogies
 * 		Used LinkedHashSet to maintain order
 * 		Avoid Duplicates
 * 		Checking Consist
 * 
 * @author Dilpreet
 * @version 5.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		Set<String> trainConsist = new LinkedHashSet<>();
		
		
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		
		trainConsist.add("Engine");
		
		System.out.println("Initial Train Consist:\n" + trainConsist + "\n");
		

	}

}
