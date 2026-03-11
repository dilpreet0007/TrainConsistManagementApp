package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.Bogie;
import com.bogie.CargoBogie;

/*
 * UC15: Safe Cargo Assignment Using try-catch-finally
 * 		 User attempts to assign cargo to a goods bogie.
		 System checks shape and cargo compatibility.
		 If unsafe, an exception is thrown.
		 Exception is caught in the catch block.
		 An error message is displayed.
		 finally block executes cleanup or logging.
		 Program continues safely.
 * 		 
 * @author Dilpreet
 * @version 15.0
 */

public class Main {

	public static void main(String[] args){
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();

		CargoBogie c1 = new CargoBogie("Cylindrical");	
		c1.assignCargo("Petroleum");
		System.out.println();

		CargoBogie c2 = new CargoBogie("Rectanguler");	
		c2.assignCargo("Petroleum");

	}
	
	public static class CargoSafetyException extends RuntimeException{
		public CargoSafetyException(String message){
			super(message);
		}
	}

}
