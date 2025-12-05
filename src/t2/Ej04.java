package t2;

import java.util.Scanner;

public class Ej04 {
	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		numero = s.nextInt();	
		s.close();
		if (numero == 1) {
			System.out.println("UNO");
		}
		else {
			if ( numero == 2 ) {
				System.out.println("DOS");
			}
			else {
				if ( numero == 3 ) {
					System.out.println("TRES");
				}
				else {
					System.out.println("NO SÉ");
				}
			}
		}
	}
}
