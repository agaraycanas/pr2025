package t7.pruebas;

import java.util.Comparator;

public class ComparadorPersonaPorNombre implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		String  nombre1 = persona1.getNombre();
		String  nombre2 = persona2.getNombre();
		
		return nombre1.compareTo(nombre2);
	}

}
