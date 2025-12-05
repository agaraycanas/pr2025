package t2;

import java.util.Scanner;

public class Ej25 {

	public static boolean primo(int n) {
		boolean solucion = true;
		for (int i=2; i<n; i++) {
			if (n % i == 0) {
				solucion = false;
			}
		}
		return solucion;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner 	s;
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número (mayor o igual que cero): ");
			n = s.nextInt();
		} while (n<0);
		
		String particula = primo(n) ? "" : " NO";
		System.out.println("El número " + n + particula + " es primo");
		
		s.close();
	}

}
