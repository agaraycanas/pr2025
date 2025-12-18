package t5.b.ej14;

public class Informatico extends Trabajador {
	
	public void saludar() {
		System.out.println(this.nombre + " listo para programar");	
	}
	
	public void programar() {
		System.out.println("A ver, public class " + this.nombre+ "...NO");
	}
}
