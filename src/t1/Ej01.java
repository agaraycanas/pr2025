package t1;

import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un número: ");
		numero = scan.nextInt();
		
		System.out.println( numero * 2);
		scan.close();

	}
}
