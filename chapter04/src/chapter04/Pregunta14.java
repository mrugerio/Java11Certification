package chapter04;

public class Pregunta14 {

	public static void main(String[] args) {

		int snake = 1;
		double iguana = 0;
		do {
			System.out.print(snake++ + " ");
			iguana--;
		} while (snake <= 5);
		System.out.println(iguana);
	}

}
