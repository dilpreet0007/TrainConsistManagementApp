package com.main;

import java.util.*;

/*
 * UC4: Maintain Ordered Bogie IDs
 * 		Used LinkedList to maintain order
 * 		add in particular position
 * 		used removeLast and removeFirst
 * 
 * @author Dilpreet
 * @version 4.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		List<String> trainConsist = new LinkedList<>();
		
		
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Gaurd");
		
		System.out.println("Initial Train Consist:\n" + trainConsist + "\n");
		
		trainConsist.add(2, "Pantry Car");
		System.out.println("Pantry Car is added at second position:\n" + trainConsist +"\n");
		
		trainConsist.removeFirst();
		trainConsist.removeLast();
		System.out.println("After Removing Fist And Last Bogie:\n" + trainConsist + "\n");
		
		

	}

}
