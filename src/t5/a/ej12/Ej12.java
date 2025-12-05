package t5.a.ej12;

import java.util.Random;
import java.util.Scanner;

public class Ej12 {

	
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
			System.out.println("("+ i +"): " + azar);
		}
	}

	public static int numAzar(int inf, int sup) {
		Random r = new Random();
		return r.nextInt(inf, sup+1);
	}
}
