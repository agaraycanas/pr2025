package t2;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		int actual;
		int anterior;
		Scanner s;
		
		s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		actual = s.nextInt();
		anterior = actual-1;
		
		if (actual!=0) {
			do {
				anterior = ( actual>anterior  ? actual  :  anterior  );
				
				//if (actual>anterior) { anterior = actual; } // Misma instrucción que antes
				
				System.out.println("Introduce un número (superior a " + anterior + "): ");
				actual = s.nextInt();
			}
			while (  actual!=0 );
		}
		
		System.out.println("FIN");
		s.close();
	}

}
