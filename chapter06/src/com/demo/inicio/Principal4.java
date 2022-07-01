package com.demo.inicio;

import java.util.*;


public class Principal4 {

	public static void main(String[] args) {
		
		//Lambda
		Comparator<Empleado> comparator = (o1, o2) -> o2.getEdad()-o1.getEdad();
			
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,100.03));
		
		System.out.println("Lista Empleados por Edad Principal4");
		Collections.sort(listaEmpleados,comparator);
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		comparator = (x,y) -> x.getNombre().compareTo(y.getNombre());
		
		System.out.println("Lista Empleados por Nombre Principal4");
		Collections.sort(listaEmpleados,comparator);
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		
		System.out.println("Lista Empleados por Sueldo Principal4");
		Collections.sort(listaEmpleados, (emp1, emp2) -> (int)(emp2.getSueldo()-emp1.getSueldo()) );
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		
	}

}
