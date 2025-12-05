package t1;

import java.util.Scanner;

public class Ej04b {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int edad;
		
		System.out.print("Edad: ");
		edad = scan.nextInt();
		
		System.out.println("Dentro de dos años tendrás " + (edad + 2) + " años");
		
		scan.close();
	}

}
