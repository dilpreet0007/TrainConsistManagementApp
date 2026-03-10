package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;

/*
 * UC8: Filter Passenger Bogies Using Streams
 * 		Stored Bogies in class
 * 		Filter bogies with capacity > 60
 * 
 * @author Dilpreet
 * @version 8.0
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
		bogies.add(new Bogie("General",90));
		
		System.out.println("All Bogies:");
		
		for(Bogie b : bogies) {
			System.out.println(b.name + " -> " + b.capacity);
		}
		
		bogies = bogies.stream().filter(bogie -> bogie.capacity > 60).collect(Collectors.toList());
		
		System.out.println();
		System.out.println("Filtered Bogies > 60:");

		for(Bogie b : bogies) {
			System.out.println(b.name + " -> " + b.capacity);
		}
		

	}

}
