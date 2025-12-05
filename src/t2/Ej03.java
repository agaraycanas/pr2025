package t2;

import java.util.Scanner;

public class Ej03 {
	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		numero = s.nextInt();
		
		if ( (numero % 2) != 1  ) {
			System.out.println("El número "+numero+" es PAR");
		}
		else {
			System.out.println("El número "+numero+" es IMPAR");
		}
		System.out.println("FIN");
		s.close();
	}
}
