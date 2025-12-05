package t1;

import java.util.Scanner;

public class Ej07 {
	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		n1 = s.nextInt();
		
		System.out.print("Introduce otro número: ");
		n2 = s.nextInt();
		
		int suma;
		suma = n1+n2;
		
		System.out.println("La suma de " + n1 + " y " + n2 +" es " +  suma);
		s.close();
	}
}
