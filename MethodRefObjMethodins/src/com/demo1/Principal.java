package com.demo1;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico insMec = new Mecanico();
		Carro insCarro = new Carro();
		insCarro.id = 5;
		
		//Consumer<Carro> consumer = c -> insMec.arreglar(c);
		Consumer<Carro> consumer = insMec::arreglar;
		consumer.accept(insCarro);

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
