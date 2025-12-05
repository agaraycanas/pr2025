package t2;

import java.util.Scanner;

public class Ej44 {
	private static Scanner s;

	public static void horizontal(int n) {
		for (int i=0;i<n;i++) {
			System.out.print("*");
		}
	}
	
	public static void vertical(int n) {
		for (int i=0;i<n;i++) {
			System.out.println("*");
		}
	}
	
	public static void cuadrado(int n) {
		for (int i=0;i<n;i++) {
			horizontal(n);
			System.out.println();
		}
	}
	
	public static void ascendente(int n) {
		for (int i=1; i<=n ; i++) {
			horizontal( i );
			System.out.println();
		}
	}
	
	public static void descendente(int n) {
		for ( int i=n; i>=1;i--) {
			horizontal(i);
			System.out.println();
		}
	}
	
	public static void ej37() {
		System.out.println("\nIntroduce n: ");
		int n = s.nextInt();
		vertical(n);
	}
	
	public static void ej38() {
		System.out.println("\nIntroduce n: ");
		int n = s.nextInt();
		horizontal(n);
	}
	
	public static void ej39() {
		System.out.println("\nIntroduce n: ");
		int n = s.nextInt();
		cuadrado(n);
	}

	public static void ej40() {
		System.out.println("\nIntroduce n: ");
		int n = s.nextInt();
		ascendente(n);
	}
	
	public static void ej41() {
		System.out.println("\nIntroduce n: ");
		int n = s.nextInt();
		ascendente(n);
		descendente(n-1);
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		//ej37();
		//ej38();
		//ej39();
		//ej40();
		ej41();
		s.close();
	}

}
