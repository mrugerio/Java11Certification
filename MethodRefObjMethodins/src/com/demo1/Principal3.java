package com.demo1;

import java.util.function.UnaryOperator;

public class Principal3 {

	public static void main(String[] args) {

		String cadena1 = "Hello ";
		String cadena2 = "Java";
		
		//UnaryOperator<String> uo = s -> cadena1.concat(s);
		//UnaryOperator<String> uo = cadena1::concat;
		
		String res = Utils.transforma(cadena2, cadena1::concat);
		
		System.out.println(res);
		
	}

}
