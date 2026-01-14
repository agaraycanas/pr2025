package t5.b.ej14;

import java.util.Random;

public class Prueba {
	public static void main(String[] args) {
		Persona juan = new Trabajador("Juan");
		Persona ana = new Informatico("Ana");
		juan.saludar();
		ana.saludar();
		ana.saludar(juan);
		juan.saludar(ana);

	}
}
