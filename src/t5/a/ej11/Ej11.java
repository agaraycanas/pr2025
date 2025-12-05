package t5.a.ej11;

import java.util.Random;
import java.util.Scanner;

public class Ej11 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = s.nextInt();

		Random r = new Random();
		
		for (int i = 1; i <= n; i++) {
			int azar = r.nextInt(1, 7);
			System.out.println("("+ i +"): " + azar);
		}
		
		s.close();
	}
}
