package com.demo.inicio.comparator;

import java.util.Comparator;

import com.demo.inicio.Empleado;

public class ComparatorEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
//		if (o1.getEdad()>o2.getEdad())
//			return 1;
//		else if (o1.getEdad()<o2.getEdad())
//			return -1;
//		else
//			return 0;
		return o1.getEdad()-o2.getEdad();
	}

}
