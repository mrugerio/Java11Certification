package com.demo.inicio;

import java.util.*;

import com.demo.inicio.interfaces.Predicado;

public class Principal7 {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		Predicado<Empleado> p01 = z -> z.getEdad()>20;
		
		//Metodo default
		mostrar(listaEmpleados, p01.negate());
		
		Predicado<Empleado> p02 = y -> y.getSueldo()>55;
		
		mostrar(listaEmpleados, p01.and(p02));
		
		mostrar(listaEmpleados, p01.or(p02));

		
	}
	
	static void mostrar(List<Empleado> lista, Predicado<Empleado> preEmp) {
		for (Empleado e:lista)
			if (preEmp.probar(e))
				System.out.println(e);
		System.out.println("**********");
	}
	
	
	
	
	

}
