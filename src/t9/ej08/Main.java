package t9.ej08;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int numTiradas 	= Integer.parseInt( args[0] );
		int numCaras 	= Integer.parseInt( args[1] );
		int[] frecuencia = new int[11];
		
		Random r = new Random();
		for (int i=0;i<numTiradas;i++) {
			int caraAzar = r.nextInt(numCaras)+1;
			try {
				frecuencia[caraAzar] ++;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				frecuencia[0] ++; // Aprovecho la casilla 0 que estaba desaprovechada para "fuera de rango"
			}
		}
		mostrarEstadisticas(frecuencia,numTiradas,numCaras);
	}

	private static void mostrarEstadisticas(int[] frecuencia, int numTiradas, int numCaras) {
		for (int cara=1; cara<=numCaras && cara<frecuencia.length; cara++) {
			float porcentaje = (frecuencia[cara] / (float)numTiradas ) * 100;
			System.out.print("Cara "+cara+"( " + frecuencia[cara]+"\t/ "+numTiradas +" ):\t");
			System.out.printf("%.1f %%%n", porcentaje );
		}
		float porcentaje = (frecuencia[0] / (float)numTiradas ) * 100;
		System.out.print("Fuera de rango: "+frecuencia[0]+"/"+numTiradas+": ");
		System.out.printf("%.1f %%%n", porcentaje );
	}
}
