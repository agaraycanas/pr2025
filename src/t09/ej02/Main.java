package t09.ej02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nombre= "";
		boolean seguir = false;
		
		do {
			System.out.println("\nIntroduce tu nombre: ");
			nombre = s.nextLine();
			try {
				comprobar(nombre);
				seguir = false;
			}
			catch ( UpperCaseException e) {
				System.out.println("Introduce el nombre en mayúsculas");
				seguir = true;
			}
			catch ( NombreCompuestoException e) {
				System.out.println("El nombre no debe ser compuesto");
				seguir = true;
			}
			catch (Exception e) {
				System.out.println("Ha ocurrido un error: "+ e.getMessage());
				seguir = true;
			}
			
		} while (seguir);
		s.close();
		
		System.out.println("Hola " + nombre);
	

	}

	private static void comprobar(String nombre) throws UpperCaseException, NombreCompuestoException {
		char inicial = nombre.charAt(0);
		if (!Character.isUpperCase(inicial)) {
			throw new UpperCaseException();
		}
		if (contieneEspacios(nombre)) {
			throw new NombreCompuestoException();
		}
	}
	
	private static boolean contieneEspacios(String cadena) {
		boolean solucion = false;
		for ( int i=0; i<cadena.length() && !solucion; i++) {
			char c = cadena.charAt(i);
			if (c==' ') {
				solucion = true;
			}
		}
		return solucion;
	}

}
