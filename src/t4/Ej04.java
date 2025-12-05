package t4;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner s = new Scanner(System.in);
		String[] palabra = new String[TAM];
		boolean seguir = true;
		int i = 0;

		System.out.println("=== COMIENZO ====");
		
		do {
			System.out.println("Palabra " + (i+1) + ": ");
			String palabraActual = s.nextLine();
			if (palabraActual.equals("FIN") ) {
				seguir = false;
			}
			else {
				palabra[i] = palabraActual;
				i = i + 1;
			}
		} while (seguir && i<TAM);
		
		s.close();
		for (int j=0;j<i;j++) {
			System.out.print(palabra[j].charAt(0));
		}
		
		System.out.println();
		System.out.println("==== FIN =====");

	}

}
