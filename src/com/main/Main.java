package com.main;

import java.util.*;

/*
 * UC1: Initialize Train and Display Consist Summary
 * 		TrainConsist is Initialized
 * 		Its size is checked
 * 		Its current state is printed
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		
		ArrayList<String> trainConsist = new ArrayList<>();
		
		System.out.println("Train Initialized Successfully....");
		System.out.println("Initial Bogie Count: " + trainConsist.size());
		System.out.println("Current Train Consist: " + trainConsist);

	}

}
