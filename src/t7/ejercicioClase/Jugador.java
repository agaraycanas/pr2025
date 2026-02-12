package t7.ejercicioClase;

public class Jugador implements Comparable<Jugador>
{
	private int 	dorsal;
	private String 	nombre;
	private String 	apellido;
	
	public Jugador(int dorsal, String nombre, String apellido) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "("+this.dorsal+") "+this.apellido+", "+this.nombre;
	}
	
	@Override
	public boolean equals(Object otro) {
		return (otro instanceof Jugador &&  ((Jugador)otro).dorsal == this.dorsal );
	}
	
	@Override
	public int hashCode() {
		return this.dorsal;
	}

	
	@Override
	public int compareTo(Jugador otroJugador) {
		int solucion = 0;
		if ( this.dorsal > otroJugador.dorsal) {
			solucion = 1;
		}
		if (this.dorsal < otroJugador.dorsal) {
			solucion = -1;
		}
		return solucion;
	}
	
	public String getApellido() {
		return this.apellido;
	}

	public String getNombre() {
		return this.nombre;
	}
	
}
