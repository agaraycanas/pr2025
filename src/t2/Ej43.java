package t2;

import java.util.Scanner;

public class Ej43 {

	public static void main(String[] args) {
		Scanner s;
		int n;
		s = new Scanner(System.in);
		System.out.print("Introduce n (1..20): ");
		n = s.nextInt();
		
		for (int i=0;i<n;i++) {
			for (int j=1; j<=(n-i-1);j++) { // NE
				System.out.print(" ");
			}
			
			for (int j=1; j<=i+1;j++) { // NA
				System.out.print("*");
			}
			
			System.out.println();
		}
		s.close();
	}

}
