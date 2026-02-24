package t09._pruebas;

import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				int dividendo 	= s.nextInt();
				int divisor 	= s.nextInt();
				int cociente 	= 0;
			
				cociente = dividendo / divisor;
				System.out.println(dividendo + "/" + divisor + "=" + cociente );
			}
			catch (Exception bomba) {
				System.out.println("No dividas por cero, so burro");
				System.out.println(bomba.getMessage());
			}

		}
	}

}
