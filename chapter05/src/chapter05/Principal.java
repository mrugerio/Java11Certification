package chapter05;

public class Principal {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("start");
		//sb = "start"
		
		sb.append("+middle");
		//sb = sb.append("+middle");
		//sb = "start+middle"
		//System.out.println(sb);
		
		StringBuilder same = sb.append("+end");
		//sb = "start+middle+end"
		//same = "start+middle+end"
		
		System.out.println(sb == same); //true
		System.out.println(sb);
		System.out.println(same);

		
		
	}

}
