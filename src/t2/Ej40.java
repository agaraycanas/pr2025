package t2;

import java.util.Scanner;

public class Ej40 {

	public static void main(String[] args) {
		Scanner s;
		int n;
		s = new Scanner(System.in);
		System.out.print("Introduce n (1..20): ");
		n = s.nextInt();
		
		for (int i=0;i<n;i++) {
			for (int j=0; j<(i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
