package chapter04;

public class Pregunta20 {

	public static void main(String[] args) {

		int w = 0, r = 1;

		String name = "";
		while (w < 2) {

			name += "A";

			do {

				name += "B"

				;

				if (name.length() > 0)
					name += "C";
				else
					break;

			}

			while(r<= 1);

			r++;
			w++;
		}
		System.out.println(name);
	}

}
