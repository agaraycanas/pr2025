package t01;

import java.util.Scanner;

public class Ej18 {
	
	public static  float areaRectangulo (float ancho , float alto) {
		return ancho*alto;
	}

	public static void main(String[] args) {
		float lado1 ;
		float lado2 ;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el largo del rectángulo: ");
		lado1 = s.nextFloat();
		System.out.println("Introduce el ancho del rectángulo: ");
		lado2 = s.nextFloat();
		s.close();
		System.out.println( 
				"El área del rectángulo de " + 
				lado1 +
				" por " + 
				lado2 +
				" es " + 
				areaRectangulo(lado1, lado2) 
		) ;
	}

}
