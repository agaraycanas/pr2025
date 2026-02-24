package t09.ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nombre= "";
		boolean seguir = false;
		
		do {
			System.out.println("Introduce tu nombre: ");
			nombre = s.nextLine();
			try {
				comprobar(nombre);
				seguir = false;
			}
			catch ( UpperCaseException e) {
				seguir = true;
			}
		} while (seguir);
		s.close();
		
		System.out.println("Hola " + nombre);
	

	}

	private static void comprobar(String nombre) throws UpperCaseException {
		char inicial = nombre.charAt(0);
		if (!Character.isUpperCase(inicial)) {
			throw new UpperCaseException();
		} 
	}

}
