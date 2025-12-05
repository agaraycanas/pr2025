package t2;

import java.util.Scanner;

public class Ej42 {

	public static void main(String[] args) {
		Scanner s;
		int a;
		int m;
		s = new Scanner(System.in);

		System.out.print("Introduce a (1..20): ");
		a = s.nextInt();

		System.out.print("Introduce m (1..20): ");
		m = s.nextInt();

		for (int mo=0; mo<m ;mo++ ) {
			// =====================
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < (i + 1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			// =====================
			for (int i = a - 1; i >= 1; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			// =====================
		}
		s.close();
	}

}
