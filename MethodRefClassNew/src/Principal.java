import java.util.*;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		//Supplier<Persona> supPer = () -> new Persona();
		Supplier<Persona> supPer = Persona::new;
		Persona per01 = supPer.get();
		System.out.println(per01);
		
		//Function<Integer,Persona> funPer = (x)-> new Persona(x);
		Function<Integer,Persona> funPer = Persona::new;
		Persona per02 = funPer.apply(8);
		System.out.println(per02);
		
		BiFunction<Integer,String,Persona> biFunPer = Persona::new;
		System.out.println(biFunPer.apply(5, "Patrobas"));
		
		Supplier<List<Double>> supLista = ArrayList<Double>::new;
		List<Double> lista = supLista.get();
		
		Function<String,Integer> fun = Integer::new;
		Integer integer = fun.apply("8");
		
		
		
	}

}
