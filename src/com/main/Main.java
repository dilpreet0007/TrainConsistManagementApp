package com.main;

import java.util.*;

/*
 * UC20: Exception Handling During Search Operations
 * 		 User triggers a search operation.
		 System checks whether the bogie collection is empty.
		 If no bogies are available, the system throws an IllegalStateException.
		 The operation stops immediately.
		 User receives a meaningful error message.
 * 
 * @author Dilpreet
 * @version 20.0
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();
		
		
		String[] bogies = {};
		
		if(bogies.length == 0) {
			throw new IllegalStateException("No bogies available in train consist. Search operation cannot proceed.");
		}
		System.out.println("Available Bogie IDs:");
		
		for(String s : bogies) System.out.println(s);

		String searchID = "BG103";
		boolean found = false;

		int left = 0;
		int right = bogies.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			int cmp = searchID.compareTo(bogies[mid]);

			if (cmp == 0) {
				found = true;
				break;
			} else if (cmp > 0) {
				left = mid + 1; 
			} else {
				right = mid - 1; 
			}
		}
		System.out.println();

		if(found) System.out.println("Bogie " + searchID + " found in train consist");
		else System.out.println("Bogie " + searchID + " not found in train consist");
	}
}
