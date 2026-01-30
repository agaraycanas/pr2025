package t7.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	private static int nc;
	private static int nt;
	private static int[] frecuencia;
	private static ArrayList<Integer> numeros;

	/*
	 * Usando la clase Scanner Pedir por teclado un número "nc" que representa el
	 * número de caras de un dado Pedir por teclado un número "nt" que representa el
	 * número de tiradas de un dado Simular ese número de tiradas de dado y
	 * almacenar cada una en una colección 1. Mostrar el contenido de dicha
	 * colección 2. Mostrar el contenido de dicha colección ordenada ascendentemente
	 * 3. Crear un array de frecuencias, llamado "frecuencia" que tenga tantas
	 * casillas como "nc". Almacenar en cada casilla la frecuencia que ha ocurrido
	 * cada cara (gestionar el problema de los índices con el número de cada cara)
	 * 4. Mostrar el porcentaje (con un decimal) de ocurrencia de cada cara
	 * finalmente.
	 */
	public static void main(String[] args) {
		introducirDatos();
		generarSecuenciaAleatoria();
		//mostrarSecuencia();
		rellenarFrecuencias();
		mostrarPorcentajesDeFrecuencias();
	}

	private static void introducirDatos() {
		Scanner s = new Scanner(System.in);
		System.out.print("Número de caras: ");
		nc = s.nextInt();
		System.out.print("Número de tiradas: ");
		nt = s.nextInt();
		s.close();
		numeros = new ArrayList<Integer>();
		frecuencia = new int[nc + 1];
	}

	private static void mostrarSecuencia() {
		System.out.println(numeros);
		Collections.sort(numeros);
		System.out.println(numeros);
	}

	private static void generarSecuenciaAleatoria() {
		Random r = new Random();
		for (int i = 0; i < nt; i++) {
			numeros.add(r.nextInt(nc) + 1);
		}
	}

	private static void mostrarPorcentajesDeFrecuencias() {
		System.out.printf("Porcentaje medio: %.1f" , (100f/nc) );
		System.out.println();
		for (int i = 1; i < frecuencia.length; i++) {
			float porcentaje = (frecuencia[i] * 100f) / nt;
			//System.out.printf(i + ": " + frecuencia[i] + " veces (" + porcentaje + "%)");
			System.out.printf("%1d: %2d veces (%3.1f %%)", i , frecuencia[i] , porcentaje);
			System.out.println();
		}
	}

	private static void rellenarFrecuencias() {
		for (int numero : numeros) {
			frecuencia[numero]++;
		}
		//System.out.println(Arrays.toString(frecuencia));
	}

}
