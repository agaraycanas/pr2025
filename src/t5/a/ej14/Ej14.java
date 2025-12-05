package t5.a.ej14;

import java.util.Random;
import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce n (num.tiradas): ");
		float n = s.nextFloat();

		System.out.println("Introduce c (num.caras): ");
		int c = s.nextInt();

		s.close();
		// ================================

		float[] estadistica = new float[c];

		for (float i = 1; i <= n; i++) {
			int azar = numAzar(1, c);
			estadistica[azar - 1]++;
		}

		for (int i = 0; i < c; i++) {
			System.out.println((i + 1) + ": " + ((estadistica[i] * 100) / n) + " %");
		}

	}

	public static int numAzar(int inf, int sup) {
		Random r = new Random();
		return r.nextInt(inf, sup + 1);
	}
}
