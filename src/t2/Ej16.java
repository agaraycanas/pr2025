package t2;

import java.util.Scanner;

public class Ej16 {
	public static void main(String[] args) {
		Scanner s;
		int numero;
		
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce n: ");
			numero = s.nextInt();
		} while ( numero != 0);
		
		System.out.println("ADIÓS");
		s.close();
	}
}
