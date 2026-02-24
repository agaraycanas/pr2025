package t09.ej07;

import java.util.Scanner;

@SuppressWarnings("serial")
class CeroException 	extends Exception {}
@SuppressWarnings("serial")
class ParException 		extends Exception {}
@SuppressWarnings("serial")
class ImparException 	extends Exception {}

public class Main {
	/*
	 * Hacer una versión del programa anterior, pero lanzando 3 tipos de excepciones
	 * distintas: ParException, ImparException y CeroException
	 */
	private static void examinar(int x) throws  CeroException, ParException, ImparException {
		if (x == 0) {
			throw new CeroException();
		}
		if (x % 2 == 0) {
			throw new ParException();
		}
		if (x % 2 != 0) {
			throw new ImparException();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n: ");

		try {
			int n = s.nextInt();
			examinar(n);

		} catch (CeroException e) {
			System.out.println("El número es nulo");
		} catch (ParException e) {
			System.out.println("El número es divisible por dos");
		} catch (ImparException e) {
			System.out.println("El número NO es divisible por dos");
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		s.close();

	}
	

	
}
