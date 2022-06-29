package com.demo.inicio;

import java.util.*;

public class Principal2 {

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
	
	private static class ComparatorEdad implements Comparator<Empleado> {
		@Override
		public int compare(Empleado o1, Empleado o2) {
			return o1.getEdad()-o2.getEdad();
		}
	}

}
