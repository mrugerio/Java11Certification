package com.demo1;

import java.util.function.BinaryOperator;

public class Principal3 {

	public static void main(String[] args) {

		String cadena1 = "Hello ";
		String cadena2 = "Java";
		
		//BinaryOperator<String> bo = (s1,s2) -> s1.concat(s2);
		//BinaryOperator<String> bo = String::concat;
		
		String res = Utils.transforma(cadena1, cadena2, String::concat);
		
		System.out.println(res);
		
	}

}
