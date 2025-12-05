package t5.a.ej09;

import java.util.Scanner;

public class Ej09 { // DRY - don't repeat yourself
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce n1: ");
		int n1 = s.nextInt();
		
		System.out.println("Introduce n2: ");
		int n2 = s.nextInt();
		
		int mayor= Math.max(n1, n2);
		System.out.println("El mayor de "+n1+" y "+n2+" es "+mayor);
		
		s.close();
	}
}
