package t1;

import java.util.Scanner;

public class Ej16 {
	public static boolean par( int n ) {
		return ( n%2==0 ? true : false);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Introcuce un número: ");
		n = s.nextInt();
		String mensaje= par(n) ? "PAR" : "IMPAR";
		System.out.println("El número " + n + " es " + mensaje );
		s.close();
	}

}
