package t5.b.ej14;

public class Persona {
	protected String nombre;
	
	public Persona() {
		this.nombre = "John Doe";
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void saludar( Persona otra ) {
		System.out.println("Hola "+otra.getNombre()+", soy "+this.nombre);
	}
	public void saludar() {
		System.out.println("Hola, soy "+this.nombre);
	}
}
