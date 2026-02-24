package t09.ej06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	/*
	 * Hacer una versión del programa anterior en el que se hubiera mostrado por
	 * pantalla "El número es [ nulo | divisible por dos | NO divisible por dos ]"
	 * NOTA: No se puede modificar el código de examinar(...) ni el de la clase
	 * NumeroException
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
			String mensaje = obtenerMensaje2(e.getMessage());
			
			System.out.println("El número es " + mensaje);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
	private static String obtenerMensaje2(String mensaje) {
		Map<String,String> traduccion = new HashMap<String,String>();
		traduccion.put("CERO", "nulo");
		traduccion.put("PAR", "divisible por dos");
		traduccion.put("IMPAR", "NO divisible por dos");
		return traduccion.get(mensaje);
	}
	
	private static String obtenerMensaje(String mensaje) {
		//nulo | divisible por dos | NO divisible por dos
		String mensajeADevolver="";
		switch (mensaje) {
			case "CERO": 	mensajeADevolver="nulo";break;
			case "PAR": 	mensajeADevolver="divisible por dos";break;
			case "IMPAR": 	mensajeADevolver="NO divisible por dos";break;
		}
		return mensajeADevolver;
	}
}

class NumeroException extends Exception {
	public NumeroException(String mensaje) {
		super(mensaje);
	}
}
