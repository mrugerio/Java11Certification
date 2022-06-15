package com.curso;

public class Principal {
	
	final static int MAX_LENGTH = 5;
	
	final static StringBuilder NOMBRE = new StringBuilder("Paco");
	
	final static String NOMBRE_STRING = ("Paco");
	
	public static float code = 5.6f;
	
	public static void main(String[] args) {
		
		//MAX_LENGTH = 6;
		
		NOMBRE.append("Perez");
		
		System.out.println(NOMBRE);
		
		//NOMBRE = new StringBuilder("Paco Perez");
		
		//NOMBRE_STRING = "Paco Perez";
		
		Principal p = new Principal();
		Principal p1 = new Principal();
		
		System.out.println(p.code);
		System.out.println(p1.code);
		
		var a = 1/2;
		
		
		
		

		
	}

}
