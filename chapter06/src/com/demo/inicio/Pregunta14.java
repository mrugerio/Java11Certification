package com.demo.inicio;

import java.util.List;

public class Pregunta14 {
	
	public void remove(List<Character> chars) {

		char end = 'z';

		// INSERT LINE HERE 
		chars = null;
		
		chars.removeIf(
				c -> { char start = 'a'; return start <= c && c <= end; });

		
		String x = "Hello";
		x = null;
		x.concat(" World");
	}

}
