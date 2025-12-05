package t2;

import java.util.Scanner;

public class Ej38 {

	public static void main(String[] args) {
		Scanner s;
		int n;
		s = new Scanner(System.in);
		System.out.print("Introduce n (1..20): ");
		n = s.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.print("*");
		}
		
		s.close();
	}

}
