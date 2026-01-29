package t7.pruebas;

import java.util.ArrayList;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 *  Coleccionar los números 10,15,30.
		 *  Recorrer la colección y mostrarlos
		 *  Mostrar finalmente su suma 
		 */
		int miNumero = 30;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(new Integer(10)); // Esta mejor no
		numeros.add(15);
		numeros.add(miNumero);

		int suma = 0;
		for (int x : numeros ) {
			System.out.println(x);
			suma += x;
		}
		System.out.println("====");
		System.out.println("Suma: " + suma);
	}

}
