package t7.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 *  Coleccionar las palabras introducidos por teclado (Scanner)
		 *  hasta introducir la palabra "FIN"
		 *  Recorrer la colección y mostrar cada palabra en una linea
		 */
		ArrayList<String> palabras = new ArrayList<String>();
		rellenarDatos(palabras);
		mostrar(palabras);
	}

	private static void mostrar(ArrayList<String> palabras) {
		int contador = 1;
		for ( String palabra : palabras) {
			System.out.println(contador + ": " + palabra);
			contador ++;
		}
	}

	private static void rellenarDatos( ArrayList<String> palabras ) {
		Scanner s = new Scanner(System.in);
		boolean terminar = false;
		while (!terminar) {
			System.out.print("Introduce un palabra: ");
			String palabraLeida = s.next();
			
			if (palabraLeida.equals("FIN")) {
				terminar = true;
			}
			else {
				palabras.add(palabraLeida);
			}
		}
		s.close();
	}

}
