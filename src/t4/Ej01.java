package t4;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		final int TAMANYO = 4;
		int[] a = new int[TAMANYO];
		Scanner s = new Scanner(System.in);
		int i=0;
		int dato; 
		
		do {
			System.out.println("Introduce n:");
			dato = s.nextInt();
			if (dato!=0) {
				a[i] = dato;
				i++;
			}
		} while (i < a.length && dato!=0);
		
		s.close();

		for (i=0;i<a.length && a[i]!=0 ;i++) {
			String separador =  (i == TAMANYO-1) || (a[i+1] == 0)  ?  "" : ", " ;
			System.out.print(a[i] + separador);
		}
		
		System.out.println("\nFIN");
	}
}
