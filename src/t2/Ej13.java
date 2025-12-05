package t2;

import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		int n;
		int i;
		Scanner s;
		
		s = new Scanner(System.in);
		i = 1;
		System.out.print("Introduce tabla a visualizar: ");
		n = s.nextInt();
		
		
		while ( i <= 10 ) {
			System.out.println( n + " x " + i + " = " + ( n*i ) );
			i++;
		}
		s.close();
	}
}
