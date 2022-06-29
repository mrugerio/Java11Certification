package com.demo.inicio;

import java.util.*;

import com.demo.inicio.comparator.ComparatorEdad;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		System.out.println("Lista Empleados por Edad");
		Collections.sort(listaEmpleados,new ComparatorEdad());
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		
		
		
	}

}
