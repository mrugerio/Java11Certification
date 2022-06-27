package chapter05;

public class Principal3 {

	public static void main(String[] args) {
		String singleString = "hello world"; // POOL Strings
		String oneLine = "hello " + "world"; // POOL Strings
		String concat = " hello";
		concat += "world";
		//System.out.println(singleString == oneLine); // true
		//System.out.println(singleString == concat); // false

		String name = "Hello World";
		String name2 = new String("Hello World").intern();
		System.out.println(name == name2); // true
	}

}
