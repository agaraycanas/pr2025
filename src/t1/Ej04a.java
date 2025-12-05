package t1;

import java.util.Scanner;

public class Ej04a {
	public static void main(String[] args) {
		String nombre;
		String apellido;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un nombre: ");
		nombre = scan.nextLine();
		
		System.out.print("Introduce un apellido: ");
		apellido = scan.nextLine();
		scan.close();
		
		System.out.println("Hola " + nombre + " " + apellido);

		System.out.println("Hola " + apellido + ", " + nombre);
	}
}
