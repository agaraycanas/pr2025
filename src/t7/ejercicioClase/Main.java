package t7.ejercicioClase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	private static void mostrarJugadores(Collection<Jugador> jugadores) {
		for ( Jugador jugador : jugadores) {
			System.out.println(jugador);
		}
	}

	public static void main(String[] args) {
		Set<Jugador> setJugadores = new TreeSet<>();
		//List<Jugador> jugadores = new ArrayList<>();
		
		for (int i=0; i<args.length; i+=3) {
			int dorsal 		= Integer.parseInt( args[i] );
			String nombre 	= args[i+1];
			String apellido	= args[i+2];
			Jugador jugador = new Jugador(dorsal,nombre,apellido);
			
			setJugadores.add(jugador);
		}

		List<Jugador> listaJugadores = new ArrayList<Jugador>(setJugadores);
		
		System.out.println("\n=== ORDENADA POR DORSAL ===");
		Collections.sort(listaJugadores);
		mostrarJugadores(listaJugadores);

		System.out.println("\n=== ORDENADA POR DORSAL (DESCENDENTE) ===");
		Collections.reverse(listaJugadores);
		mostrarJugadores(listaJugadores);

		System.out.println("\n=== ORDENADA POR APELLIDO ===");
		Comparator<Jugador> comparadorJugadorPorApellidoAsc = new ComparadorJugadorPorApellidoAsc();
		Collections.sort(listaJugadores,comparadorJugadorPorApellidoAsc);
		mostrarJugadores(listaJugadores);

		System.out.println("\n=== ORDENADA POR APELLIDO, NOMBRE ===");
		Comparator<Jugador> comparadorJugadorPorApellidoAscNombreDesc = new ComparadorJugadorPorApellidoAscNombreDesc();
		Collections.sort(listaJugadores,comparadorJugadorPorApellidoAscNombreDesc);
		mostrarJugadores(listaJugadores);
	}

}
