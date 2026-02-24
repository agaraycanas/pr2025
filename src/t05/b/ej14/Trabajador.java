package t05.b.ej14;

public class Trabajador extends Persona {
	public Trabajador(String nombre) {
		super(nombre);
	}
	
	public Trabajador() {
		super();
	}
	
	public void saludar() {
		System.out.println( this.nombre + " listo para el trabajo");
	}
	
	public void levantarse() {
		System.out.println("Qué duro es levantarse");
	}

}
