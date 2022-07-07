package com.demo.inicio.interfaces;

import com.demo.inicio.Empleado;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	default Predicado<T> negate() {
		return x -> !this.probar(x);
	}
	
	static <T> Predicado<T> negate(Predicado<T> p) {
		return x -> !p.probar(x);
	}
	
//	static <T> Predicado<T> negate(Predicado<T> p) {
//		System.out.println("Paso por metodo static negate");
//		
//		Predicado<T> pn = (x) -> {
//			System.out.println("Paso por la declaracion de la lambda Predicado");
//			System.out.println("x= "+x);
//			return !p.probar(x);
//		};
//		
//		return pn;
//	
//	}
	
	default  Predicado<T> and(Predicado<T> p02) {
		return x -> (this.probar(x) && p02.probar(x));
	}
	
	static <T> Predicado<T> and(Predicado<T> p01, Predicado<T> p02) {
		return x -> (p01.probar(x) && p02.probar(x));
	}
	
	default  Predicado<T> or(Predicado<T> p02) {
		return x -> (this.probar(x) || p02.probar(x));
	}
	
	static <T> Predicado<T> or(Predicado<T> p01, Predicado<T> p02) {
		return x -> (p01.probar(x) || p02.probar(x));
	}
	
	static boolean negate(boolean b) {
		return !b;
	}
	
	static boolean and(boolean b1, boolean b2) {
		return (b1 && b2);
	}
	
	
	static void probarStatic() {
		System.out.println("Probar static");
	}
	
	default void probarDefault() {
		System.out.println("Probar default");
	}
	
	static <T> Predicado<T> returnPredicado() {
		return x -> true;
	}
	
}
