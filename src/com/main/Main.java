package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;

/*
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 * 		Grouped the same bogies in a map
 * 		Used Stream to do grouping
 * 
 * @author Dilpreet
 * @version 9.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		List<Bogie> bogies = new ArrayList<>();
		
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Sleeper",92));
		bogies.add(new Bogie("AC Chair",66));
		bogies.add(new Bogie("General",90));
		
		System.out.println("All Bogies:");
		
		for(Bogie b : bogies) {
			System.out.println(b.name + " -> " + b.capacity);
		}
		
		Map<String,List<Bogie>> groupedMap = bogies.stream().collect(Collectors.groupingBy(bogie -> bogie.name));
		
		System.out.println();
		System.out.println("Grouped Bogies:\n");

		for(String key : groupedMap.keySet()) {
			System.out.println("Bogie Type: " + key);
			for(Bogie b : groupedMap.get(key)) {
				System.out.println("Capacity -> " + b.capacity);
			}
			System.out.println();
		}
		

	}

}
