package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;

/*
 * UC10: Count Total Seats in Train (reduce)
 * 		 Sum of capacity using reduce in stream
 * 		 
 * @author Dilpreet
 * @version 10.0
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
		
		int totalCapacity = bogies.stream().map(bogie -> bogie.capacity).reduce(0, Integer::sum);
		
		System.out.println();
		System.out.println("Total seating capacity of train: " + totalCapacity);


	}

}
