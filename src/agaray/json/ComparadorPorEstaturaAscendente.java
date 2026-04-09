package agaray.json;

import java.util.Comparator;

public class ComparadorPorEstaturaAscendente implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		int solucion = 0;
		if (p1.getEstatura() > p2.getEstatura()) {
			solucion = 1;
		}
		if (p1.getEstatura() < p2.getEstatura()) {
			solucion = -1;
		}
		return solucion;
	}

}
