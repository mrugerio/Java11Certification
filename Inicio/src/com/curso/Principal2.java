package com.curso;

public class Principal2 {

	public static void main(String[] args) {
		String x = "Hello World";
		String z = " Hello World".trim();
		String w = z;
		
		System.out.println(x);
		System.out.println(z);
		
		System.out.println(x==z);
		
		System.out.println(x.hashCode());
		System.out.println(z.hashCode());
		
		System.out.println(x.equals(z));
		
		System.out.println(x==w);




	}

}
