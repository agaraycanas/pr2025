package t1;

import java.util.Scanner;

public class Ej12 {

	public static int doble (int numero ) {
		return 2*numero;
	}
	public static void main(String[] args) {
		int n;

		Scanner s = new Scanner(System.in);
		System.out.print("Introduce n: ");
		n = s.nextInt();
		s.close();
		
		System.out.println("El doble de " + n +" es " +doble(n));
		
	}

}
