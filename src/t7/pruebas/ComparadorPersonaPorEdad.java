package t7.pruebas;

import java.util.Comparator;

public class ComparadorPersonaPorEdad implements Comparator<Persona> {
	@Override
	public int compare(Persona persona1, Persona persona2) {
		int edad1 = persona1.getEdad();
		int edad2 = persona2.getEdad();
		
		int solucion = 0;
		if ( edad1 > edad2 ) {
			solucion = 1;
		}
		if ( edad1 < edad2) {
			solucion = -1;
		}
		
		return solucion;
	}


}
