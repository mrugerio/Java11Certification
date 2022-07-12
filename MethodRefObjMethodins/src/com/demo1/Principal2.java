package com.demo1;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Principal2 {

	public static void main(String[] args) {
		
		Principal2 instPrin2 = new Principal2();
		
		//Function<String,Integer> function = 
		//		s -> instPrin2.getCantidadLetras(s);
		
		Function<String,Integer> function = 
				instPrin2::getCantidadLetras;
		ToIntFunction<String> toIntFunction = instPrin2::getCantidadLetras;
				
		System.out.println(function.apply("Hello Java"));
		System.out.println(toIntFunction.applyAsInt("Hola Java"));
		
		BiPredicate<Integer,Integer> bp = instPrin2::esMayor10;
		BiFunction<Integer,Integer,Boolean> bf = instPrin2::esMayor10;
		
		
		System.out.println(bp.test(6, 2)); //false
		System.out.println(bf.apply(6, 5)); //true
		
		

	}
	
	int getCantidadLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y){
		return (x+y) > 10;
	}

}
