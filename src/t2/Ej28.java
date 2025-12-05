package t2;

import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {
		int menor;
		int mayor;
		Scanner s;
		s = new Scanner(System.in);

		do {
			System.out.println("Introduce un número (mayor o igual que cero): ");
			menor = s.nextInt();
		} while (menor < 0);

		do {
			System.out.println("Introduce otro número (mayor o igual que " + menor + "): ");
			mayor = s.nextInt();
		} while (mayor < menor);

		System.out.print("El mcd de " + mayor +" y " + menor + " es ");
		
		while (menor!=0) {
			int resto=mayor%menor;
			mayor = menor;
			menor = resto;
		}
		
		System.out.println(mayor);
		
		s.close();
	}

}
