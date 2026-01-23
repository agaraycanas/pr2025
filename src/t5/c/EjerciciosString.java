package t5.c;

public class EjerciciosString {
	public static void main(String[] args) {
		ej02();
		ej03();
		ej04();
		ej05();
		ej06();
		ej07();
		ej08();
		ej09();
		ej10();
		ej11();
		ej12();
		ej13();
		ej14();
		ej15();
		ej16();
	}

	@SuppressWarnings("unused")
	private static void ej02() {
		char c;

		System.out.println();
		System.out.println("============ EJ02 ================");
		System.out.println("======== ¿ES VOCAL ? =============");

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

	@SuppressWarnings("unused")
	private static void ej03() {
		char c;

		System.out.println();
		System.out.println("============ EJ03 ================");
		System.out.println("======== ¿ES MAYÚSCULA? =============");

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

	@SuppressWarnings("unused")
	private static void ej04() {
		char c;

		System.out.println();
		System.out.println("============ EJ04 ================");
		System.out.println("======== ¿ES MINÚSCULA? =============");

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

	@SuppressWarnings("unused")
	private static void ej05() {
		/*
		 * Realizar y probar un método llamado aMayuscula(char):char, que dado un char
		 * me devuelva ese mismo char pero en mayúscula. Si el char inicial no era una
		 * letra minúscula, se queda igual que estaba.
		 */

		char c;

		System.out.println();
		System.out.println("============ EJ05 ================");
		System.out.println("======== CONVERTIR A MAYÚSCULA=============");

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

	@SuppressWarnings("unused")
	private static void ej06() {
		/*
		 * Realizar y probar un método llamado aMinuscula(char):char, que dado un char
		 * me devuelva ese mismo char pero en minúscula. Si el char inicial no era una
		 * letra minúscula, se queda igual que estaba.
		 */
		char c;

		System.out.println();
		System.out.println("============ EJ06 ================");
		System.out.println("======== CONVERTIR A MINÚSCULA=============");

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

	@SuppressWarnings("unused")
	private static void ej07() {
		/*
		 * Realizar y probar un método numMinusculas(String):int, que dado un String, me
		 * devuelva un int que represente el número de minúsculas contenido en dicho
		 * String.
		 */
		String cadena;

		System.out.println();
		System.out.println("============ EJ07 ================");
		System.out.println("======== NÚMERO de MINÚSCULAS=============");

		cadena = "aaBBcc";
		System.out.println(cadena + ": " + numMinusculas(cadena));

		cadena = "aabbcc";
		System.out.println(cadena + ": " + numMinusculas(cadena));

		cadena = "AABBCC";
		System.out.println(cadena + ": " + numMinusculas(cadena));

		cadena = "aB%.0x";
		System.out.println(cadena + ": " + numMinusculas(cadena));
	}

	public static void ej08() {
		/*
		 * Realizar y probar dos métodos “numMayusculas(String):int”,
		 * “numVocales(String):int”, que cuenten y devuelvan el número de mayúsculas y
		 * vocales, respectivamente, en un determinado String.
		 */
		String cadena;
		System.out.println();
		System.out.println("============ EJ08 ================");
		System.out.println("======== NÚMERO de MAYÚSCULAS=============");

		cadena = "aaBBcc";
		System.out.println(cadena + ": " + numMayusculas(cadena));

		cadena = "aabbcc";
		System.out.println(cadena + ": " + numMayusculas(cadena));

		cadena = "AABBCC";
		System.out.println(cadena + ": " + numMayusculas(cadena));

		cadena = "aB%.0x";
		System.out.println(cadena + ": " + numMayusculas(cadena));

		System.out.println("======== NUM. VOCALES =============");

		cadena = "01aeBN";
		System.out.println(cadena + ": " + numVocales(cadena));

		cadena = "abc%AZI";
		System.out.println(cadena + ": " + numVocales(cadena));

		cadena = "abcdefghijklmnñopqrstuvwxyz";
		System.out.println(cadena + ": " + numVocales(cadena));

		cadena = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		System.out.println(cadena + ": " + numVocales(cadena));

	}

	private static void ej09() {
		/*
		 * Realizar y probar un método “numVecesChar(String,char):int”, me devuelva el
		 * número de veces que aparece el char proporcionado en el String proporcionado.
		 */
		String cadena;
		char c;
		System.out.println();
		System.out.println("============ EJ09 ================");
		System.out.println("======== NUM. VECES CHAR=============");

		cadena = "Patata";
		c = 'a';
		System.out.println(cadena + " [" + c + "] => " + numVecesChar(cadena, c));

		cadena = "PatAtA";
		c = 'a';
		System.out.println(cadena + " [" + c + "] => " + numVecesChar(cadena, c));

		cadena = "PaTAtA";
		c = 'T';
		System.out.println(cadena + " [" + c + "] => " + numVecesChar(cadena, c));

		cadena = "PaTAtA";
		c = 't';
		System.out.println(cadena + " [" + c + "] => " + numVecesChar(cadena, c));

		cadena = "PaTAtA";
		c = 'x';
		System.out.println(cadena + " [" + c + "] => " + numVecesChar(cadena, c));

	}

	private static void ej10() {
		/*
		 * Realizar y probar un método “quitaEspacios(String):String”, que dado un
		 * String, me devuelva el mismo String, pero sin espacios en blanco.
		 */
		String cadena;
		System.out.println();
		System.out.println("============ EJ10 ================");
		System.out.println("======== QUITA ESPACIOS ==========");

		cadena = "  Patatas             Fritas         ";
		System.out.println(cadena + " => \n" + quitaEspacios(cadena));

		cadena = "asdji oiajsd     sjidjs s & / 0 1 2 3";
		System.out.println(cadena + " => \n" + quitaEspacios(cadena));

		cadena = "igualQueLaOriginal";
		System.out.println(cadena + " => \n" + quitaEspacios(cadena));
	}

	private static void ej11() {
		/*
		 * Realizar y probar un método “reves(String):String”, que dado un String, me
		 * devuelva el mismo String, pero al revés.
		 */
		String cadena;
		System.out.println();
		System.out.println("============ EJ11 ================");
		System.out.println("======== REVÉS ==========");

		cadena = "Algo"; // "oglA"
		System.out.println(cadena + " => \n" + reves(cadena));

		cadena = "Dábale arroz a la zorra el abad"; // "oglA"
		System.out.println(cadena + " => \n" + reves(cadena));

	}

	private static void ej12() {
		/*
		 * Realizar y probar un método “charAMay(String,char):String”, que dado un
		 * String, devuelva el mismo String, en el que las apariciones del char
		 * proporcionado han sido sustituidas por ese mismo char, pero en mayúsculas (si
		 * no lo estuviera).
		 */
		String cadena;
		char caracter;
		System.out.println();
		System.out.println("============ EJ12 ================");
		System.out.println("======== A MAYÚSCULAS  ==========");

		cadena = "xXxXaAaAbBbB";
		caracter = 'a';
		System.out.println(cadena + " [" + caracter + "] => " + charAMay(cadena, caracter));

		cadena = "xXxXaAaAbBbB";
		caracter = 'B';
		System.out.println(cadena + " [" + caracter + "] => " + charAMay(cadena, caracter));

		cadena = "xXxXaAaAbBbB";
		caracter = 'f';
		System.out.println(cadena + " [" + caracter + "] => " + charAMay(cadena, caracter));
	}

	private static void ej13() {
		/*
		 * Realizar y probar un método “vocAMay(String):String”, que dado un String,
		 * devuelva el mismo String, en el que todas las vocales que contenga aparezcan
		 * en mayúsculas.
		 */
		String cadena;
		System.out.println();
		System.out.println("============ EJ13 ================");
		System.out.println("======== VOCALES A MAYÚSCULAS  ==========");

		cadena = "xXxXaAaAbBbBeEeE";
		System.out.println(cadena + " => " + vocAMay(cadena));

	}

	private static void ej14() {
		/*
		 * Realizar y probar un método “vocalizacion(String,char):String”, que dado un
		 * String, devuelva otro en el que aparecen sustituidas todas las vocales que
		 * contenga, por el char proporcionado.
		 */
		String cadena;
		char caracter;
		System.out.println();
		System.out.println("============ EJ14 ================");
		System.out.println("======== VOCALIZACIÓN ==========");

		cadena = "zabecidofug ZABECIDOFUG";
		caracter = 'x';
		System.out.println(cadena + " [" + caracter + "]=> " + vocalizacion(cadena, caracter));

		cadena = "zabecidofug ZABECIDOFUG";
		caracter = '*';
		System.out.println(cadena + " [" + caracter + "]=> " + vocalizacion(cadena, caracter));
	}

	private static void ej15() {
		/*
		 * Realizar y probar un método “generoYNumero(String):String”, que dado un
		 * String, devuelva otro String cuyos valores pueden ser “masculino singular”,
		 * “masculino plural”, “femenino singular” o “femenino plural”, en función de la
		 * terminación del String inicial. Hágase para casos básicos de sustantivos
		 * “regulares”
		 */
		String cadena;
		System.out.println();
		System.out.println("============ EJ15 ================");
		System.out.println("======== GÉNERO Y NÚMERO ==========");

		cadena = "perrO";
		System.out.println(cadena + "  => " + generoYNumero(cadena));

		cadena = "perrOs";
		System.out.println(cadena + "  => " + generoYNumero(cadena));

		cadena = "peRra";
		System.out.println(cadena + "  => " + generoYNumero(cadena));

		cadena = "pErrAS";
		System.out.println(cadena + "  => " + generoYNumero(cadena));

		cadena = "SaltAR";
		System.out.println(cadena + "  => " + generoYNumero(cadena));

	}

	private static void ej16() {
		/*
		 * Realizar y probar un método “quitaTildes(String):String”, que dado un String
		 * me devuelva el mismo, pero sin tildes en las vocales que pudiera contener.
		 * Para averiguar los códigos de ASCII extendido correspondientes con las
		 * tildes, ajustar el ejercicio 1 para mostrar los códigos desde el 128 hasta el
		 * 255.
		 * 
		 */
		String cadena;
		System.out.println();
		System.out.println("============ EJ15 ================");
		System.out.println("======== QUITA TILDES ==========");

		cadena = "-x-aeiou-X-";
		System.out.println(cadena + "  => " + quitaTildes(cadena));

		cadena = "-x-AEIOU-X-";
		System.out.println(cadena + "  => " + quitaTildes(cadena));

		cadena = "-x-áéíóú-X-";
		System.out.println(cadena + "  => " + quitaTildes(cadena));

		cadena = "-x-ÁÉÍÓÚ-X-";
		System.out.println(cadena + "  => " + quitaTildes(cadena));
	}

	private static String quitaTildes(String cadena) {
		String solucion = "";
		for (int i=0;i<cadena.length();i++) {
			solucion += quitaTilde(cadena.charAt(i));
		}
		return solucion;
	}

	private static char quitaTilde(char caracter) {
		char solucion='.';
		switch (caracter) {
			case 'á': solucion = 'a';break;
			case 'é': solucion = 'e';break;
			case 'í': solucion = 'i';break;
			case 'ó': solucion = 'o';break;
			case 'ú': solucion = 'u';break;
			case 'Á': solucion = 'A';break;
			case 'É': solucion = 'E';break;
			case 'Í': solucion = 'I';break;
			case 'Ó': solucion = 'O';break;
			case 'Ú': solucion = 'U';break;
			default: solucion = caracter;
		}
		return solucion;
	}

	private static String generoYNumero(String cadena) {
		String solucion = "indefinido";

		String cadenaEnMinuscula = cadena.toLowerCase();
		char ultimaLetra = cadenaEnMinuscula.charAt(cadena.length() - 1);
		String ultimosDosCaracteres = cadenaEnMinuscula.substring(cadena.length() - 2, cadena.length());

		if (ultimaLetra == 'o') {
			solucion = "masculino singular";
		}
		if (ultimaLetra == 'a') {
			solucion = "femenino singular";
		}
		if (ultimosDosCaracteres.equals("os")) {
			solucion = "masculino plural";
		}
		if (ultimosDosCaracteres.equals("as")) {
			solucion = "femenino plural";
		}
		return solucion;
	}

	private static String vocalizacion(String cadena, char caracter) {
		String solucion = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			solucion += esVocal(caracterActual) ? caracter : caracterActual;
		}
		return solucion;
	}

	private static String vocAMay(String cadena) {
		String solucion = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			solucion += esVocal(caracterActual) ? aMayuscula(caracterActual) : caracterActual;
		}
		return solucion;
	}

	private static String charAMay(String cadena, char caracter) {
		String solucion = "";
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			solucion += (aMinuscula(caracterActual) == aMinuscula(caracter) ? aMayuscula(caracterActual)
					: caracterActual);
		}
		return solucion;
	}

	private static String reves(String cadena) {
		String solucion = "";
		/*
		 * for (int i = cadena.length() - 1; i >= 0; i--) { solucion = solucion +
		 * cadena.charAt(i); }
		 */
		for (int i = 0; i < cadena.length(); i++) {
			solucion = cadena.charAt(i) + solucion;
		}
		return solucion;
	}

	private static String quitaEspacios(String cadena) {
		String solucion = "";
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (c != ' ') {
				solucion += c;
			}
		}
		return solucion;
	}

	private static int numVecesChar(String cadena, char c) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (aMinuscula(cadena.charAt(i)) == aMinuscula(c)) {
				contador++;
			}
		}
		return contador;
	}

	private static int numMinusculas(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (esMinuscula(cadena.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}

	private static int numMayusculas(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (esMayuscula(cadena.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}

	private static int numVocales(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			contador += esVocal(cadena.charAt(i)) ? 1 : 0;
		}
		return contador;
	}

	private static char aMinuscula(char c) {

		char solucion = c;
		if (esMayuscula(c)) {
			solucion = (char) (c + 32);
		}
		return solucion;
	}

	private static char aMayuscula(char c) {
		char solucion = c;
		if (esMinuscula(c)) {
			solucion = (char) (c - 32);
		}
		return solucion;
	}

	private static boolean esMinuscula(char c) { // 97 <= c <= 122
		return c >= 97 && c <= 122;
	}

	private static boolean esMayuscula(char c) { // 65 <= c <= 90
		return c >= 65 && c <= 90;
	}

	private static boolean esVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'á' || c == 'é' || c == 'í' || c == 'ó'
				|| c == 'ú' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Á' || c == 'É'
				|| c == 'Í' || c == 'Ó' || c == 'Ú' || c == 'Ü' || c == 'ü';
	}
}
