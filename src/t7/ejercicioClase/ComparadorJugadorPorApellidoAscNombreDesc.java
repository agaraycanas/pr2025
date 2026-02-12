package t7.ejercicioClase;

import java.util.Comparator;

public class ComparadorJugadorPorApellidoAscNombreDesc implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		int solucion = 0;
		String nom1 = j1.getNombre();
		String ape1 = j1.getApellido();
		String nom2 = j2.getNombre();
		String ape2 = j2.getApellido();
		if (ape1.compareTo(ape2) > 0) {
			solucion = 1;
		}
		if (ape1.compareTo(ape2) < 0) {
			solucion = -1;
		}
		
		if (ape1.compareTo(ape2) == 0) {
			if (nom1.compareTo(nom2) > 0) {
				solucion = -1;
			}
			if (nom1.compareTo(nom2) < 0) {
				solucion = 1;
			}
		}
		return solucion;
	}

}
