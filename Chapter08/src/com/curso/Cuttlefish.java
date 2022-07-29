package com.curso;

public class Cuttlefish {

	private String name = "swimmy";
	{
		System.out.println(name); //IMPRIME TERCERO: swimmy
	}
	private static int COUNT = 0; //1
	static {
		System.out.println(COUNT); //IMPRIME PRIMERO: 0
	} //2
	{
		COUNT++;
		System.out.println(COUNT); //IMPRIME CUARTO: 1
	}

	public Cuttlefish() {
		System.out.println("Constructor"); //IMPRIME QUINTO: Constructor
	}

	public static void main(String[] args) {
		System.out.println("Ready"); //IMPRIME SEGUNDO: Ready
		new Cuttlefish();
		new Cuttlefish(); //swimmy 2 Constructor
	}
}