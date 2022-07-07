import java.util.function.Supplier;

public class DemoSupplier {

	public static void main(String[] args) {

		Supplier<String> sup1 = () -> "Hola Mundo";
		String cadena = sup1.get();
		System.out.println(cadena);
		
		Supplier<Empleado> sup2 = () -> new Empleado("Patrobas",28,45.67);
		System.out.println(sup2.get());
		
		Supplier<Double> sup3 = () -> Math.random();
		System.out.println(sup3.get());

		
	}

}
