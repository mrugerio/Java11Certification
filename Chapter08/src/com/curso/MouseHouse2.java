package com.curso;

public class MouseHouse2 {

	private final int volume;
	private final String type;
	{
		this.volume = 10;
	}

	public MouseHouse2(String type) {
		this.type = type; 
	}

	public MouseHouse2() { 
		this(null);
		//type = "type";
	}
}