package t4;

import java.util.Scanner;

public class Ej02 {
	
	public static void rellenarArray(float[] a) {
		Scanner s = new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.println("Introduce n:");
			a[i] = s.nextInt();
		} 
		s.close();
	}
	
	public static float maximo(float[] a) {
		float max = a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static float minimo(float[] a) {
		float min = a[0];
		for (int i=1;i<a.length;i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void mostrarSinExtremos(float[] a) {
		float max = maximo(a);
		float min = minimo(a);
		for (int i=0;i<a.length;i++) {
			if ( a[i] != max && a[i] != min) {
				System.out.print(a[i] + ", ");
			}
		}
	}

	public static void mostrarMedia(float[] a) {
		float acumulado = 0;
		float media = 0;
		for (int i=0;i<a.length;i++) {
			acumulado = acumulado + a[i];
		}
		
		media = acumulado / a.length;
		
		System.out.println("\nMedia aritmética: " + media);
	}
	
	public static void main(String[] args) {
		final int TAMANYO = 4;
		float[] a = new float[TAMANYO];
		
		rellenarArray(a);
		mostrarSinExtremos(a);
		mostrarMedia(a);
	}

	

}
