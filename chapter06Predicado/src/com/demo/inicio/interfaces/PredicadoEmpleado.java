package com.demo.inicio.interfaces;

import com.demo.inicio.Empleado;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Empleado e);
	
	//int otroProbar(String s); //SOLO DEBE TENER UN METODO ABSTRACTO

}
