package t2;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		int actual;
		int anterior;
		Scanner s;
		
		s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		actual = s.nextInt();
		
		do {
			anterior = actual;
			System.out.println("Introduce un número: ");
			actual = s.nextInt();
		}
		while ( actual > anterior );
		System.out.println("FIN");
		s.close();
	}

}
