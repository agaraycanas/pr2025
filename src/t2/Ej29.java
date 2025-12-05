package t2;

import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {
		int n;
		Scanner 	s;
		s = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número (mayor o igual que 3): ");
			n = s.nextInt();
		} while (n<3);
		
		System.out.print("[1]0, [2]1, ");
		
		int n1 = 0;
		int n2 = 1;
		
		for ( int i=3;i<=n;i++) {
			int actual = n1 + n2;
			System.out.print("["+i+"]"+actual+", ");
			n1 = n2;
			n2 = actual;
		}
		s.close();
	}

}
