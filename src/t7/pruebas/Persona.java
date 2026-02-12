package t7.pruebas;

import java.util.Collection;

public class Persona implements Comparable<Persona> {
	private String dni;
	private String nombre;
	private int edad;

	public Persona(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[" + this.dni + "] - " + this.nombre + " (" + this.edad + ")";
		//return "[" + this.dni + "] - " + " (" + this.edad + ")";
	}

	@Override
	public boolean equals(Object otro) {
		return otro instanceof Persona && ((Persona) otro).dni.equals(this.dni);
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(this.dni);
	}

	
	@Override
	public int compareTo(Persona otraPersona) {
		return this.dni.compareTo(otraPersona.dni);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}

}
