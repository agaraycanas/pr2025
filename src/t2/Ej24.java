package t2;

import java.util.Scanner;

public class Ej24 {

	public static int sumaDigitosImpar(int n) {
		final int DIVISOR = 10;
		int dividendo = n;
		int cociente;
		int resto;
		int solucion;
		int contador = 1;
		solucion = 0;
		do {
			cociente 	= dividendo / DIVISOR;
			resto 		= dividendo % DIVISOR;
			if (contador%2==1) { solucion = solucion + resto;}
			contador++;
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
		
		System.out.println("La suma de los dígitos impares de " + n +" es " + sumaDigitosImpar(n) );
		
		s.close();
	}

}
