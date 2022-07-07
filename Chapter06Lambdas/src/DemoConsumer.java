import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {
		
		Consumer<String> con1 = x -> System.out.println(x);
		con1.accept("Hola Mundo");
		
		Consumer<Empleado> con2 = z -> System.out.println(z);
		con2.accept(new Empleado("Patrobas",28,45.67));
		
		System.out.println("______________");
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
//		for(Empleado e: listaEmpleados)
//			System.out.println(e);
		
		listaEmpleados.forEach(z -> System.out.println(z));
		
		//listaEmpleados.forEach(System.out::println);
		
	}

}
