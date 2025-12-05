package t2;

import java.util.Scanner;

public class Ej21 {
	public static void main(String[] args) {
		Scanner 	s;
		int 		dividendo;
		final int 	DIVISOR = 10;
		int 		cociente;
		int			numeroDeCifras = 0;
		
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número (mayor o igual que cero): ");
			dividendo = s.nextInt();
		} while (dividendo<0);
		
		do {
			numeroDeCifras ++;
			cociente 	= dividendo / DIVISOR;
			dividendo 	= cociente;
		} while ( cociente != 0);

		System.out.println("Número de cifras: " + numeroDeCifras);
		s.close();
	}
}
