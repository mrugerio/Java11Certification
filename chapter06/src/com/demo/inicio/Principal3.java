package com.demo.inicio;

import java.util.*;


public class Principal3 {

	public static void main(String[] args) {
		
		//Clase Anonima
		Comparator<Empleado> comparatorEdad = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getEdad()-o2.getEdad();
			}
		};
		
		Comparator<Empleado> comparatorNombre = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		System.out.println("Lista Empleados por Edad Principal3");
		Collections.sort(listaEmpleados,comparatorEdad);
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		System.out.println("Lista Empleados por Nombre Principal3");
		Collections.sort(listaEmpleados,comparatorNombre);
		for (Empleado e:listaEmpleados) System.out.println(e);
		
	}

}
