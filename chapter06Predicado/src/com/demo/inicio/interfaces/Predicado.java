package com.demo.inicio.interfaces;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static void probarStatic() {
		System.out.println("Probar static");
	}
	
	default void probarDefault() {
		System.out.println("Probar default");
	}
}
