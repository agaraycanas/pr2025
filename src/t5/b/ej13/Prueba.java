package t5.b.ej13;

public class Prueba {
	public static void main(String[] args) {
		//System.out.println("Pérez Manzano Santos Borreguero");
		
		Persona p = new Persona("X","Pérez","Santos");
		Persona m = new Persona("Y","Manzano","Borreguero");
		Persona.mostrarApellidos(p,m);
	}
}
