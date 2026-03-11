package com.main;

import java.util.*;


/*
 * UC19: Binary Search for Bogie ID (Optimized Searching)
 * 		 User provides sorted bogie IDs.
		 User provides a search key.
		 System initializes low and high indexes.
		 System finds the middle index.
		 Key is compared with middle value.
		 Search range is halved.
		 Steps repeat until found or exhausted.
		 Result is displayed.
		 Program continues.
 * 		 
 * @author Dilpreet
 * @version 19.0
 */


public class Main {

	public static void main(String[] args){
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();

		String[] bogies = {"BG101","BG102","BG103","BG104","BG105"};
		
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
