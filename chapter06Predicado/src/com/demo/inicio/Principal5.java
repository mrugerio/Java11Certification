package com.demo.inicio;

import com.demo.inicio.interfaces.Predicado;

public class Principal5 {

	public static void main(String[] args) {

		Predicado.probarStatic();
		
		Predicado<String> preString = s -> s.equals("Hola");
		
		preString.probarDefault();
		
		Predicado<String> returnLambdaString = Predicado.returnPredicado();
		//Predicado<String> returnLambdaString =  x -> true;
	}

}
