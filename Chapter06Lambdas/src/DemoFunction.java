import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class DemoFunction {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = x -> x.length();
		int longitud = fun1.apply("Hola Mundo");
		System.out.println(longitud);
		
		Function<Empleado,String> fun2 = emp -> emp.getNombre();
		String nombre = fun2.apply(new Empleado("Patrobas",28,45.67));
		System.out.println(nombre);
		
		Function<String,String> fun3 = z -> z + " Mundo";
		System.out.println(fun3.apply("Hola"));

		UnaryOperator<String> uo = z -> z + " Mundo";
		System.out.println(uo.apply("Hola"));
		System.out.println("----------------");
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		UnaryOperator<Empleado> uoEmp = x -> {
			x.setSueldo(x.getSueldo() * 1.10);
			return x;
		};
		
		listaEmpleados.replaceAll(uoEmp);
		listaEmpleados.forEach(x -> System.out.println(x));
		
	}

}
