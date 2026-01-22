package t5.c;

public class EjerciciosString {
	public static void main(String[] args) {
		ej06();
	}

	private static void ej02() {
		char c;
		c = 'a';
		System.out.println(c + ": " + esVocal(c));
		c = 'e';
		System.out.println(c + ": " + esVocal(c));
		c = 'i';
		System.out.println(c + ": " + esVocal(c));
		c = 'o';
		System.out.println(c + ": " + esVocal(c));
		c = 'u';
		System.out.println(c + ": " + esVocal(c));
	
		c = 'A';
		System.out.println(c + ": " + esVocal(c));
		c = 'E';
		System.out.println(c + ": " + esVocal(c));
		c = 'I';
		System.out.println(c + ": " + esVocal(c));
		c = 'O';
		System.out.println(c + ": " + esVocal(c));
		c = 'U';
		System.out.println(c + ": " + esVocal(c));
	
		c = 'W';
		System.out.println(c + ": " + esVocal(c));
		c = 'J';
		System.out.println(c + ": " + esVocal(c));
	
		c = 'r';
		System.out.println(c + ": " + esVocal(c));
		c = 'f';
		System.out.println(c + ": " + esVocal(c));
	
		c = 'á';
		System.out.println(c + ": " + esVocal(c));
	}

	private static void ej03() {
		char c;
		c = 'A';
		System.out.println(c + ": " + esMayuscula(c));
		c = 'G';
		System.out.println(c + ": " + esMayuscula(c));
		c = 'Z';
		System.out.println(c + ": " + esMayuscula(c));
		c = 'a';
		System.out.println(c + ": " + esMayuscula(c));
		c = 'r';
		System.out.println(c + ": " + esMayuscula(c));
		c = 'z';
		System.out.println(c + ": " + esMayuscula(c));
	}

	private static void ej04() {
		char c;
		c = 'A';
		System.out.println(c + ": " + esMinuscula(c));
		c = 'G';
		System.out.println(c + ": " + esMinuscula(c));
		c = 'Z';
		System.out.println(c + ": " + esMinuscula(c));
		c = 'a';
		System.out.println(c + ": " + esMinuscula(c));
		c = 'r';
		System.out.println(c + ": " + esMinuscula(c));
		c = 'z';
		System.out.println(c + ": " + esMinuscula(c));
	}

	private static void ej05() {
		char c;
		c = 'a';
		System.out.println(c + " => " + aMayuscula(c));
		c = 'A';
		System.out.println(c + " => " + aMayuscula(c));
		c = 'z';
		System.out.println(c + " => " + aMayuscula(c));
		c = 'Z';
		System.out.println(c + " => " + aMayuscula(c));
		c = '0';
		System.out.println(c + " => " + aMayuscula(c));
		c = '%';
		System.out.println(c + " => " + aMayuscula(c));
	}

	private static void ej06() {
		char c;
		c = 'a';
		System.out.println(c + " => " + aMinuscula(c));
		c = 'A';
		System.out.println(c + " => " + aMinuscula(c));
		c = 'z';
		System.out.println(c + " => " + aMinuscula(c));
		c = 'Z';
		System.out.println(c + " => " + aMinuscula(c));
		c = '0';
		System.out.println(c + " => " + aMinuscula(c));
		c = '%';
		System.out.println(c + " => " + aMinuscula(c));
	}
	
	private static char aMayuscula(char c) {
		/*
		 * Realizar y probar un método llamado aMayuscula(char):char, que dado un char
		 * me devuelva ese mismo char pero en mayúscula. Si el char inicial no era una
		 * letra minúscula, se queda igual que estaba.
		 */
		char solucion = c;
		if (esMinuscula(c)) {
			solucion = (char) (c - 32);
		}
		return solucion;
	}

	private static char aMinuscula(char c) {
		/*
		 * Realizar y probar un método llamado aMinuscula(char):char, que dado un char
		 * me devuelva ese mismo char pero en minúscula. Si el char inicial no era una
		 * letra minúscula, se queda igual que estaba.
		 */
		char solucion = c;
		if (esMayuscula(c)) {
			solucion = (char) (c + 32);
		}
		return solucion;
	}

	private static boolean esMayuscula(char c) { // 65 <= c <= 90
		return c >= 65 && c <= 90;
	}

	private static boolean esMinuscula(char c) { // 97 <= c <= 122
		return c >= 97 && c <= 122;
	}

	private static boolean esVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'á' || c == 'é' || c == 'í' || c == 'ó'
				|| c == 'ú' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Á' || c == 'É'
				|| c == 'Í' || c == 'Ó' || c == 'Ú';
	}
}
