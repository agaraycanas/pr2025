package t2;

import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {
		int numero;
		int miEdad = 18;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n: ");
		numero = s.nextInt();
		if (numero <= miEdad) {
			System.out.println("Demasiado joven");
		} else {
			System.out.println("Viejales");
		}
		System.out.println("FIN");
		s.close();
	}
}
