package com.curso;

public class MouseHouse {

	 private final int volume;
	private final String type;
	{

		volume = 10;
		//type = "type";
	}

	public MouseHouse(String type) {

		this.type = type;
	}

	public MouseHouse() { // DOES NOT COMPILE
		
		this.type = "type";

		//this.volume = 2; // DOES NOT COMPILE 

	}
}