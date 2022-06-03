
public class Principal {

	public static void main(String... options) {

		String x = "Hola";
		String y = "Hola";
		String z = "Hola"; //1 Objeto
		
		System.out.println(z==y);
		    
		x = "Mundo";
		
		String w = new String("Hola"); //2 Objetos
		System.out.println(z==w);                      
		
		
		boolean res = x.equals(w); //true
		System.out.println("res: "+res);
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");

		res = sb1.equals(sb2); //false 
		System.out.println("res StringBuilder: "+res);
		
		//StringBuilder nombre = "Paco";
		//for ( int x = 0; x ++ , 50_000)
		//   nombre = nombre + x
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		Singleton sing999 = Singleton.getInstance();
		System.out.println(sing1==sing999);
		
		
		
	}

}
