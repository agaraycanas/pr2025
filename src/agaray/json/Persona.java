package agaray.json;

public class Persona implements Comparable<Persona> 
{

	private String nombre;
	private int estatura;

	public int getEstatura() {
		return estatura;
	}

	public Persona(String nombre, int estatura) {
		this.nombre = nombre;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return this.nombre + " (" + this.estatura + ")";
	}
	

	@Override
	public int compareTo(Persona otra) {
		return this.nombre.compareTo(otra.nombre);
	}
	
}
