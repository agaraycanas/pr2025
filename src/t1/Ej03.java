package t1;

import java.util.Scanner;

public class Ej03 {
	public static void main(String[] args) {
		String nombre;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un nombre: ");
		nombre = scan.nextLine();
		scan.close();
		System.out.println( "Hola "  + nombre + ", ¿qué tal estás?");
	}
}
