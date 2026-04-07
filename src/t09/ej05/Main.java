package t09.ej05;

import java.util.Scanner;

public class Main {
	/*
	 * Hacer una clase Main3 con un método estático examinar(x:int) que lance una
	 * excepción personalizada de tipo NumeroException.
	 * 
	 * examinar(x:int) lanzará una excepción con el mensaje (asociado a
	 * getMessage()) CERO si x valiera cero, PAR si x es par, e IMPAR si x es impar.
	 * 
	 * Desde el método main de Main3, probar el método "examinar", leyendo un número
	 * por teclado, y examinando dicho número.
	 * 
	 * El programa mostrará un mensaje del estilo
	 * "El número es [ PAR | IMPAR | CERO ]", pero sin necesidad de haber escrito
	 * ningún "if" ni expresiones ternarias fuera del método “examinar”
	 */
	private static void examinar(int x) throws NumeroException {
		if (x == 0) {
			throw new NumeroException("CERO");
		}
		if (x % 2 == 0) {
			throw new NumeroException("PAR");
		}
		if (x % 2 != 0) {
			throw new NumeroException("IMPAR");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n: ");
		
		try {
			int n = s.nextInt();
			examinar(n);

		} catch (NumeroException e) {
			System.out.println("El número es " + e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}

class NumeroException extends Exception {
	public NumeroException(String mensaje) {
		super(mensaje);
	}
}
