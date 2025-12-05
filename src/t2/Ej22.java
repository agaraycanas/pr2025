package t2;

import java.util.Scanner;

public class Ej22 {

	public static int reves(int n) {
		final int DIVISOR = 10;
		int dividendo = n;
		int cociente;
		int resto;
		int solucion;
		solucion = 0;
		do {
			cociente 	= dividendo / DIVISOR;
			resto 		= dividendo % DIVISOR;
			solucion = solucion*10 + resto;
			dividendo 	= cociente;
		} while ( cociente != 0);
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
		
		System.out.println("REVES("+n+")=>" + reves(n)); // TODO depurar
		if (n==reves(n)) {
			System.out.println("ES capicúa");
		}
		else {
			System.out.println("NO es capicúa");
		}
		s.close();
	}

}
