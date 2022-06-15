package chapter03;

public class Principal {

	public static void main(String[] args) {

		int lion = 3;
		int tiger = ++lion * 5 / lion--;
		//                     / 3
		//          //3
		
		System.out.println("lion: "+lion); //3
		System.out.println("tiger: "+tiger); //5
		
		//short tail = (short)(4+10);
		
		short tail = (short)4 + 10;
		
		
		System.out.println(tail);
		
		//tail = 1_000_000; //NO COMPILA
		
		tail = (short)1_000_000;
		System.out.println(tail);
		
		//tail = 14L; //NO COMPILA
		
		tail = (short)(14L);
		
		tail = 14; //?????
		
		int x = 14;
		tail = (short)x;
		
		short mouse = 10;
		short hamster = 3;
		short res = (short)(mouse * hamster);
		
		long goat = 10;
		int sheep = 5;
		//sheep = (int)(sheep * goat);
		
		System.out.println(sheep *= goat);
		
		
		
		

	}

}
