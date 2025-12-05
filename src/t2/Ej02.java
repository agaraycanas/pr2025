package t2;

import java.util.Scanner;

public class Ej02 {
	public static void main(String[] args) {
		int numero;
		int miEdad = 18;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n: ");
		numero = s.nextInt();
		
		if (numero <= miEdad) {
			if ( numero == miEdad ) {
				System.out.println("Buena edad");
			}
			else {
				System.out.println("Demasiado joven");
			}
		} else {
			System.out.println("Viejales");
		}
		
		s.close();
		System.out.println("FIN");
	}
}
