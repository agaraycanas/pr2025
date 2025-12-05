package t5.a.ej01YSiguientes;

public class Persona {
	// =====EJ1=====

	String nombre;
	int edad;

	public void saludar() {
		//System.out.println("HOLA");
		// Ej. 5
		String edad="ERROR";
		System.out.println(
				"Hola, soy " 	+ 
				nombre 	+
				" y tengo " 	+
				this.edad 		+
				" años"			+
				" y por cierto, edad vale" +
				edad
				);
	}

	public void despedirse() {
		System.out.println("ADIOS");
	}


	
	
}
