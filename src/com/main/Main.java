package com.main;

import java.util.*;
import java.util.stream.Collectors;

import com.bogie.CargoBogie;

/*
 * UC12: Safety Compliance Check for Goods Bogies
 * 		 Used Stream allMatch to check Validation
 * 		 Validation checking train is same or not
 * 		 Cylindrical only petroleum condition is used
 * 		 
 * @author Dilpreet
 * @version 12.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		List<CargoBogie> cargoBogie = new ArrayList<>();
		
		cargoBogie.add(new CargoBogie("Cylindrical","Petroleum"));
		cargoBogie.add(new CargoBogie("Open","Coal"));
		cargoBogie.add(new CargoBogie("Box","Grain"));
		cargoBogie.add(new CargoBogie("Cylindrical","Coal"));
		
		System.out.println("Goods Bogies in Train: ");
		for(CargoBogie b : cargoBogie) {
			System.out.println(b.type + " -> " + b.cargo);
		}
		System.out.println();
		
		boolean isSafe = cargoBogie.stream().allMatch(bogie -> validateBogie(bogie));
		
		System.out.println("Safety Compliance Status: " + isSafe);
		
		if(isSafe) System.out.println("Train formation is SAFE");
		else System.out.println("Train formation is NOT SAFE");

	}
	private static boolean validateBogie(CargoBogie b) {
        if ("cylindrical".equalsIgnoreCase(b.type)) {
            return "Petroleum".equalsIgnoreCase(b.cargo);
        }
        return true;
    }

}
