package t2;

import java.util.Scanner;

public class Ej02b {
	public static void main(String[] args) {
		int numero;
		int miEdad = 18;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n: ");
		numero = s.nextInt();
		
		if (numero < miEdad) {
			System.out.println("Demasiado joven");
		} else {
			if ( numero > miEdad ) {
				System.out.println("Viejales");
			}
			else {
				System.out.println("Buena edad");
			}
		}
		System.out.println("FIN");
		s.close();
	}
}
