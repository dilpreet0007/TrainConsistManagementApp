package com.bogie;

import com.main.Main.InvalidCapacityException;

public class Bogie {
	public String name;
	public int capacity;
	
	public Bogie(String name,int capacity) throws InvalidCapacityException{
		if(capacity<=0) {
			throw new InvalidCapacityException("Capacity must be greater than 0");
		}
		this.name = name;
		this.capacity = capacity;
	}
}
