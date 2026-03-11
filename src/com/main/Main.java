package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;
import com.bogie.CargoBogie;

/*
 * UC13: Performance Comparison (Loops vs Streams)
 * 		 Loop startTime and endTime is Calculated
 * 		 Stream startTime and endTime is Calculated
 * 		 System.nanoTime() is used
 * 		 
 * @author Dilpreet
 * @version 13.0
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

		long startTime1 = System.nanoTime();
		List<Bogie> list1 = bogies.stream().filter(bogie -> bogie.capacity > 60).collect(Collectors.toList());
		long endTime1 = System.nanoTime();
		
		List<Bogie> list2 = new ArrayList<>();
		long startTime2 = System.nanoTime();
		for(Bogie bogie : bogies) {
			if(bogie.capacity > 60) {
				list2.add(bogie);
			}
		}
		long endTime2 = System.nanoTime();
		
		
		System.out.println("Stream Execution Time(ns): " + (endTime1-startTime1));
		System.out.println("Loop Execution Time(ns): " + (endTime2-startTime2));
	}

}
