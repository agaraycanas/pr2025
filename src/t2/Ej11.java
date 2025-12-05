package t2;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inf;
		int sup;
		
		System.out.println("Introduce un número: ");
		inf = s.nextInt();
		
		System.out.println("Introduce un número (superior o igual al anterior): ");
		sup = s.nextInt();
		
		int i;
		i = inf;
		
		while ( i <= sup ) {
			if ( i%2 == 1 ) {
				System.out.print(i + " ");
			}
			i++;
		}
		s.close();
	}
}
