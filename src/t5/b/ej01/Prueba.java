package t5.b.ej01;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		boolean seguir = true;
		Scanner s = new Scanner(System.in);
		while (seguir) {
			System.out.println("Introduce un nombre: ");
			String nombre =  s.nextLine();
			Persona p;
			switch (nombre) {
				case ".":  
					p = new Persona();
					p.saludar();
					break;
				case "s":   seguir = false ;break;
				default:			
					p = new Persona(nombre);
					p.saludar();
			}
		}
		System.out.println("FIN");
		s.close();
	}

}
