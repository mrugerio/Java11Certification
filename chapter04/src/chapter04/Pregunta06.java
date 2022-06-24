package chapter04;

public class Pregunta06 {

	public static void main(String[] args) {

		int count = 0;

		BUNNY: for (int row = 1; row <= 3; row++)

			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
					continue BUNNY;
				count++;
			}
		System.out.println(count);

		int sing = 8, squawk = 2, notes = 0;
		while (sing > squawk) {
			sing--;
			squawk += 2;
			notes += sing + squawk;
		}
		System.out.println("NOTES: "+notes);
		
		var ostrich = new Character[3];

		for(var emu : ostrich) System.out.println(emu);
		
		final char a = 'A', e = 'E';

		char grade = 'B'; switch (grade) {

		default:

		case a:

		case 'B': case 'C': System.out.print("great "); case 'D': System.out.print("good "); break; case e:

		case 'F': System.out.print("not good ");

		}
		
		

	}

}
