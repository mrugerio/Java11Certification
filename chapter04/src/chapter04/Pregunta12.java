package chapter04;

public class Pregunta12 {

	public static void main(String[] args) {

		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };

		int q = wolf.length;
		for (;;) {

			System.out.print(wolf[--q]);

			if (q == 0)
				break;
		}
		System.out.println("_______");
		for(int m=wolf.length-1; m>=0; --m)

			System.out.print(wolf[m]);
		
		System.out.println("_______");
		int x = wolf.length-1;

		for(int j=0; x>=0 && j==0; x--)

		System.out.print(wolf[x]);
	}

}
