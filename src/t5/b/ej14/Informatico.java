package t5.b.ej14;

public class Informatico extends Trabajador {
	public Informatico(String nombre) {
		super(nombre);
	}
	
	public Informatico() {
		super();
	}
	
	public void saludar() {
		System.out.println(this.nombre + " listo para programar");	
	}
	
	public void programar() {
		System.out.println("A ver, public class " + this.nombre+ "...NO");
	}
}
