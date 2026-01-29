package t7.pruebas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 *  Coleccionar los números introducidos por teclado (Scanner)
		 *  hasta intrdocuir el número 0
		 *  Recorrer la colección y mostrarlos
		 *  Mostrar finalmente su suma 
		 */
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		rellenarDatos(numeros);
		mostrar(numeros);
		mostrarYSumar(numeros);
		mostrarAMano(numeros);
	}

	private static void mostrar(ArrayList<Integer> numeros) {
		System.out.println(numeros);
	}
	private static void mostrarAMano(ArrayList<Integer> numeros) {
		System.out.print("[");
		for ( int numero : numeros ) {
			System.out.print(numero+", ");
		}
		System.out.print("]");
	}


	private static int mostrarYSumar(ArrayList<Integer> numeros) {
		int sumaInterna = 0;
		for (int numero : numeros ) {
			System.out.println("n => " + numero);
			sumaInterna += numero;
		}
		return sumaInterna;
	}


	private static void rellenarDatos( ArrayList<Integer> numeros ) {
		Scanner s = new Scanner(System.in);
		boolean terminar = false;
		while (!terminar) {
			System.out.print("Introduce un número: ");
			int numeroLeido = s.nextInt();
			
			if (numeroLeido==0) {
				terminar = true;
			}
			else {
				numeros.add(numeroLeido);
			}
		}
		s.close();
	}

}
