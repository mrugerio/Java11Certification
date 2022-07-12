package com.demo1;

import java.util.function.BiConsumer;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico insMec = new Mecanico();
		Carro insCarro = new Carro();
		insCarro.id = 5;
		
		//BiConsumer<Mecanico,Carro> biConsumer = (m,c) -> m.arreglar(c);
		BiConsumer<Mecanico,Carro> biConsumer = Mecanico::arreglar;
		
		biConsumer.accept(insMec,insCarro);

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
