
public class Singleton {
	
	static private Singleton singleton;
	
	private Singleton() {
	}
	
	static public Singleton getInstance() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
	//public
	//protected
	//default **
	//private
	
	//com.curso.*
	
	

}



