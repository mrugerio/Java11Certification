package com.demo.inicio;

import java.util.List;

public class Pregunta9 {

	public void remove(List<Character> chars) {

		final char end = 'z';

		chars.removeIf(c -> {
			char start = 'a';
			return start <= c && c <= end;
		});

		
		// INSERT LINE HERE
		end = '1';
	}

}
