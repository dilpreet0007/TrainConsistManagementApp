package com.main;

import java.util.*;


/*
 * UC16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
 * 		 User provides passenger bogie capacities.
		 System iterates through the array.
		 Adjacent values are compared.
		 If out of order, values are swapped.
		 Multiple passes continue until sorted.
		 Sorted result is displayed.
		 Program continues.
 * 		 
 * @author Dilpreet
 * @version 16.0
 */

public class Main {

	public static void main(String[] args){
		System.out.println("==============================");
		System.out.println(" Train Consist Management App ");
		System.out.println("==============================");
		System.out.println();

		int[] capacities = {72,78,69,81};
		System.out.println("Original capacities:");
		for(int c : capacities) System.out.print(c + " ");
		System.out.println("\n");
		
		for (int i = 0; i < capacities.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
		System.out.println("Sorted capacities: ");
		for(int c : capacities) System.out.print(c + " ");
	}
}
