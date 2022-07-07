import java.util.function.BiPredicate;

public class Principal {

	public static void main(String[] args) {

//		BiPredicate<Integer,Integer> esMas10 =
//				(x,y) -> Numeros.esMayor10(x, y);
//		boolean r =	esMas10.test(5, 6);
//		System.out.println(r);
				
		BiPredicate<Integer,Integer> esMas10 = Numeros::esMayor10;
		boolean r =	esMas10.test(1, 6);
		System.out.println(r);
				
		
		
	}

}
