package chapter03;

public class Principal2 {

	public static void main(String[] args) {

		int entero1 = 1;
		final int entero2 = 1;
		
		char charData = 1;
		//charData = entero1; //NOT COMPILE
		charData = entero2;
		
		//----------------------
		
		short short01 = (short)(4 + 10);
		short short02 = (short)4 + 10;
		short short03 = 4 + 10;
		
		byte byteData1 = 1;
		//byteData = entero1; //NOT COMPILE
		byteData1 = entero2;

		//-----------------------
		
		byte byteData2 = 127;
		byte byteData3 = (byte)128;
		System.out.println("byteData3: "+byteData3);
		
		char charData1 = 65_535; 
		char charData2 = (char)65_536; 
		System.out.println("charData: "+charData2);

		long longData1 = 1_000L;
		final long longData2 = 1_000L;

		//int entero3 = longData1;
		//int entero4 = longData2;
		
		long ear = 10;
		long ear1 = 1_000_000_000_000l;
		
	}

}
