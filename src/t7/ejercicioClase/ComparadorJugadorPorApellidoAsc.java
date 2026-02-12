package t7.ejercicioClase;

import java.util.Comparator;

public class ComparadorJugadorPorApellidoAsc implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		int solucion = 0;
		String ape1 = j1.getApellido();
		String ape2 = j2.getApellido();
		if (ape1.compareTo(ape2) > 0) {
			solucion = 1;
		}
		if (ape1.compareTo(ape2) < 0) {
			solucion = -1;
		}
		return solucion;
	}

}
