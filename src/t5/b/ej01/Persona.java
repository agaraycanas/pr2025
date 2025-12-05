package t5.b.ej01;

//import java.util.Random;

public class Persona {
	private String nombre;
	private int numeroDeLaSuerte;

	public void saludar() {
		System.out.println("Hola, soy " + this.nombre + " y mi número de la suerte es " + this.numeroDeLaSuerte);
	}

	/**
	 * Devuelve un número al azar entre 1 y max (incluidos ambos)
	 */
	private int azar(int max) {
		/*
		Random r = new Random();
		return r.nextInt(max) + 1;
		*/
		return (int)(Math.random()*max) + 1;
	}

	/**
	 * 
	 * @param nombre
	 */
	public Persona(String nombre) {
		this.nombre = nombre;
		this.numeroDeLaSuerte = this.azar(10);
	}

	public Persona() {
		this.nombre = "Anónimo";
		this.numeroDeLaSuerte = this.azar(10);
	}
}
