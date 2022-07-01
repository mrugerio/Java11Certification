package com.demo.inicio;

import java.util.function.Predicate;

import com.demo.inicio.interfaces.Predicado;

public class Principal5 {

	public static void main(String[] args) {

		Predicado.probarStatic();
		
		Predicado<String> preString = s -> s.equals("Hola");
		
		preString.probarDefault();
	}

}
