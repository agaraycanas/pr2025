package t2;

import java.util.Scanner;

public class Ej31 {
	public static int factorial(int n) {
		int solucion = 1;
		for (int i=2;i<=n;i++) {
			solucion = solucion * i;
		}
		return solucion;
	}

	public static int comb(int n, int k) {
		return  factorial (n) /  ( factorial(k) * factorial(n-k) )  ;
	}
	
	public static void main(String[] args) {
		int n;
		int k;
		Scanner 	s;
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce n (mayor o igual que 0): ");
			n = s.nextInt();
		} while (n<0);
		do {
			System.out.println("Introduce k (mayor o igual que 0): ");
			k = s.nextInt();
		} while (k<0);
		
		System.out.println(n +" sobre " + k +" = " + comb(n,k));
		s.close();
	}

}
