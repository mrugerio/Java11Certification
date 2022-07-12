package com.demo1;

import java.util.function.*;


public class Principal2 {

	public static void main(String[] args) {
		
		Principal2 instPrin2 = new Principal2();
		
		//BiFunction<Principal2,String,Integer> biFunction = 
		//	(p,s) -> p.getCantidadLetras(s);
			
		BiFunction<Principal2,String,Integer> biFunction = 
				Principal2::getCantidadLetras;
		
		System.out.println(biFunction.apply(instPrin2,"Hello Java"));
		
		ToIntBiFunction<Principal2,String> toIntBiFunction = Principal2::getCantidadLetras;
		
		System.out.println(toIntBiFunction.applyAsInt(instPrin2,"Hola Java"));
		
		TriPredicate<Principal2,Integer,Integer> tp = Principal2::esMayor10;
		
		System.out.println(tp.test(instPrin2,6, 2)); //false
		System.out.println(tp.test(instPrin2,6, 5)); //true

		TriFunction<Principal2,Integer,Integer,Boolean> tf = 
				Principal2::esMayor10;
		
		System.out.println(tf.apply(instPrin2,6, 2)); //false
		System.out.println(tf.apply(instPrin2,6, 5)); //true
		
	}
	
	int getCantidadLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y){
		return (x+y) > 10;
	}

}
