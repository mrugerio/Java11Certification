package chapter03;

public class Principal3 {

	public static void main(String[] args) {

		Integer intTime = Integer.valueOf(9);
		showNumber(intTime);
		Long longTime = Long.valueOf(1_000);
		showNumber(longTime);
		Float floatTime = Float.valueOf(4.5f);
		showNumber(floatTime);
		
		boolean x = true;
		
		boolean y = (boolean)x;
		

	}
	
	static void showNumber(Number n) {
		if (n instanceof Integer)
			System.out.println("Integer: "+n);
		if (n instanceof Long)
			System.out.println("Long: "+n);
		if (n instanceof Float)
			System.out.println("Float: "+n);
	}
	
	
	
	
	

}
