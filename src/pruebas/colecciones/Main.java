package pruebas.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Crear Coleccion de personas utilizando ARRAYS
		Persona[] personasArray;
		personasArray = new Persona[4];
		
		// Crear Coleccion de personas utilizando ArrayList
		ArrayList<Persona> personasColeccion = new ArrayList<Persona>();
		
		// Añadir objetos a colección de arrays
		personasArray[0] = new Persona("Pepe");
		personasArray[2] = new Persona("Juan");
		
		// Añadir objetos a una Collection
		personasColeccion.add(new Persona("Otro Pepe"));
		personasColeccion.add(new Persona("Otro Juan"));
		
		// recorrer colecciones tipo array
		for (int i=0;i<personasArray.length;i++) {
			if (personasArray[i] != null) {
				personasArray[i].saludar();
			}
		}
		
		// recorrer colecciones de tipo Collection
		for (Persona persona : personasColeccion ) {
			persona.saludar();
		}
	}

}
