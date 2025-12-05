package t2;

import java.util.Scanner;

public class Ej30 {
	public static int factorial(int n) {
		int solucion = 1;
		for (int i=2;i<=n;i++) {
			solucion = solucion * i;
		}
		return solucion;
	}

	public static void main(String[] args) {
		int n;
		Scanner 	s;
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número (mayor o igual que 0): ");
			n = s.nextInt();
		} while (n<0);
		
		System.out.println(n +"! = " + factorial(n));
		s.close();
	}

}
