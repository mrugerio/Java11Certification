package com.demo.inicio;

import java.util.*;

import com.demo.inicio.interfaces.PredicadoEmpleado;


public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		//Empleados mayores a 20 años
		
//		PredicadoEmpleado p = new PredicadoEmpleado(){
//			@Override
//			public boolean probar(Empleado e) {
//				return e.getEdad()>20;
//			}
//		};
		
		PredicadoEmpleado preEmp00 =  w -> false;
		boolean res = preEmp00.probar(new Empleado("Andronico",19,40.50));
		System.out.println(res); //false
		System.out.println("********");

		
		PredicadoEmpleado preEmp01 =  emp -> emp.getNombre().endsWith("o");
		res = preEmp01.probar(new Empleado("Patrobas",19,40.50));
		System.out.println(res);
		
		System.out.println("********");
		PredicadoEmpleado preEmp =  z -> z.getEdad()>20;
		
		for (Empleado e:listaEmpleados) {
			if (preEmp.probar(e)) 
				System.out.println(e);
		}
		
		System.out.println("********");

		for (Empleado e:listaEmpleados) {
			if (!preEmp01.probar(e)) 
				System.out.println(e);
		}

	}

}
