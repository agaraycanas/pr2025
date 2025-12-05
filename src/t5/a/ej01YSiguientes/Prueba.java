package t5.a.ej01YSiguientes;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("=====EJ2=====");
		Persona pepe = new Persona();
		pepe.saludar();
		pepe.despedirse();
		System.out.println("=====EJ3=====");
		System.out.println(pepe.edad);
		System.out.println(pepe.nombre);
		System.out.println("=====EJ4=====");
		pepe.edad = 20;
		pepe.nombre = "Pepe";
		System.out.println("=====EJ5=====");
		pepe.saludar();
		System.out.println("=====EJ6=====");
		Persona ana = new Persona();
		ana.edad = 18;
		ana.nombre ="Ana";
		ana.saludar();
		pepe.saludar();
		System.out.println("=====EJ7=====");
		Persona aux = pepe;
		aux.saludar();
		System.out.println("=====EJ8=====");
		ana = aux;
		ana.saludar();
	}
}
