
public interface Predicado {
	
	//public abstract boolean probar();
	boolean probar();
	
	default void otroProbar() {
		System.out.println("default");
	}
	
	static void otroProbar2() {
		System.out.println("static");
	}

}
