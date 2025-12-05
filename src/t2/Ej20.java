package t2;

import java.util.Scanner;

public class Ej20 {
	public static void main(String[] args) {
		Scanner 	s;
		int 		dividendo;
		final int 	DIVISOR = 10;
		int 		cociente;
		int 		resto;
		
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número (mayor o igual que cero): ");
			dividendo = s.nextInt();
		} while (dividendo<0);
		
		System.out.print("Número inverso: ");
		do {
			cociente 	= dividendo / DIVISOR;
			resto 		= dividendo % DIVISOR;
			System.out.print(resto);
			dividendo 	= cociente;
		} while ( cociente != 0);
		
		s.close();
	}
}
