package com.demo.inicio;

import java.util.*;

import com.demo.inicio.interfaces.PredicadoEmpleado;


public class Principal2 {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		PredicadoEmpleado preEmp00 =  w -> true;
		
		mostrar(listaEmpleados,preEmp00);
		
		mostrar(listaEmpleados,emp -> emp.getNombre().endsWith("o"));
				
		mostrar(listaEmpleados,z -> z.getEdad()>20);
		
		mostrar(listaEmpleados,z -> z.getSueldo()>40);
	}
	
	static void mostrar(List<Empleado> lista, PredicadoEmpleado preEmp) {
		for (Empleado e:lista)
			if (preEmp.probar(e))
				System.out.println(e);
		System.out.println("**********");
	}
	
	
	
	
	

}
