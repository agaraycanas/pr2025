package t2;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		String letra;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce una letra: "); 
		letra = s.nextLine();
		
		switch (letra) {
			case 	"a","e","i","o","u",
					"A","E","I","O","U",	
					"á","é","í","ó","ú",	
					"Á","É","Í","Ó","Ú",
					"ü","Ü"
					-> System.out.println("ES VOCAL"); 
			default  ->  System.out.println("CONSONANTE");
		}
		System.out.println("FIN");
		s.close();
	}

}
