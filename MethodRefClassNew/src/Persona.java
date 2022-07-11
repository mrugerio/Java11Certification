
public class Persona {
	
	private int id;
	private String nombre;
	
	Persona(){
		System.out.println("Constructor default");
		nombre = "Sin nombre";
	}
	
	Persona(int id){
		System.out.println("Constructor id");
		this.id = id;
		nombre = "Sin nombre";
	}
	
	public Persona(int id, String nombre) {
		System.out.println("Constructor id y nombre");
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
