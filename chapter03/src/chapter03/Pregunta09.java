package chapter03;

public class Pregunta09 {

	public static void main(String[] args) {

		int a =2,b=4,c=2;
		
		System.out.println(a>2 ? --c : b++);
		//b = 5;
		System.out.println(b = (a!=c ? a : b++));
		//b = 5
		//System.out.println(b);
		
		System.out.println(a > b ? b < c ? b : 2 : 1);
		//(2>5?(5<2?5:2):1)
		
		short altura = 1 , ancho = 3;
		int zebra = (byte)altura * (byte)ancho;
		
		
		
		
	}

}
