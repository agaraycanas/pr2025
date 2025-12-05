package t2;

import java.util.Scanner;

public class Ej27 {

	public static boolean primo(int n) {
		boolean solucion = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				solucion = false;
			}
		}
		return solucion;
	}

	public static void main(String[] args) {
		int inf;
		int sup;
		Scanner s;
		s = new Scanner(System.in);

		do {
			System.out.println("Introduce un número (mayor o igual que cero): ");
			inf = s.nextInt();
		} while (inf < 0);

		do {
			System.out.println("Introduce otro número (mayor o igual que " + inf + "): ");
			sup = s.nextInt();
		} while (sup < inf);

		for (int i=inf;i<=sup;i++) {
			if (primo(i)) {
				System.out.print( i+" ");
			}
		}		
		s.close();
	}

}
