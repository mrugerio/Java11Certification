package com.demo1;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico insMec = new Mecanico();
		Carro insCarro = new Carro();
		insCarro.id = 5;
		
		//BiConsumer<Mecanico,Carro> biConsumer = (m,c) -> m.arreglar(c);
		BiConsumer<Mecanico,Carro> biConsumer = Mecanico::arreglar;
		
		biConsumer.accept(insMec,insCarro);
		
		Supplier<Boolean> ps = ()-> true;
		boolean r = ps.get();
		
		BiPredicate<String,Object> bp = (a, b) -> a.startsWith("test");
		
	}

}

class Carro{
	int id;
	String color;
}

class Mecanico{
	void arreglar(Carro c) {
		System.out.println("Arreglando carro id: "+c.id);
	}
}
