package com.curso;

public class Principal2 {

	public static void main(String[] args) {
		String name = "Webby";
		speak(name);
		System.out.println(name); //Webby
		
		StringBuilder nameSb = new StringBuilder("Webby");
		speak(nameSb);
		System.out.println(nameSb); //WebbySparky
		
		StringBuilder pato = speakReturn(nameSb);
		System.out.println(pato==nameSb); //true

		StringBuilder nameSbOtro = new StringBuilder("Webby");
		System.out.println(pato==nameSbOtro); //false
		
		System.out.println(nameSb.hashCode());
		System.out.println(nameSbOtro.hashCode());


	}

	public static void speak(String name) {
		name = "Sparky";
	}

	public static void speak(StringBuilder pato) {
		pato.append("Sparky");
		System.out.println(pato.hashCode());

	}
	
	public static StringBuilder speakReturn(StringBuilder pato) {
		pato.append("Sparky");
		return pato;
	}
}
