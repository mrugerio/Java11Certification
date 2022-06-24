package com.curso;

public class Principal3 {

	public static void main(String[] args) {

		String singleString = "hello world";
		String concat = "hello ";
		concat += "world";
		//concat = concat + "world";
		System.out.println(singleString == concat);
		System.out.println(singleString.hashCode());
		System.out.println(concat.hashCode());

		System.out.println("**********");
		String x = "hello world";
		String y = new String("hello world");
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		System.out.println(translateSlider(5));
		
	}
	
	static private double translateSlider(int sliderVal) {
	    switch (sliderVal) {
	        case 0:
	            return 1.0;
	        case 1:
	            return .9;
	        case 2:
	            return .8;
	        case 3:
	            return .7;
	        case 4:
	            return .6;
	        default:
	            return 1.0;
	    }
	}  

}
