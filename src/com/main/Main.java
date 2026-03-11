package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;
import com.bogie.CargoBogie;

/*
 * UC14: Handle Invalid Bogie Capacity (Custom Exception)
 * 		 Capacity must be greater than zero
 * 		 if its less than zero display error
 * 		 Used custom Exceptions
 * 		 
 * @author Dilpreet
 * @version 14.0
 */

public class Main {

	public static void main(String[] args){
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		//List<Bogie> bogies = new ArrayList<>();

		try{
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Enter Bogie Name: ");
//			String name = sc.nextLine();
//			System.out.print("Enter Capacity: ");
//			int capacity = sc.nextInt();
			
			Bogie b1 = new Bogie("Sleeper",72);	
			System.out.println("Created Bogie: " + b1.name + " -> " + b1.capacity);
			
			Bogie b2 = new Bogie("Sleeper",0);	
			System.out.println("Created Bogie: " + b2.name + " -> " + b2.capacity);
			
		}catch(InvalidCapacityException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}
	
	public static class InvalidCapacityException extends Exception{
		public InvalidCapacityException(String message){
			super(message);
		}
	}

}
