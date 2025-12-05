package t5.a.ej13;

import java.util.Random;
import java.util.Scanner;

public class Ej13 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce n (num.tiradas): ");
		int n = s.nextInt();

		System.out.println("Introduce c (num.caras): ");
		int c = s.nextInt();

		s.close();
		//================================
		
		
		for (int i = 1; i <= n; i++) {
			int azar = numAzar(1,c);
			int azar2 = numAzar2(1,c);
			System.out.println("("+ i +"): " + azar + ", "+azar2);
			if (azar>6 || azar2 > 6  ) {
				System.out.println("ERROR ==============================");
			}
		}
	}

	public static int numAzar(int inf, int sup) {
		Random r = new Random();
		return r.nextInt(inf, sup+1);
	}
	
	public static int numAzar2(int inf, int sup) {
		return ((int)(Math.random()*sup)) + inf;
	}
}
