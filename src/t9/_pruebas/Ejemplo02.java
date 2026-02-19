package t9._pruebas;

import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

import javax.xml.datatype.DatatypeConfigurationException;

public class Ejemplo02 {

	public static void main(String[] args) {
		int[] denominador = { 10, 20, 30, 40, 50 };
		int numerador = 100;

		for (int i = 0; i < denominador.length; i++) {
			try {
				int cociente = numerador / denominador[i];
				System.out.println(numerador + " / " + denominador[i] + " = " + cociente);
				int numero = Integer.parseInt(args[0]);
			} catch (ArithmeticException e) {
				System.out.println("No dividas por cero");
			}
			catch (IndexOutOfBoundsException e) {
				System.out.println("Intento de acceso fuera del array");
			}
			catch (Exception e) {
				System.out.println("Ha ocurrido un error genérico");
				System.out.println("DETALLES: " +  e.getMessage());
			}

		}
		System.out.println("FIN");
	}
}
