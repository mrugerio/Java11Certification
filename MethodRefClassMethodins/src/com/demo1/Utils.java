package com.demo1;

import java.util.function.UnaryOperator;

public class Utils {
	
	public static String transforma( String s,
			UnaryOperator<String> uo) {
		
		var res = uo.apply(s);
		
		return res;
		
	}

}
