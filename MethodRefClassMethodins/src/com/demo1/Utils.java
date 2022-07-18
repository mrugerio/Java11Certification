package com.demo1;

import java.util.function.BinaryOperator;

public class Utils {
	
	public static String transforma(String s1, String s2,
			BinaryOperator<String> uo) {
		
		var res = uo.apply(s1,s2);
		
		return res;
		
	}

}
