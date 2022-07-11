import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {

//		BiPredicate<Integer,Integer> esMas10 =
//				(x,y) -> Numeros.esMayor10(x, y);
//		boolean r =	esMas10.test(5, 6);
//		System.out.println(r);
				
		BiPredicate<Integer,Integer> esMas10 = Numeros::esMayor10;
		boolean r =	esMas10.test(1, 6);
		System.out.println(r);
		
//		UnaryOperator<String> uo = w -> Util.hacerInterante(w);
//		String s = uo.apply("Hello");
//		System.out.println(s);
		
		UnaryOperator<String> uo = Util::hacerInterante;
		String s = uo.apply("Hello");
		System.out.println(s);
		
		BiFunction<String,String,String> biFunc = Principal::concatenar;
		BinaryOperator<String> bo = Principal::concatenar;
		
		System.out.println(biFunc.apply("Hola", "Mundo"));
		System.out.println(bo.apply("Hello", "World"));
		
		Supplier<String> sup = Principal::getParadigma;
		System.out.println(sup.get());
		
	}
	
	static String concatenar(String s1, String s2) {
		return s1+s2;
	}
	
	static String getParadigma() {
		return "Java Functional";
	}

}
