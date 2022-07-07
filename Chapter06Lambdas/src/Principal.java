import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		//listaEmpleados.forEach(x -> System.out.println(x));
		//listaEmpleados.removeIf(x -> x.getSueldo()<41);
		//listaEmpleados.forEach(System.out::println);
		
		UnaryOperator<Empleado> uoEmp = x -> {
			x.setSueldo(x.getSueldo() * 1.10);
			return x;
		};
		listaEmpleados.replaceAll(uoEmp);
		
		listaEmpleados.sort((e1, e2) -> e2.getEdad()-e1.getEdad());
		listaEmpleados.sort((e1, e2) -> e1.getNombre().compareTo(e2.getNombre()));
		
		listaEmpleados.forEach(System.out::println);

	}

}
