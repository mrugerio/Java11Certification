package com.demo.inicio;

import java.util.*;

import com.demo.inicio.interfaces.Predicado;

public class Principal6 {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		Predicado<Empleado> p01 = z -> z.getEdad()>20;
		
//		Predicado<Empleado> predicadoNegate = Predicado.negate(p01);
		
//		boolean resultado = predicadoNegate.probar(new Empleado("Patrobas",25,45.67));
//		
//		System.out.println("Resultado: "+resultado);
					
		mostrar(listaEmpleados, Predicado.negate(p01));
		
		Predicado<Empleado> p02 = y -> y.getSueldo()>55;
		
		mostrar(listaEmpleados, Predicado.and(p01,p02));
		
		Predicado<Empleado> predicadoOr = Predicado.or(p01,p02);
		
		mostrar(listaEmpleados, predicadoOr);

		
	}
	
	static void mostrar(List<Empleado> lista, Predicado<Empleado> preEmp) {
		for (Empleado e:lista)
			if (preEmp.probar(e))
				System.out.println(e);
		System.out.println("**********");
	}
	
	
	
	
	

}
