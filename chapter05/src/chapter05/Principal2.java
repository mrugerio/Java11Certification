package chapter05;

public class Principal2 {

	public static void main(String[] args) {

		String s1 = "Hola";
		String s2 = "Hola";
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //true

		String x = "Hello World"; 
		String z = " Hello World".trim();
		String w = new String("Hello World");
		
		System.out.println(z);
		System.out.println(x.equals(z)); //true
		System.out.println(x==z); //false
		
		System.out.println(z.equals(w)); //true

	}

}
